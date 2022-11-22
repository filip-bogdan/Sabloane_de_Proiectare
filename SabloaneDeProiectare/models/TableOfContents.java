package SabloaneDeProiectare.models;

import SabloaneDeProiectare.models.Element;
import SabloaneDeProiectare.services.Visitor;

public class TableOfContents implements Element {
    @Override
    public void print() {

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
    //something

    @Override
    public void accept(Visitor v) {
        v.visitTableOfContents(this);
    }
}
