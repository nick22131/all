package Ecommerce._4.service.serviceIMPL;

import Ecommerce._4.entity.Order;
import Ecommerce._4.entity.OrderItem;
import Ecommerce._4.entity.Product;
import Ecommerce._4.entity.User;
import Ecommerce._4.exception.ResourceNotFoundException;
import Ecommerce._4.payload.OrderDto;
import Ecommerce._4.payload.OrderItemDto;
import Ecommerce._4.repository.OrderRepository;
import Ecommerce._4.repository.ProductRepository;
import Ecommerce._4.repository.UserRepository;
import Ecommerce._4.service.OrderService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public OrderDto createOrder(OrderDto orderDto){
        User user = userRepository.findById(orderDto.getUserId())
                .orElseThrow(()-> new ResourceNotFoundException( "User", "id", orderDto.getUserId().toString()));
        Order order = new Order();
        order.setUser(user);
        order.setOrderDate(LocalDateTime.now());
        order.setStatus("CREATED");

        for (OrderItemDto itemDto : orderDto.getItems()){
            Product product = productRepository.findById(itemDto.getProductId())
                    .orElseThrow(()-> new ResourceNotFoundException("Product", "ProductId",itemDto.getProductId().toString()));

            OrderItem item = new OrderItem();
            item.setProduct(product);
            item.setQuantity(itemDto.getQuantity());
            item.setPrice(product.getPrice() * itemDto.getQuantity());
            item.setOrder(order);
            order.getItems().add(item);

        }

        Order savedOrder = orderRepository.save(order);
        OrderDto savedOrderDto = modelMapper.map(savedOrder,OrderDto.class) ;
        return savedOrderDto;

    }


    @Override
    public List<OrderDto> getUserOrders(Long userId){
        List<Order> orders = orderRepository.findOrdersWithItemsByUser(userId);
        List<OrderDto> orderDtos = orders.stream()
                                          .map((order)-> modelMapper.map(order,OrderDto.class))
                                          .collect(Collectors.toList());
        return orderDtos;
    }





}
