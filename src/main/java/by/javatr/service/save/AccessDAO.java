package by.javatr.service.save;

import by.javatr.service.ServiceException;

public interface AccessDAO<T> {
    void save(T t) throws ServiceException;
    void delete() throws ServiceException;
    T get() throws ServiceException;
}
