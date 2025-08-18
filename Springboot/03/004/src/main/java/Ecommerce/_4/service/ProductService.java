package Ecommerce._4.service;

import Ecommerce._4.payload.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto);
    ProductDto getProductById(Long productId);
    List<ProductDto> getAllProduct();
    ProductDto updateProduct(Long productId, ProductDto productDto);
    void deleteProduct(Long productId);
    List<ProductDto> createProducts(List<ProductDto>  productDtos);


}
