package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskList1 {
    private String name;
    private List<Task1> task1List;

    public TaskList1(String name){
        this.name=name;
        this.task1List = new ArrayList<Task1>();

    }
    public void addTaskList(Task1 task){
        this.task1List.add(task);
    }
    public List<Task1> getTask1List(){
        return this.task1List;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void removeTask(String description){
        this.task1List = task1List.stream().filter(t->{//funicon Lambda
            return !t.getDescription().equals(description);
        }).collect(Collectors.toList());
    }
    public void printTasks(){
        this.task1List.forEach(task -> {
            System.out.println("descripcion: ");
            System.out.println(task.getDescription());
            System.out.println("fecha: ");
            System.out.println(task.getDueDate());
            System.out.println("realizada: ");
            System.out.println(task.getDone());
            System.out.println("---------------------");
        });
    }
}
