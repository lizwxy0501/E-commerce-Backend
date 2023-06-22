package dev.liz.ecommerce.service;

import dev.liz.ecommerce.dto.Purchase;
import dev.liz.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
