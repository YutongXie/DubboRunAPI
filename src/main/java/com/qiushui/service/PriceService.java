package com.qiushui.service;

import com.qiushui.module.ProductPrice;

public interface PriceService {

    ProductPrice getProductPrice(String productName, int date);
}
