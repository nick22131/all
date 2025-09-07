package ecommerce._5.feign;

import ecommerce._5.payload.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name  = "product-service")
public interface ProductServiceFeignClient {
    @GetMapping("api/products")
    List<ProductDto> getAllProducts();

}
