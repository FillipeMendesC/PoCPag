package com.csf.apiPag.dto.CheckoutDto;

import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;

/**
 * DTO for {@link com.csf.apiPag.entity.Links}
 */
public record LinksDto(
        @NotBlank String rel,
        @NotBlank String href,
        @NotBlank String method)
{ }