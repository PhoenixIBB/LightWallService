package com.springService.LightWallService.controllers;

import com.springService.LightWallService.services.ValidatorService;
import com.springService.LightWallService.entities.Validator;
import com.springService.LightWallService.entities.ValidatorRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/validator")
public class ValidatorController {
    @Autowired
    private ValidatorService validatorService;

    @GetMapping("/get")
    public String validator() {
        return validatorService.validator();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addValidators(@RequestBody ValidatorRequest request) {
        validatorService.saveValidators(request.getValidators());
        return ResponseEntity.ok("Validators added succesfully");
    }


    @GetMapping("/getall")
    public ResponseEntity<List<Validator>> getAllValidators(Model model) {
        List<Validator> validatorsList = validatorService.getValidators();
        return ResponseEntity.ok(validatorsList);
    }
}
