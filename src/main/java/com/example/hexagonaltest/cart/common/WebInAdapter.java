package com.example.hexagonaltest.cart.common;

import org.springframework.stereotype.Indexed;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Indexed
public @interface WebInAdapter {
    String value() default "";
}
