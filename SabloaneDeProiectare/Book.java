package SabloaneDeProiectare;

import java.util.*;
import java.util.Arrays;

public class Book {
    String title;
    List<String> text=new ArrayList<String>();
    List<String> image=new ArrayList<String>();
    List<String> table=new ArrayList<String>();

    public Book(String title) {
        this.title = title;
    }

    public Book() {}

    public void createNewParagraph(String newParagraph){
        text.add(newParagraph);

    }

    public void createNewImage(String newImage){
        image.add(newImage);
    }

    public void createNewTable(String newTable){
        table.add(newTable);
    }

    public void print(){
        System.out.println("=======================");
        System.out.println("     "+title);
        System.out.println("=======================");
        for(String listOfParagraphs:text)
            System.out.println(listOfParagraphs);
        System.out.println("-----------------------");
        for(String listOfImages:image)
            System.out.println(listOfImages);
        System.out.println("-----------------------");
        for(String listOfTables:table)
            System.out.println(listOfTables);
        System.out.println("-----------------------");
    }
}
