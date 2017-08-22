package com.example.gretel.todoapp.model;

/**
 * Created by gretel on 8/10/17.
 */

public class Task {

    private String id;
    private String task_name;
    private String due_date;
    private String notes;
    private int priority;
    private int status;

    public Task() {

    }

    public Task(String id, String task_name){
        this.id = id;
        this.task_name = task_name;
    }

    public Task(String id, String task_name, String due_date, String notes, int priority, int status){
        this.id = id;
        this.task_name = task_name;
        this.due_date = due_date;
        this.notes = notes;
        this.priority = priority;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
