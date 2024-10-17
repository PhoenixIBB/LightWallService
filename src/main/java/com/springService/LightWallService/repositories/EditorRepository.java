package com.springService.LightWallService.repositories;

import com.springService.LightWallService.entities.Editor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorRepository extends JpaRepository <Editor,Integer> {
}
