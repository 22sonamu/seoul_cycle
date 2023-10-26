package com.mara.cycleApi.station.controller;

import com.mara.cycleApi.common.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/station")
public class StationController {

    @Autowired
    ApiService apiService;

    @GetMapping("/updateInfo")
    public void updateInfo(){
        apiService.getStation();
    }
}
