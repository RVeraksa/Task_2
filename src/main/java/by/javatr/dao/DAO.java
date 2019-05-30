package by.javatr.dao;

public interface DAO<T> {
    T get()throws DAOException;
    void save(T t) throws DAOException;
    void delete() throws DAOException;
}
