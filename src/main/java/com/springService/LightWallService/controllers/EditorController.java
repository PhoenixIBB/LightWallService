package com.springService.LightWallService.controllers;

import com.springService.LightWallService.services.EditorService;
import com.springService.LightWallService.entities.Editor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/editor")
public class EditorController {

    @Autowired
    public EditorService editorService;

    @GetMapping("/get")
    public String validator() {
        return editorService.editor();
    }


}
