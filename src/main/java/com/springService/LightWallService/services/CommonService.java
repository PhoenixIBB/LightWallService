package com.springService.LightWallService.services;

import com.springService.LightWallService.repositories.CommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class CommonService {

    @Autowired
    public CommonRepository commonRepository;

    public String commonGuest() {
        return "<h2> Привет, гость! </h2>";
    }
}
