package by.javatr.controller.parser;

import java.util.Optional;

abstract class ParserElement<T>  {
    private ParserElement<T> next;

    ParserElement<T> linkWith(ParserElement<T> next) {
        this.next = next;
        return this;
    }

    public abstract T parseLine(String string) throws ParserException;

    Optional<T> parseNext(String parse) throws ParserException {
        if (next != null) {
            return Optional.ofNullable(next.parseLine(parse));
        } else
            return Optional.empty();
    }
}
