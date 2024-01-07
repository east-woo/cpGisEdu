package com.wavus.apigis.api.externalApi.web;

import com.wavus.apigis.api.externalApi.service.ExternalApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/external")
public class ExternalApiController {

    private final ExternalApiService externalApiService;


    public ExternalApiController(ExternalApiService externalApiService) {
        this.externalApiService = externalApiService;
    }

    @GetMapping("/getCovidApiKey")
    public String getCovidApiKey(@RequestParam String username) {
        return externalApiService.fetchDataFromExternalApi();
    }
}