package ecommerce._5.service;

import ecommerce._5.payload.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> createProducts(List<ProductDto> products);

    List<ProductDto> getAllProducts();

    ProductDto getProductById(Long id);

    ProductDto updateProduct(Long id, ProductDto productDto);

    void deleteProduct(Long id);
}
