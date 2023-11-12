package com.example.todo_project;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;
    private Category category;

    public Task(){
        id = UUID.randomUUID();
        date = new Date();
        category = Category.DOM;
    }

    public UUID getID(){return this.id;}
    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}
    public void setDate(Date date){this.date = date;}
    public Date getDate(){return this.date;}
    public boolean getDone(){return this.done;}
    public void setDone(boolean done){this.done = done;}
    public void setCategory(Category category){this.category = category;}
    public Category getCategory(){return this.category;}
}
