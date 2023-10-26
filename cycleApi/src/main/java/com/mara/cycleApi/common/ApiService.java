package com.mara.cycleApi.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiService {

    @Value("${cycle.api.domain}")
    private String apiDomain;

    @Value("${cycle.api.key}")
    private String apiKey;

    public void getStation(){
        System.out.println(apiDomain);
    }

}
