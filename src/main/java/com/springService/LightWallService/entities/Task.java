package com.springService.LightWallService.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String correctness;
    private int graphics;
    private String note;
    private boolean uninformative;
    @Column(name = "task_number")
    private int taskNumber;



    @ManyToOne
    @JoinColumn(name = "editor_id")
    private Editor editor;

    @ManyToOne
    @JoinColumn(name = "validator_id")
    private Validator validator;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Unit> units;

    public Task() {
    }

    public Task(Integer taskNumber) {
        this.taskNumber = taskNumber;
    }

    public Task(Integer taskNumber, int number) {
        this.taskNumber = taskNumber;

    }

    public Task(Integer taskNumber, int number, String correctness) {
        this.taskNumber = taskNumber;
        this.correctness = correctness;
    }

    public Task(Integer taskNumber, int number, String correctness, List<Unit> units) {
        this.taskNumber = taskNumber;
        this.correctness = correctness;
        this.units = units;
    }

    public Task(Integer taskNumber, int number, String correctness, List<Unit> units, String note) {
        this.taskNumber = taskNumber;
        this.correctness = correctness;
        this.units = units;
        this.note = note;
    }

    public Task(Integer taskNumber, int number, String correctness, List<Unit> units, String note, int graphics) {
        this.taskNumber = taskNumber;
        this.correctness = correctness;
        this.units = units;
        this.note = note;
        this.graphics = graphics;
    }

    public Task(Integer taskNumber, int number, String correctness, List<Unit> units, String note, int graphics, boolean uninformative) {
        this.taskNumber = taskNumber;
        this.correctness = correctness;
        this.units = units;
        this.note = note;
        this.graphics = graphics;
        this.uninformative = uninformative;
    }

    // Геттеры

    public int getId() {
        return id;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public String getCorrectness() {
        return correctness;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public String getNote() {
        return note;
    }

    public int getGraphics() {
        return graphics;
    }

    public boolean isUninformative() {
        return uninformative;
    }


    // Сеттеры

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public void setCorrectness(String correctness) {
        this.correctness = correctness;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setGraphics(int graphics) {
        this.graphics = graphics;
    }

    public void setUninformative(boolean uninformative) {
        this.uninformative = uninformative;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addUnit(Unit unit) {
        this.units.add(unit);
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName=" + taskNumber +
                ", correctness='" + correctness + '\'' +
                ", units=" + units +
                ", note='" + note + '\'' +
                ", graphics=" + graphics +
                ", uninformative=" + uninformative +
                '}';
    }
}
