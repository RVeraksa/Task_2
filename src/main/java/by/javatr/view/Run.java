package by.javatr.view;

import by.javatr.controller.ControllerFactory;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        boolean flag = true;
        System.out.println("--// Text Parser //--\n"+"Program manual\n"+
                "1)Save file: enter file name from resources package\n"+
                "command - save file\n"+
                "2)Sort file\n"+
                "command - sort file\n"+
                "3)You can delete the file from dao\n"+
                "command - delete file");

        while (flag) {
            command = scanner.nextLine();
            ControllerFactory.getInstance().getFunction(command);

            if (command.equals("exit")) {
                flag = false;
            }
        }

    }
}
