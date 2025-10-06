package com.csf.apiPag.dto;

import com.csf.apiPag.entity.Checkout;

import java.util.List;

public record getCheckoutDto(
        List<Checkout> checkouts
) { }
