package com.csf.apiPag.dto.CheckoutDto;

import jakarta.validation.constraints.NotNull;

/**
 * DTO for {@link com.csf.apiPag.entity.Box}
 */
public record BoxDto(
        Long id,
        @NotNull String weight,
        @NotNull DimesionsObjectDto dimesionsObject)
{ }