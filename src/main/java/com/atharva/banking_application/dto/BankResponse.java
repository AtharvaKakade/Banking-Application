package com.atharva.banking_application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankResponse {
    private String responseCode;
    private String responseMessage;
    private AccountInfo accountInfo;
}