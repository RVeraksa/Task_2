package by.javatr.controller;

import by.javatr.bean.model.Text;
import by.javatr.controller.creator.CreatorException;
import by.javatr.controller.creator.TextCreatorFactory;
import by.javatr.service.ServiceException;
import by.javatr.service.ServiceFactory;
import com.sun.istack.internal.logging.Logger;

public class ReadFile implements Function {
    private static final Logger logger = Logger.getLogger(ReadFile.class);

    public void readTextFile(String fileName){
        String path = "src/main/resources/";
        String location = path + fileName;
        Text text ;
        try {
            text = (Text) TextCreatorFactory.getInstance().getTextCreator().createFile(location);
            ServiceFactory.getInstance().getAccessDAO().save(text);
        } catch (CreatorException | ServiceException e ) {
            logger.info("File missing",e);
        }
    }
}
