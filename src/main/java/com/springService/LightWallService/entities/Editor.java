package com.springService.LightWallService.entities;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.List;

@Entity
public class Editor implements Comparable<Editor> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @OneToMany(mappedBy = "editor")
    private List<Task> tasks;

    public Editor() {
    }

    public Editor(int id) {
        this.id = id;
    }

    public Editor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Editor(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Editor(int id, String name, String surname, List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.tasks = tasks;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    // Сеттеры
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", tasks=" + tasks +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Editor editor = (Editor) o;
        return id == editor.id &&
                Objects.equals(name, editor.name) &&
                Objects.equals(surname, editor.surname) &&
                Objects.equals(tasks, editor.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, tasks);
    }

    @Override
    public int compareTo(Editor other) {
        return this.surname.compareTo(other.surname);
    }
}
