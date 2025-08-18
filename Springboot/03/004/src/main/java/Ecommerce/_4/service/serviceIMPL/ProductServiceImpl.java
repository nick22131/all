package Ecommerce._4.service.serviceIMPL;

import Ecommerce._4.entity.Product;
import Ecommerce._4.exception.ResourceNotFoundException;
import Ecommerce._4.payload.ProductDto;
import Ecommerce._4.repository.ProductRepository;
import Ecommerce._4.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product = modelMapper.map(productDto,Product.class);
        Product savedProduct = productRepository.save(product);
        ProductDto savedProductDto = modelMapper.map(savedProduct, ProductDto.class);
        return savedProductDto;
    }

    @Override
    public ProductDto getProductById(Long productId){
        Product product = productRepository.findById(productId)
                .orElseThrow(()-> new ResourceNotFoundException("product" , "productId", productId.toString() ));
        ProductDto productDto = modelMapper.map(product,ProductDto.class);
        return productDto;
    }

    @Override
    public List<ProductDto>  getAllProduct(){
        List<Product> products = productRepository.findAll();
        List<ProductDto> productDtos = products.
                                       stream().
                                           map((product)->modelMapper.map(product, ProductDto.class) ).
                                            collect(Collectors.toList());
        return productDtos;
    }

    @Override
    public ProductDto updateProduct(Long productId, ProductDto productDto){
        Product product = productRepository.findById(productId)
                .orElseThrow(()-> new ResourceNotFoundException("Product", "productId",productId.toString()));
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        Product savedProduct = productRepository.save(product);
        ProductDto savedProductDto = modelMapper.map(savedProduct,ProductDto.class);
        return savedProductDto;
    }

    @Override
    public void deleteProduct (Long productId){
    Product product = productRepository.findById(productId)
            .orElseThrow(()-> new ResourceNotFoundException("Product", "productId",productId.toString() ));
       productRepository.delete(product);
    }


}
