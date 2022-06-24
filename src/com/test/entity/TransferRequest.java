package com.test.entity;

import java.util.List;

public class TransferRequest  {
    private Integer id;
    private String relocationType;
    private List<Animal> animals;

    private List<Integer> tasksIds;

    public Integer getId() {
        return id;
    }

    public TransferRequest setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getRelocationType() {
        return relocationType;
    }

    public TransferRequest setRelocationType(String relocationType) {
        this.relocationType = relocationType;
        return this;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public TransferRequest setAnimals(List<Animal> animals) {
        this.animals = animals;
        return this;
    }

    public List<Integer> getTasksIds() {
        return tasksIds;
    }

    public TransferRequest setTasksIds(List<Integer> tasksIds) {
        this.tasksIds = tasksIds;
        return this;
    }
}
