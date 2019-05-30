package by.javatr.controller.creator;

public interface Creator<T> {
    T createFile(String location) throws CreatorException;
}
