package com.xworks.collection.dto;

public class collegeDto {
    private String collegeName;

    public collegeDto(){
        System.out.println("no argument constructer ");
    }

    public collegeDto(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String
    toString() {
        return "collegeDto{" +
                "collegeName='" + collegeName + '\'' +
                '}';
    }
}
