package com.springService.LightWallService.controllers;

import com.springService.LightWallService.services.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private CommonService commonService;


    @GetMapping("/get")
    public String common() {
        return commonService.commonGuest();
    }

}
