package com.wavus.apigis.api.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ExternalApiConfig {

    private final String apiUrl;
    private final String apiKey;

    public ExternalApiConfig(
            @Value("${external.api.url}") String apiUrl,
            @Value("${external.api.key}") String apiKey) {
        this.apiUrl = apiUrl;
        this.apiKey = apiKey;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}