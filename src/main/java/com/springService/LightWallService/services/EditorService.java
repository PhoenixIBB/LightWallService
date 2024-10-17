package com.springService.LightWallService.services;

import com.springService.LightWallService.entities.Editor;
import com.springService.LightWallService.repositories.EditorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorService {

    @Autowired
    private EditorRepository editorRepository;

    public String editor() {
        return "<h2> Редакторский привет! </h2>";
    }

    public List<Editor> getAllEditorsService() {
        return editorRepository.findAll();
    }

    public Editor getEditorByIdService(int id) {
        return editorRepository.findById(id).orElse(null);
    }

    public Editor saveEditorService(Editor editor) {
        return editorRepository.save(editor);
    }

    public void deleteEditorService(int id) {
        editorRepository.deleteById(id);
    }

}