package by.javatr.controller.parser;

public class ParserElementCreator {
    private static ParserElementCreator ourInstance = new ParserElementCreator();

    public static ParserElementCreator getInstance() {
        return ourInstance;
    }

    private ParserElementCreator() {}

    public TextParser fileParser() {
        TextParser parser = new TextParser();
        parser.linkWith(new ParagraphParser()
                .linkWith(new SentenceParser()
                        .linkWith(new WordParser())));
        return parser;
    }
}