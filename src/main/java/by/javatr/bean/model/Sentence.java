package by.javatr.bean.model;



import by.javatr.bean.composite.Leaf;
import by.javatr.bean.composite.SmartComposite;
import com.sun.istack.internal.logging.Logger;

import java.util.List;

public class Sentence extends SmartComposite {

    static final Logger logger = Logger.getLogger(Sentence.class);

    public Sentence(List<Leaf> list) {
        super(list);
    }

    public String printElement() {
        return toString();
    }

    @Override
    public String toString() {
        StringBuilder sentence = new StringBuilder();
        for (Leaf leaf : getList()) {
            sentence.append(leaf.toString()).append(' ');
        }
        sentence.deleteCharAt(sentence.length() - 1).append(".");
        String s = new String(sentence);
        return s;
    }
}