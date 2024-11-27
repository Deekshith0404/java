package com.xworks.collection.dto;

import java.io.Serializable;

public class ApplicationDto implements Serializable {
    private int id;
    private String appName;
    private String appType;
    private String version;
    private int size;
    private String companyName;

    public ApplicationDto(){

    }

    public ApplicationDto(int id, String appName, String appType, String version, int size, String companyName) {
        this.id = id;
        this.appName = appName;
        this.appType = appType;
        this.version = version;
        this.size = size;
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "ApplicationDto{" +
                "id=" + id +
                ", appName='" + appName + '\'' +
                ", appType='" + appType + '\'' +
                ", version='" + version + '\'' +
                ", size=" + size +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
//
//ApplicationDTO(20): id,name,type,version,size,companyName
//print name and companyName
//print name and version and size
//find all by type