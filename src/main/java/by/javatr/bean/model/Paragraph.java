package by.javatr.bean.model;

import by.javatr.bean.composite.Leaf;
import by.javatr.bean.composite.SmartComposite;

import java.util.List;

public class Paragraph extends SmartComposite {

    public Paragraph(List<Leaf> list) {
        super(list);
    }

    public String printElement() {
        return toString();
    }

    @Override
    public String toString() {
        StringBuilder paragrph = new StringBuilder();
        paragrph.append('\t');
        for (Leaf leaf : getList()) {
            paragrph.append(leaf.toString()).append(' ');
        }
        paragrph.deleteCharAt(paragrph.length()-1);
        paragrph.append('\n');
        String s = new String(paragrph);
        return s;
    }
}
