package by.javatr.controller.parser;

import by.javatr.bean.composite.Leaf;
import by.javatr.bean.model.Sentence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SentenceParser extends ParserElement<Leaf> {
    private  final String WORD_CURSOR = "\\s";

    @Override
    public Sentence parseLine(String string) throws ParserException {

        if (string == null) {
            throw new ParserException("File is empty ");
        }
        List<Leaf> words = new ArrayList<>();
        String[] strings = Arrays.stream(string.split(WORD_CURSOR))
                                                .map(String::trim)
                                                .toArray(String[]::new);
        for (String s : strings) {
            Optional<Leaf> optional = parseNext(s);
            words.add(optional.get());
        }
        Sentence result = new Sentence(words);
        return result;
    }
}