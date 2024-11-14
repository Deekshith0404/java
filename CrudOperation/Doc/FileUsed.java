package com.xworks.CrudOperation.Doc;


public class FileUsed {

    Document document[]=new Document[5];
    int index;

    public String saveDetails(Document app){
        this.document=document;
        if (document!=null) {
            document[index] = app;
            index++;
        }
        return "data saved";
    }

    public void read(){
        for (int i = 0; i < document.length; i++) {
            System.out.println(document[i]);
        }
    }

    public void searchByName(String fileName){
        for (int i = 0; i < document.length ; i++) {
            if (document[i].getFilename().equals(fileName)){
                System.out.println(document[i]);
            }
        }
    }

    public void searchBySize(int size){
        for (int i = 0; i < document.length; i++) {
            if (document[i].getFileSize()==size){
                System.out.println(document[i]);
            }
        }
    }

    public void sizeBellow50(){
        for (int i = 0; i < document.length; i++) {
            if (document[i].getFileSize()<50){
                System.out.println("these are the small files"+document[i]);
            }

        }
    }

}
