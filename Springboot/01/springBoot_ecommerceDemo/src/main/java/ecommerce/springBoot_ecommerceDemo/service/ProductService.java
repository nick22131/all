//package ecommerce.springBoot_ecommerceDemo.service;
//
//import ecommerce.springBoot_ecommerceDemo.entity.Category;
//import ecommerce.springBoot_ecommerceDemo.entity.Product;
//import ecommerce.springBoot_ecommerceDemo.exception.ResourceNotFoundException;
//import ecommerce.springBoot_ecommerceDemo.payload.ProductDTO;
//import ecommerce.springBoot_ecommerceDemo.repository.CategoryRepository;
//import ecommerce.springBoot_ecommerceDemo.repository.ProductRepository;
//import lombok.RequiredArgsConstructor;
//import org.modelmapper.ModelMapper;
//import org.springframework.stereotype.Service;
//
//import java.math.BigDecimal;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//@RequiredArgsConstructor
//public class ProductService {
//    private final ProductRepository productRepository;
//    private final CategoryRepository categoryRepository;
//    private ModelMapper modelMapper;
//
//    public ProductDTO createProduct(ProductDTO productDTO){
//        Category category = categoryRepository.findById(productDTO.getCategoryId())
//                .orElseThrow(()->new ResourceNotFoundException("Category", "id", productDTO.getCategoryId()));
//
//        Product product = modelMapper.map(productDTO, Product.class);
//        product.setCategory(category);
//        Product savedProduct = productRepository.save(product);
//        return modelMapper.map(savedProduct, ProductDTO.class);
//    }
//
//    public List<ProductDTO> getProductsByCategory(String categoryName){
//        List<Product> products = productRepository.findByCategoryName(categoryName);
//        return products.stream()
//                .map(product -> modelMapper.map(product, ProductDTO.class))
//                .collect(Collectors.toList());
//    }
//
//    public List<ProductDTO> searchProduct(String keyword){
//        List<Product> products = productRepository.searchProducts(keyword);
//        return products.stream()
//                .map(product-> modelMapper.map(product, ProductDTO.class))
//                .collect(Collectors.toList());
//    }
//    public List<ProductDTO> getProductInPriceRange(BigDecimal minPrice, BigDecimal maxPrice){
//        List<Product> products = productRepository.findByPriceRange(minPrice, maxPrice);
//        return products.stream()
//                .map(product -> modelMapper.map(product, ProductDTO.class))
//                .collect(Collectors.toList());
//    }
//}



package ecommerce.springBoot_ecommerceDemo.service;

import ecommerce.springBoot_ecommerceDemo.payload.ProductDTO;
import ecommerce.springBoot_ecommerceDemo.entity.Product;
import ecommerce.springBoot_ecommerceDemo.exception.ResourceNotFoundException;
import ecommerce.springBoot_ecommerceDemo.repository.ProductRepository;
import ecommerce.springBoot_ecommerceDemo.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    // Get all products (with pagination)
    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // Search products by keyword
    public List<ProductDTO> searchProducts(String keyword) {
        List<Product> products = productRepository.searchProducts(keyword);
        return products.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // Get products within price range
    public List<ProductDTO> getProductsInPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        List<Product> products = productRepository.findByPriceBetween(minPrice, maxPrice);
        return products.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // Get products by category
    public List<ProductDTO> getProductsByCategory(String categoryName) {
        List<Product> products = productRepository.findByCategoryName(categoryName);
        return products.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // Get single product by ID
    public ProductDTO getProductById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
        return convertToDTO(product);
    }

    // Create new product
    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = convertToEntity(productDTO);
        Product savedProduct = productRepository.save(product);
        return convertToDTO(savedProduct);
    }

    // Update product
    public ProductDTO updateProduct(Long id, ProductDTO productDTO) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));

        modelMapper.map(productDTO, product);
        Product updatedProduct = productRepository.save(product);
        return convertToDTO(updatedProduct);
    }

    // Delete product
    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
        productRepository.delete(product);
    }

    // Helper methods
    private ProductDTO convertToDTO(Product product) {
        return modelMapper.map(product, ProductDTO.class);
    }

    private Product convertToEntity(ProductDTO productDTO) {
        return modelMapper.map(productDTO, Product.class);
    }
}