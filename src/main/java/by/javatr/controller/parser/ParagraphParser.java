package by.javatr.controller.parser;


import by.javatr.bean.composite.Leaf;
import by.javatr.bean.model.Paragraph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ParagraphParser extends ParserElement<Leaf> {
    private final String SENTENCE_CURSOR = "[.]\r?";

    @Override
    public Paragraph parseLine(String string) throws ParserException {
        if (string == null) {
            throw new ParserException("File is empty ");
        }
        List<Leaf> sentences = new ArrayList<>();
        String[] strings = Arrays.stream(string.split(SENTENCE_CURSOR))
                                                .map(String::trim)
                                                .toArray(String[]::new);
        for (String s : strings) {
            Optional<Leaf> optional = parseNext(s);
            sentences.add(optional.get());
        }
        Paragraph res = new Paragraph(sentences);
        return res;
    }

}