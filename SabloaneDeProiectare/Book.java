package SabloaneDeProiectare;

import java.util.*;
import java.util.Arrays;

public class Book {
    String title;
    private List<Author> authors = new ArrayList<Author>();
    private List<Chapter> chapters = new ArrayList<Chapter>();
    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author a){
        authors.add(a);
    }

    public int createChapter(String nameChapter){
        Chapter ch = new Chapter(nameChapter);
        chapters.add(ch);
        return chapters.indexOf(ch);
    }

    public Chapter getChapter(int indexChapter){
        return chapters.get(indexChapter);
    }

    public void print(){
        System.out.println("=======================");
        System.out.println("     "+title);
        System.out.println("=======================");
        for(Author a :authors)
            a.print();
        System.out.println("-----------------------");
    }

}
