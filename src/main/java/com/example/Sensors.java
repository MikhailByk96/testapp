package com.example;

import javax.persistence.*;

@Entity
@Table(name="sensors")
public class Sensors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "Name",nullable = false, length = 30)
    private String Name;
    @Column(name = "Model",nullable = false, length = 15)
    private String Model;
    @Column(name = "RangeFrom",nullable = false, length = 50)
    private double RangeFrom;
    @Column(name = "RangeTo",nullable = false, length = 50)
    private double RangeTo;
    @Column(name = "Type",nullable = false, length = 50)
    private String Type;
    @Column(name = "Unit",nullable = false, length = 50)
    private String Unit;
    @Column(name = "Location",nullable = false, length = 50)
    private String Location;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public double getRangeFrom() {
        return RangeFrom;
    }

    public void setRangeFrom(double rangeFrom) {
        RangeFrom = rangeFrom;
    }

    public double getRangeTo() {
        return RangeTo;
    }

    public void setRangeTo(double rangeTo) {
        RangeTo = rangeTo;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }




}
