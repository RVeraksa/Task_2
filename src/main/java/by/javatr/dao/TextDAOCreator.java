package by.javatr.dao;

public class TextDAOCreator {
    private static TextDAOCreator ourInstance = new TextDAOCreator();

    public static TextDAOCreator getInstance() {
        return ourInstance;
    }

    private TextDAOCreator() { }

    private DAO textDAO = new TextDAO();

    public DAO getTextDAO(){
        return textDAO;
    }
}
