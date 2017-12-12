package com.kodilla.hibernate.tasklist;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {
    private int id;
    private String listName;
    private String description;
    private List<TaskList> tasks = new ArrayList<>();

    public TaskList() {
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }
    public List<TaskList> getTasks() {
        return tasks;
    }
    private void setId(int id) {
        this.id = id;
    }
    private void setListName(String listName) {
        this.listName = listName;
    }
    private void setDescription(String description) {
        this.description = description;
    }
    private void setTaskList(List<TaskList> tasks) {
        this.tasks = tasks;
    }
}
