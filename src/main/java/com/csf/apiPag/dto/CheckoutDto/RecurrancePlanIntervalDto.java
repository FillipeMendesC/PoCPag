package com.csf.apiPag.dto.CheckoutDto;

import com.csf.apiPag.enums.recurrancePlanUnit.RecurranceUnit;

public record RecurrancePlanIntervalDto(
        RecurranceUnit unit,
        Integer length
) {

}
