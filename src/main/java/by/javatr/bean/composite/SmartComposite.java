package by.javatr.bean.composite;

import java.util.List;

public abstract class SmartComposite implements Composite {

    private List<Leaf> list;

    public SmartComposite(List<Leaf> list) {
        this.list = list;
    }

    public List<Leaf> getList() {
        return list;
    }

}