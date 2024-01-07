package com.wavus.apigis.api.externalApi.service;

import com.wavus.apigis.api.common.config.ExternalApiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExternalApiService {

    private final ExternalApiConfig externalApiConfig;

    public ExternalApiService(ExternalApiConfig externalApiConfig) {
        this.externalApiConfig = externalApiConfig;
    }

    public String fetchDataFromExternalApi() {
        String apiUrl = externalApiConfig.getApiUrl();
        String apiKey = externalApiConfig.getApiKey();

        // 실제로는 외부 API와 통신하는 로직을 작성

        return "TEST";
    }
}