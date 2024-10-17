package com.springService.LightWallService.repositories;

import com.springService.LightWallService.entities.Validator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ValidatorRepository extends JpaRepository<Validator, Integer> {
}
