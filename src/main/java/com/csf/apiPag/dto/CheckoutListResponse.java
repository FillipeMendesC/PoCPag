package com.csf.apiPag.dto;

import com.csf.apiPag.dto.CheckoutDto.LinksDto;

import java.util.List;

public record CheckoutListResponse(
        List<GetAllCheckoutsDto> checkouts,
        List<LinksDto> links
) { }
