package com.pabbraga.peritech.config;

import com.pabbraga.peritech.entities.*;
import com.pabbraga.peritech.entities.enums.OrderStatus;
import com.pabbraga.peritech.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile(value = "dev")
public class DevConfig implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderItemRepository orderItemRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        Product p1 = new Product(null, "Fone De Ouvido Headphone Multilaser Preto Pop Ph246", "Lorem ipsum dolor sit amet, consectetur.", "headphone", 69.30, 0, "../img/headsetmulti.jpeg");
        Product p2 = new Product(null, "Fone De Ouvido Headphone Multilaser Preto Pop Ph246", "Lorem ipsum dolor sit amet, consectetur.", "headphone",69.30, 0, "../img/headsetmulti.jpeg");
        productRepository.saveAll(Arrays.asList(p1, p2));

        User u1 = new User(null, "Alex Green", "alex@gmail.com", "123456");
        userRepository.save(u1);

        Order o1 = new Order(null, Instant.now(), OrderStatus.PAID, u1);
        orderRepository.save(o1);

        OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
        orderItemRepository.save(oi1);

        Payment pay1 = new Payment(null, Instant.now(), o1);
        o1.setPayment(pay1);
        orderRepository.save(o1);

    }

}
