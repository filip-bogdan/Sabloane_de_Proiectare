package SabloaneDeProiectare;

import java.util.*;
import java.util.Arrays;

public class Book {
    String titlu;
    List<String> text=new ArrayList<String>();
    List<String> image=new ArrayList<String>();
    List<String> table=new ArrayList<String>();

    public Book(String titlu) {
        this.titlu = titlu;
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
        System.out.println(titlu);
        System.out.println("----------------------");
        for(String elem:text)
            System.out.println(elem);
        System.out.println("----------------------");
        for(String elem:image)
            System.out.println(elem);
        System.out.println("----------------------");
        for(String elem:table)
            System.out.println(elem);
        System.out.println("----------------------");
    }
}
