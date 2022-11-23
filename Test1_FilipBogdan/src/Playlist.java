import java.util.ArrayList;
import java.util.List;

public class Playlist implements Element{
    private String nume;

    private int dim = 0;

    public List<Element> listaP = new ArrayList<Element>();

    public Playlist(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    @Override
    public void print() {

    }

    @Override
    public void add(Element addElement) {
        listaP.add(addElement);
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
        visitor.visitP(this);
        for (Element el: listaP)
        {
            el.accept(visitor);
        }
    }
}
