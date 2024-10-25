package com.alok.loans.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "loans")
public record LoansContactInfoDto(String message, Map<String,String> contactDetails, Map<String,String> onCallSupport) {
}
