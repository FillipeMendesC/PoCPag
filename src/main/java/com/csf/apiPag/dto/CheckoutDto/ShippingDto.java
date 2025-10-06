package com.csf.apiPag.dto.CheckoutDto;

import com.csf.apiPag.enums.shipping.ShippingServiceType;
import com.csf.apiPag.enums.shipping.ShippingType;

import java.io.Serializable;

/**
 * DTO for {@link com.csf.apiPag.entity.Shipping}
 */
public record ShippingDto(
        ShippingType type,
        ShippingServiceType service_type,
        Boolean address_modifiable,
        Integer amount, AddressDto address,
        BoxDto box) implements Serializable {
}