package com.csf.apiPag.dto.CheckoutDto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * DTO for {@link com.csf.apiPag.entity.Address}
 */
public record AddressDto(Long id, @NotBlank @Length(max = 160) String street, @NotBlank @Length(max = 20) String number,
                         String complement, @NotBlank @Length(max = 60) String locality,
                         @NotBlank @Length(max = 60) String city, @NotBlank String region_code,
                         @NotBlank String country,
                         @NotBlank @Length(min = 8, max = 8) String postal_code) implements Serializable {
}