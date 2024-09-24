package com.enigma.majumundur.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record UpdateProductRequest(

        @NotBlank(message = "Product id is required")
        String id,

        @NotBlank(message = "Product name is required")

        String name,
        @Min(value = 0, message = "Product price must be greater than 0")

        Long price,
        @Min(value = 0, message = "Product stock must be greater than 0")
        Integer stock,

        @NotBlank(message = "Merchant id is required")
        String userAccountId
) {
}
