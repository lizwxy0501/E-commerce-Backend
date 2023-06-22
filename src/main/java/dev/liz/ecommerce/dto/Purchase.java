package dev.liz.ecommerce.dto;

import dev.liz.ecommerce.entity.Address;
import dev.liz.ecommerce.entity.Customer;
import dev.liz.ecommerce.entity.Order;
import dev.liz.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
