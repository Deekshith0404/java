package com.xworks.collection.dto;

import java.io.Serializable;

public class SuperMarketDto implements Serializable {
    private String name;
    private String location;
    private int totalStaff;
    private int totalArea;
    private String managedBy;

    public SuperMarketDto(){

    }
    public SuperMarketDto(String name, String location, int totalStaff, int totalArea, String managedBy) {
        this.name = name;
        this.location = location;
        this.totalStaff = totalStaff;
        this.totalArea = totalArea;
        this.managedBy = managedBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public int getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(int totalArea) {
        this.totalArea = totalArea;
    }

    public String getManagedBy() {
        return managedBy;
    }

    public void setManagerName(String managedBy) {
        this.managedBy = managedBy;
    }

    @Override
    public String toString() {
        return "SuperMarketDto{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", totalStaff=" + totalStaff +
                ", totalArea=" + totalArea +
                ", managerName='" + managedBy + '\'' +
                '}';
    }

    public  String search(String location){
        return location;
    }

}


//
//name,location,totalStaff,totalArea,managerName
//find all by location
//find all by totalStaff greaterThan
//find all by totalArea and totalStaff
//print managerName
//print name