package com.csf.apiPag.dto.CheckoutDto;

import com.csf.apiPag.enums.paymentMethod.PaymentMethodEnum;
import com.csf.apiPag.validator.AllowedPaymentMethod.AllowedPaymentMethod;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record PaymentMethodsConfigsDto(
        @NotNull
        @AllowedPaymentMethod
        PaymentMethodEnum type,

        @NotNull
        List<ConfigOptionDto> configs
) {
}
