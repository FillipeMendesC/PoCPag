package com.csf.apiPag.dto;

import com.csf.apiPag.dto.CheckoutDto.LinksDto;

import java.util.List;

public record GetAllCheckoutsDto(
        String id,
        List<LinksDto> links
) { }
