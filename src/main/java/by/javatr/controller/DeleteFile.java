package by.javatr.controller;

import by.javatr.service.ServiceException;
import by.javatr.service.ServiceFactory;
import com.sun.istack.internal.logging.Logger;

public class DeleteFile implements Function {
    private static final Logger logger = Logger.getLogger(DeleteFile.class);

    public void deleteTextFile(){
        try {
            ServiceFactory.getInstance().getAccessDAO().delete();
        } catch ( ServiceException e ) {
            logger.info("File missing",e);
        }
    }
}
