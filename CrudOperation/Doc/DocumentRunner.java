package com.xworks.CrudOperation.Doc;

public class DocumentRunner {
    public static void main(String[] args) {
        Document document1=new Document();
        document1.setFilename("java code");
        document1.setFileSize(70);
        document1.setFileType("java");
        document1.setCreatedDay(21);

        Document document2=new Document();
        document2.setFilename("html code");
        document2.setFileSize(25);
        document2.setFileType("html");
        document2.setCreatedDay(15);

        Document document3=new Document();
        document3.setFilename("java script");
        document3.setFileSize(150);
        document3.setFileType("js");
        document3.setCreatedDay(15);

        Document document4=new Document();
        document4.setFilename("css");
        document4.setFileSize(20);
        document4.setFileType("css");
        document4.setCreatedDay(10);

        Document document5=new Document();
        document5.setFilename("python code");
        document5.setFileSize(55);
        document5.setFileType("python");
        document5.setCreatedDay(49);

        FileUsed fileUsed=new FileUsed();
        String detais=fileUsed.saveDetails(document1);
        System.out.println(detais);

        String details1=fileUsed.saveDetails(document2);
        System.out.println(details1);

        String details2=fileUsed.saveDetails(document3);
        System.out.println(details2);

        String details3=fileUsed.saveDetails(document4);
        System.out.println(details3);

        String details4=fileUsed.saveDetails(document5);
        System.out.println(details4);
        System.out.println("----------------------");
        fileUsed.read();
        System.out.println("---------------------");
        fileUsed.searchByName("python");
        System.out.println("----------------------");
        fileUsed.searchBySize(25);
        System.out.println("------------------------");
        fileUsed.sizeBellow50();
    }
}

