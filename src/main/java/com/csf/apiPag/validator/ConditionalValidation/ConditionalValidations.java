package com.csf.apiPag.validator.ConditionalValidation;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ConditionalValidations {
    ConditionalValidation[] value();
}
