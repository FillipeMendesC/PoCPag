package com.csf.apiPag.dto;

import com.csf.apiPag.dto.CheckoutDto.LinksDto;
import com.csf.apiPag.entity.Checkout;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * DTO for {@link Checkout}
 */
public record ActivateInactivateCheckoutDto(
        @NotBlank String id,
        @NotBlank String status,
        @NotNull LinksDto links
    )
{ }