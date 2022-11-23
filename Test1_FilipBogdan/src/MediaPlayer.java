import java.util.ArrayList;
import java.util.List;

public class MediaPlayer implements Element{
    private String nume;

    public List<Element> listaMP = new ArrayList<Element>();

    public MediaPlayer(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void print() {

    }

    @Override
    public void add(Element addElement) {
        listaMP.add(addElement);
    }

    @Override
    public void remove(Element removeElement) {

    }

    @Override
    public int get(Element getElement) {
        return 0;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitMP(this);
        for (Element el: listaMP)
        {
            el.accept(visitor);
        }
    }
}
