package com.springService.LightWallService.repositories;

import com.springService.LightWallService.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository <Task, Integer> {
}
