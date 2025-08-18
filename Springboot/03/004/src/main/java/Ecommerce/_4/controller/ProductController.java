package Ecommerce._4.controller;

import Ecommerce._4.payload.ProductDto;
import Ecommerce._4.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor

public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(
           @RequestBody ProductDto productDto
    ){
        ProductDto savedProductDto = productService.createProduct(productDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProductDto);
    }


    @PostMapping
    public ResponseEntity<List<ProductDto>> createProducts(
            @RequestBody List<ProductDto> productDtos
    ){
        List<ProductDto> savedDtos = productService.createProducts(productDtos);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedDtos);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(
           @PathVariable("id") Long productId
    ){
        ProductDto productDto = productService.getProductById(productId);
        return ResponseEntity.ok().body(productDto);
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAllProducts(){
        List<ProductDto> productDtos = productService.getAllProduct() ;
        return ResponseEntity.ok().body(productDtos);
    }


    @PutMapping("/{id}")
    public ResponseEntity<ProductDto> updateProduct(
           @PathVariable("id") Long productId,
           @RequestBody ProductDto productDto
    ){
        ProductDto updatedDto = productService.updateProduct(productId,productDto   );
        return ResponseEntity.ok().body(updatedDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(
           @PathVariable("id") Long productId
    ){
        productService.deleteProduct(productId);
        return ResponseEntity.ok("deleted"  );
    }




}
