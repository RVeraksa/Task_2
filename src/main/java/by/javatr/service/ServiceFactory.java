package by.javatr.service;

import by.javatr.service.save.AccessDAO;
import by.javatr.service.save.AccessDAOText;
import by.javatr.service.sort.Sort;
import by.javatr.service.sort.SortText;

public class ServiceFactory {
    private static ServiceFactory ourInstance = new ServiceFactory();

    public static ServiceFactory getInstance() {
        return ourInstance;
    }

    private ServiceFactory() {}

    private AccessDAO accessDAO = new AccessDAOText();
    private Sort sort = new SortText();

    public AccessDAO getAccessDAO(){
        return accessDAO;
    }

    public Sort getSort(){
        return sort;
    }
}
