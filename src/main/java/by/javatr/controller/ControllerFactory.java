package by.javatr.controller;

import by.javatr.bean.model.Text;
import com.sun.istack.internal.logging.Logger;

import java.util.Scanner;

public class ControllerFactory {
    private static final Logger logger = Logger.getLogger(ControllerFactory.class);
    private static ControllerFactory ourInstance = new ControllerFactory();

    public static ControllerFactory getInstance() {
        return ourInstance;
    }

    private ControllerFactory() {}


    public  void getFunction(String command){
        switch (command){
            case "save file":
                ReadFile readFile = new ReadFile();
                Scanner scanner = new Scanner(System.in);
                logger.info("Write file name from resourse package");
                String name = scanner.nextLine();
                readFile.readTextFile(name);
                logger.info("File save successfully");
                break;
            case  "delete file":
                DeleteFile deleteFile = new DeleteFile();
                deleteFile.deleteTextFile();
                break;
            case "sort file":
                SortFile sortFile = new SortFile();
                Text text = sortFile.sortText();
                logger.info(text.printElement());
                logger.info("File sort successfully");
                break;
        }
    }
}
