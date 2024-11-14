package com.xworks.CrudOperation.Doc;

public class Document {
    private String filename;
    private int fileSize;
    private String fileType;
    private int createdDay;



    public Document(){

    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public int getCreatedDay(int i) {
        return createdDay;
    }

    public void setCreatedDay(int createdDay) {
        this.createdDay = createdDay;
    }

    @Override
    public String toString() {
        return "Document{" +
                "filename='" + filename + '\'' +
                ", fileSize=" + fileSize +
                ", fileType='" + fileType + '\'' +
                ", createdDate=" + createdDay +
                '}';
    }
}
