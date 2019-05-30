package by.javatr.service.sort;

import by.javatr.service.ServiceException;

public interface Sort<T> {
    T sort() throws ServiceException;
}
