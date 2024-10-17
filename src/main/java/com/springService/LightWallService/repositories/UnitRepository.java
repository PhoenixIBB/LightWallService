package com.springService.LightWallService.repositories;

import com.springService.LightWallService.entities.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository <Unit, Integer> {
}
