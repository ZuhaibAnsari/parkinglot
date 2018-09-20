package com.hussi;

import com.hussi.commands.CommandStrategy;
import com.hussi.commands.CommandsFactory;
import com.hussi.enums.CommandsEnum;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.Scanner;

public class ParkingLotApplication
{

    static String DEFAULT_FILE_PATH =  "src/main/resources/inputFile.txt";

    public static void main(String[] args)
    {
        String filePath = "";

        filePath = (args.length==0) ? DEFAULT_FILE_PATH : args[0];

        try (Scanner scanner = new Scanner(new File(null == filePath ? "" : filePath)))
        {
            while (scanner.hasNext())
            {
                String currentLine = scanner.nextLine();
                String[] commandWithParameterArr = currentLine.split(" ");
                CommandsEnum commandsEnum = Enum.valueOf(CommandsEnum.class, commandWithParameterArr[0].toUpperCase());
                CommandStrategy commandExecutor = CommandsFactory.getCommandExecutor(commandsEnum);
                commandExecutor.execute(commandWithParameterArr);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
