package com.springService.LightWallService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String correctness;
    private String note;
    private String resolution;
    private boolean unitGraphics;
    private String unitContent;


    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    // Конструкторы
    public Unit() {
    }

    public Unit(String resolution) {
        this.resolution = resolution;
    }

    public Unit(String resolution, String note) {
        this.resolution = resolution;
        this.note = note;
    }

    public Unit(String resolution, String note, boolean unitGraphics) {
        this.resolution = resolution;
        this.note = note;
        this.unitGraphics = unitGraphics;
    }

    public Unit(String resolution, String note, boolean unitGraphics, String unitContent) {
        this.resolution = resolution;
        this.note = note;
        this.unitGraphics = unitGraphics;
        this.unitContent = unitContent;
    }

    public Unit(String resolution, String note, boolean unitGraphics, String unitContent, String correctness) {
        this.resolution = resolution;
        this.note = note;
        this.unitGraphics = unitGraphics;
        this.unitContent = unitContent;
        this.correctness = correctness;
    }

    public Unit(int unitNumber, String resolution, String note, boolean unitGraphics, String unitContent, String correctness) {
        this.resolution = resolution;
        this.note = note;
        this.unitGraphics = unitGraphics;
        this.unitContent = unitContent;
        this.correctness = correctness;
    }

    // Геттеры

    public String getResolution() {
        return resolution;
    }

    public String getNote() {
        return note;
    }

    public boolean getUnitGraphics() {
        return unitGraphics;
    }

    public String getUnitContent() {
        return unitContent;
    }

    public String getCorrectness() {
        return correctness;
    }

    public int getId() {
        return id;
    }

    public boolean isUnitGraphics() {
        return unitGraphics;
    }

    public Task getTask() {
        return task;
    }

    // Сеттеры

    public void setId(int id) {
        this.id = id;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setUnitGraphics(boolean unitGraphics) {
        this.unitGraphics = unitGraphics;
    }

    public void setUnitContent(String unitContent) {
        this.unitContent = unitContent;
    }

    public void setCorrectness(String correctness) {
        this.correctness = correctness;
    }


}
