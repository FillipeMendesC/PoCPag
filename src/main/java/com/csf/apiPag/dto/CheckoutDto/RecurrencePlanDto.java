package com.csf.apiPag.dto.CheckoutDto;

public record RecurrencePlanDto(
        String name,
        Integer billing_cyle,
        RecurrancePlanIntervalDto interval
) {
}
