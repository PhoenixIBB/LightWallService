package com.springService.LightWallService.services;

import com.springService.LightWallService.entities.Validator;
import com.springService.LightWallService.repositories.ValidatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ValidatorService {

    @Autowired
    private ValidatorRepository validatorRepository;

    public String validator () {
        return "<h2> Привет, валидатор! </h2>";
    }

    public void saveValidators(List<Validator> validators)  {
        validatorRepository.saveAll(validators);
    }

    public List<Validator> getValidators() {
        return validatorRepository.findAll();
    }
}
