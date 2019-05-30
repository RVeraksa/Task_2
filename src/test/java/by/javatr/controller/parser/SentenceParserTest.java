package by.javatr.controller.parser;

import by.javatr.bean.composite.Leaf;
import by.javatr.bean.model.Sentence;
import by.javatr.bean.model.Word;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SentenceParserTest {

    private List<Leaf> wordList  = Arrays.asList(new Word("Hello"), new Word("world,"),new Word("how"),new Word("are"),new Word("you"));
    private Sentence result = new Sentence(wordList);
    private Sentence check;

    @Before
    public void prepare(){
        SentenceParser parser = new SentenceParser();
        try {
            check = parser.parseLine("Hello world, how are you");
        } catch (ParserException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkOne(){
        Assert.assertEquals(check,result);
    }
}