package ecommerce.springBoot_ecommerceDemo.controller;

import ecommerce.springBoot_ecommerceDemo.payload.MonthlySalesDTO;
import ecommerce.springBoot_ecommerceDemo.payload.OrderDTO;
import ecommerce.springBoot_ecommerceDemo.payload.OrderRequest;
import ecommerce.springBoot_ecommerceDemo.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/place/{customerId}")
    public ResponseEntity<OrderDTO> placeOrder(
            @PathVariable Long customerId,
            @Valid @RequestBody OrderRequest orderRequest) {
        return new ResponseEntity<>(orderService.placeOrder(customerId, orderRequest), HttpStatus.CREATED);
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<OrderDTO>> getCustomerOrders(@PathVariable Long customerId) {
        return ResponseEntity.ok(orderService.getCustomerOrders(customerId));
    }

    @GetMapping("/sales-report")
    public ResponseEntity<List<MonthlySalesDTO>> getMonthlySalesReport(
            @RequestParam int year) {
        return ResponseEntity.ok(orderService.getMonthlySalesReport(year));
    }

    // Other endpoints...
}