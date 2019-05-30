package by.javatr.controller.creator;

import by.javatr.bean.model.Text;
import by.javatr.controller.parser.ParserElementCreator;
import by.javatr.controller.parser.ParserException;
import com.sun.istack.internal.logging.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextCreator implements Creator<Text> {
    private static final Logger logger = Logger.getLogger(TextCreator.class);

    @Override
    public Text createFile(String location) throws CreatorException {
        Path path = Paths.get(location);
        Text text;
        try {
            byte[] line = Files.readAllBytes(path);
            String string = new String(line);
            text = ParserElementCreator.getInstance().fileParser().parseLine(string);
        } catch (IOException | ParserException e) {
            logger.info("Check input file");
            throw new CreatorException("Text no created");
        }
        return text;
    }
}
