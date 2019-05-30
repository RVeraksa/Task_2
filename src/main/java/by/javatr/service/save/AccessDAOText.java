package by.javatr.service.save;

import by.javatr.bean.model.Text;
import by.javatr.dao.DAOException;
import by.javatr.dao.TextDAOCreator;
import by.javatr.service.ServiceException;
import com.sun.istack.internal.logging.Logger;

public class AccessDAOText implements AccessDAO<Text> {

    private static final Logger logger = Logger.getLogger(AccessDAOText.class);

    TextDAOCreator daoCreator = TextDAOCreator.getInstance();
    @Override
    public void save(Text text) throws ServiceException {
        try {
            daoCreator.getTextDAO().save(text);//выбрасывается искдючение
        } catch (DAOException e) {
            logger.info("Somth went wrong in DAO",e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete() throws ServiceException {
        try {
            daoCreator.getTextDAO().delete();
        } catch (DAOException e) {
            logger.info("Somth went wrong in DAO",e);
            throw new ServiceException(e);
        }
    }

    @Override
    public Text get() throws ServiceException {
        try {
            return (Text) daoCreator.getTextDAO().get();
        } catch (DAOException e) {
            logger.info("Somth went wrong in DAO",e);
            throw new ServiceException(e);
        }
    }
}
