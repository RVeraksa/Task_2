package by.javatr.controller.parser;

import by.javatr.bean.model.Word;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordParserTest {

    private Word one = new Word("Hello");
    private Word result;
    private String hello = "Hello";

    @Before
    public void prepare(){
        WordParser check = new WordParser();
        result = check.parseLine(hello);
    }

    @Test
    public void checkOne(){
        Assert.assertEquals(one,result);
    }

}