package SabloaneDeProiectare;

public class Paragraph implements Element{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void print(){
        System.out.println("Paragraph: " + text);
    }

    @Override
    public void add(Element el) {

    }

    @Override
    public void remove(Element el) {

    }

    @Override
    public int get(Element el) {
        return 0;
    }

}
