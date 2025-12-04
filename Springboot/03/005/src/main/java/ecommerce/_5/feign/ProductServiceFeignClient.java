package ecommerce._5.feign;

import ecommerce._5.payload.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name  = "product-service")
public interface ProductServiceFeignClient {
    @GetMapping("api/products")
    public List<ProductDto> getAllProducts();

    
}
