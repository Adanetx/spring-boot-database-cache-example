package com.javadeveloperzone.another;

public class Car {
    private long id;
    private String name;

    @Override
    public String toString() {
        return
                " id = " + id + '\'' +
                "  name='" + name + '\'' +
                " model='" + model + '\'' ;

    }

    public long getId() {
        return id;
    }

    public Car(long id) {
        this.id = id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Car(long id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String model;
}
