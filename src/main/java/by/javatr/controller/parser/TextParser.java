package by.javatr.controller.parser;


import by.javatr.bean.composite.Leaf;
import by.javatr.bean.model.Text;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class TextParser extends ParserElement<Leaf> {
    private static final String PARAGRAPH_CURSOR = "\n(\\s{2,}|\t)";                          //символ пробелла 2 раза или больше
                                                                                                 //t - символ табуляции
    @Override
    public Text parseLine(String string) throws ParserException {
        if (string == null || string.isEmpty()) {
            throw new ParserException("File is empty ");
        }
        List<Leaf> paragraphs = new ArrayList<>();
        String[] strings = Arrays.stream(string.split(PARAGRAPH_CURSOR))
                                                .map(String::trim)
                                                .toArray(String[]::new);
        for (String s : strings) {
            Optional<Leaf> optional = parseNext(s);
            paragraphs.add(optional.get());
        }
        Text res = new Text(paragraphs);
        return res;
    }

}
