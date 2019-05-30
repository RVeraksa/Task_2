package by.javatr.dao;

import by.javatr.bean.model.Text;
import com.sun.istack.internal.logging.Logger;

public class TextDAO implements DAO<Text> {
    private static final Logger logger = Logger.getLogger(TextDAO.class);

    private  Text text;

    @Override
    public Text get() throws DAOException {
        if (text == null) throw new DAOException("TEXT is non-existent");
        logger.info("Trying get file");
        return this.text;
    }

    @Override
    public void save(Text text) throws DAOException {
        if (text != null) {
            this.text = text;
            logger.info("Trying save file");
        }
        else if(text == null)throw new DAOException("You are try to save null object");
    }

    @Override
    public void delete() throws DAOException {
        if (this.text != null) {
            this.text = null;
            logger.info("Trying delete file");
        }
        else if(text == null) throw new DAOException("You are deleting a non-existent text");
    }
}
