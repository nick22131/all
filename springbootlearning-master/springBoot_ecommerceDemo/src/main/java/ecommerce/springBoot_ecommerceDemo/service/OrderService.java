package ecommerce.springBoot_ecommerceDemo.service;

import ecommerce.springBoot_ecommerceDemo.entity.*;
import ecommerce.springBoot_ecommerceDemo.exception.BusinessException;
import ecommerce.springBoot_ecommerceDemo.exception.ResourceNotFoundException;
import ecommerce.springBoot_ecommerceDemo.payload.MonthlySalesDTO;
import ecommerce.springBoot_ecommerceDemo.payload.OrderDTO;
import ecommerce.springBoot_ecommerceDemo.payload.OrderRequest;
import ecommerce.springBoot_ecommerceDemo.repository.CustomerRepository;
import ecommerce.springBoot_ecommerceDemo.repository.OrderRepository;
import ecommerce.springBoot_ecommerceDemo.repository.ProductRepository;
import ecommerce.springBoot_ecommerceDemo.repository.ShoppingCartRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.boot.web.servlet.filter.OrderedRequestContextFilter;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;
    private final ShoppingCartRepository shoppingCartRepository;
    private final ModelMapper modelMapper;

    public OrderDTO placeOrder(Long customerId, OrderRequest orderRequest) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer", "id", customerId));

        ShoppingCart cart = shoppingCartRepository.findByCustomer(customer)
                .orElseThrow(() -> new ResourceNotFoundException("ShoppingCart", "customerId", customerId));

        if (cart.getItems().isEmpty()) {
            throw new BusinessException("Cannot place order with empty cart");
        }

        Order order = new Order();
        order.setCustomer(customer);
        order.setOrderDate(LocalDateTime.now());



        BigDecimal totalAmount = BigDecimal.ZERO;

        for (CartItem cartItem : cart.getItems()) {
            OrderItem orderItem = new OrderItem();
            orderItem.setOrder(order);
            orderItem.setProduct(cartItem.getProduct());
            orderItem.setQuantity(cartItem.getQuantity());
            orderItem.setPrice(cartItem.getProduct().getPrice());

            totalAmount = totalAmount.add(
                    cartItem.getProduct().getPrice().multiply(BigDecimal.valueOf(cartItem.getQuantity())));

            // Update product stock
            Product product = cartItem.getProduct();
            product.setStockQuantity(product.getStockQuantity() - cartItem.getQuantity());
            productRepository.save(product);

            order.getOrderItems().add(orderItem);
        }

        order.setTotalAmount(totalAmount);
        Order savedOrder = orderRepository.save(order);

        // Clear the shopping cart
        cart.getItems().clear();
        cart.setTotal(BigDecimal.ZERO);
        shoppingCartRepository.save(cart);

        return modelMapper.map(savedOrder, OrderDTO.class);
    }

    public List<OrderDTO> getCustomerOrders(Long customerId) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer", "id", customerId));

        List<Order> orders = orderRepository.findByCustomerEmail(customer.getEmail());
        return orders.stream()
                .map(order -> modelMapper.map(order, OrderDTO.class))
                .collect(Collectors.toList());
    }

    public List<MonthlySalesDTO> getMonthlySalesReport(int year) {
        List<Object[]> results = orderRepository.getMonthlySales(year);
        return results.stream()
                .map(result -> new MonthlySalesDTO((Integer) result[0], (BigDecimal) result[1]))
                .collect(Collectors.toList());
    }

    // Other service methods...
}
