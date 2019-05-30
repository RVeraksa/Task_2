package by.javatr.service.sort;

import by.javatr.bean.composite.Leaf;
import by.javatr.bean.model.Paragraph;
import by.javatr.bean.model.Sentence;
import by.javatr.bean.model.Text;
import by.javatr.dao.DAOException;
import by.javatr.dao.TextDAOCreator;
import by.javatr.service.ServiceException;
import com.sun.istack.internal.logging.Logger;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortText implements Sort<Text> {
    private static final Logger logger = Logger.getLogger(SortText.class);


   @Override
    public Text sort() throws ServiceException {
        Text text = null;
        try {
            text = (Text) TextDAOCreator.getInstance().getTextDAO().get();
        } catch (DAOException e) {
            logger.info("Save file immediately");
            throw new ServiceException(e);
        }
        List<Leaf> sortedSentences = text.getList().stream()
                .map(paragraph -> sortSentences(((Paragraph) paragraph)))
                .collect(Collectors.toList());
        Text ret = new Text(sortedSentences);
        return ret;
    }

    private Paragraph sortSentences(Paragraph paragraph) {
        List<Leaf> sortedSentences = paragraph.getList().stream()
                .map(sentence -> ((Sentence) sentence))
                .sorted(Comparator.comparingInt(sentence -> sentence.getList().size()))
                .collect(Collectors.toList());
        return new Paragraph(sortedSentences);
    }


/**
    public Text sortAD() throws ServiceException {
        Text text = null;
        try {
            text = (Text) TextDAOCreator.getInstance().getTextDAO().get();
        } catch (DAOException e) {
            logger.info("Save file immediately");
            throw new ServiceException(e);
        }
        List<Leaf> sortedSentences = text.getList().stream()
                .map(paragraph -> ((Paragraph) paragraph))
                .sorted(Comparator.comparingInt(paragraph -> paragraph.getList().stream()
                        .map(sentence -> ((Sentence) sentence))
                        .sorted((Comparator.comparingInt(sentence -> sentence.getList().size()))
                                .collect(Collectors.toList()));
        Text ret = new Text(sortedSentences);
        return ret;
    }**/
}
