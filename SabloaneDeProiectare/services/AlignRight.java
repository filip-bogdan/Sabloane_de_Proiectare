package SabloaneDeProiectare.services;

import SabloaneDeProiectare.models.Paragraph;
import SabloaneDeProiectare.services.AlignmentStrategy;

public class AlignRight implements AlignmentStrategy {

    @Override
    public void render(Paragraph p) {
        System.out.println("###"+p.getText());
    }
}
