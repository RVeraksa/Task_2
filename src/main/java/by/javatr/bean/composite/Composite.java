package by.javatr.bean.composite;

import java.util.List;

public interface Composite extends Leaf {

    List<Leaf> getList();

}
