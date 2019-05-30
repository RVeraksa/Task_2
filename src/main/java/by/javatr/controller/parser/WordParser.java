package by.javatr.controller.parser;


import by.javatr.bean.composite.Leaf;
import by.javatr.bean.model.Word;

public class WordParser extends ParserElement<Leaf> {
    @Override
    public Word parseLine(String line) {
        return new Word(line);
    }
}