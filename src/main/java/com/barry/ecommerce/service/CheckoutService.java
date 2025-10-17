package com.barry.ecommerce.service;

import com.barry.ecommerce.dto.Purchase;
import com.barry.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
