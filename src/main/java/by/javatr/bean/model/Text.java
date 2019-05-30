package by.javatr.bean.model;

import by.javatr.bean.composite.Leaf;
import by.javatr.bean.composite.SmartComposite;

import java.util.List;

public class Text extends SmartComposite {

    public Text(List<Leaf> list) {
        super(list);
    }

    public String printElement() {
        return toString();
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Leaf leaf : getList()) {
            text.append(leaf.toString());
        }
        String s = new String(text);
        return s;
    }
}