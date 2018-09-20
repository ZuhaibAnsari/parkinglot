/*
package com.hussi;

import com.hussi.commands.CommandStrategy;
import com.hussi.commands.CommandsFactory;
import com.hussi.enums.CommandsEnum;
import com.hussi.service.CommandService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.Scanner;

//@SpringBootApplication
public class ParkingLotSpringBootApplication
{
    static String DEFAULT_FILE_PATH =  "/home/hussain/workspace/selfie/GoJekParkingLot/src/main/resources/inputFile.txt";

    private static final Logger logger = LoggerFactory.getLogger(ParkingLotSpringBootApplication.class);

  //  @Autowired
    private CommandService commandService;

    public static void main(String[] args)
    {
        System.out.println("starting Parking Application");
        SpringApplication.run(ParkingLotSpringBootApplication.class, args);
        init("");
    }

    public static void init(String filePath)
    {
        filePath = (StringUtils.isEmpty(filePath)) ? DEFAULT_FILE_PATH : filePath;
        try (Scanner scanner = new Scanner(new File(null == filePath ? "" : filePath)))
        {
            while (scanner.hasNext())
            {
                String currentLine = scanner.nextLine();
                CommandsEnum commandsEnum = Enum.valueOf(CommandsEnum.class, currentLine.split(" ")[0].toUpperCase());
                CommandStrategy commandExecutor = CommandsFactory.getCommandExecutor(commandsEnum);
                commandExecutor.execute(new String[]{});
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
*/
