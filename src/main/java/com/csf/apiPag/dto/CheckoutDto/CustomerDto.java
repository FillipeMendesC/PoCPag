package com.csf.apiPag.dto.CheckoutDto;

public record CustomerDto(
   String name,
   String email,
   String tax_id,
   PhoneDto phoneDTO
) {}
