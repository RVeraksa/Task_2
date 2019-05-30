package by.javatr.controller;

import by.javatr.bean.model.Text;
import by.javatr.service.ServiceException;
import by.javatr.service.ServiceFactory;
import com.sun.istack.internal.logging.Logger;

public class SortFile implements Function {
    private static final Logger logger = Logger.getLogger(SortFile.class);

    public Text sortText() {
        Text text = null;
        try {
            text = (Text) ServiceFactory.getInstance().getSort().sort();
            return text;
        } catch (ServiceException e) {
            logger.info("File missing",e);
        }
        return text;
    }
}
