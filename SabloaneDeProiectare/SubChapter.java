package SabloaneDeProiectare;

import java.util.*;
import java.util.Arrays;

public class SubChapter {
    private String name;

    public SubChapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<Paragraph> texts=new ArrayList<Paragraph>();
    List<Image> images=new ArrayList<Image>();
    List<Table> tables=new ArrayList<Table>();


    public void createNewParagraph(String newParagraph){
        Paragraph paragraph = new Paragraph(newParagraph);
        texts.add(paragraph);
    }

    public void createNewImage(String newImage){
        Image image = new Image(newImage);
        images.add(image);
    }

    public void createNewTable(String newTable){
        Table table = new Table(newTable);
        tables.add(table);
    }
    public void print(){
        System.out.println("Subchapter: " + name);
        for(Paragraph p:texts)
            p.print();
        for(Image i:images)
            i.print();
        for(Table t:tables)
            t.print();
    }
}
