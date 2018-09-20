package com.hussi.controller;

import com.hussi.bussinessLogic.DayCollection;
import com.hussi.bussinessLogic.ParkingFareCalculator;
import com.hussi.bussinessLogic.WriteDataToDB;
import com.hussi.domain.ParkingTicket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class ParkingController {
    private static final Logger logger = LoggerFactory.getLogger(ParkingController.class);

    @RequestMapping(value = "/parkingFare", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    String parkingFare(@RequestParam("entry_time") String entry_time, @RequestParam("exit_time") String exit_time) {
        logger.info("calculating fare for entry_time : {} and exit_time : {}", entry_time, exit_time);
        ParkingFareCalculator calculator = new ParkingFareCalculator();
        return "";
    }


    @RequestMapping(value = "/fullDayCollection", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    String getFullDayCollection(@RequestParam("collection_date") String collection_date)
    {
        logger.info("calculating fare for collection_date : {}",collection_date);
        return "";
    }
}
