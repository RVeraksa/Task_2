package by.javatr.controller.creator;

public class TextCreatorFactory {
    private static TextCreatorFactory ourInstance = new TextCreatorFactory();

    public static TextCreatorFactory getInstance() {
        return ourInstance;
    }

    private TextCreatorFactory() {}

    private final Creator creator = new TextCreator();

    public Creator getTextCreator(){
        return  creator;
    }

}
