package by.javatr.bean.model;

import by.javatr.bean.composite.Leaf;
import com.sun.istack.internal.logging.Logger;

import java.util.Arrays;

public class Word implements Leaf {

    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String printElement() {
        return toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;

        Word word1 = (Word) o;

        return word != null ? word.equals(word1.word) : word1.word == null;
    }

    @Override
    public int hashCode() {
        return word != null ? word.hashCode() : 0;
    }

    @Override
    public String toString() {
        String word = new String(this.word);
        return word;
    }
}