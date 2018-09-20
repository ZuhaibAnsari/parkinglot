package com.hussi.service;

import com.hussi.commands.*;
import com.hussi.util.ServiceMarker;
import org.springframework.stereotype.Service;

@Service
public class CommandService implements ServiceMarker
{
//Can these be autowired
    private CreateParkingLotCommand createParkingLotCommand;
    private LeaveCommand leaveCommand;
    private ParkCommand parkCommand;
    private RegistrationNumbersForCarsWithColorCommand registrationNumbersForCarsWithColorCommand;
    private SlotNumbersForCarsWithColorCommand slotNumbersForCarsWithColorCommand;
    private SlotNumbersForRegistrationNumberCommand slotNumbersForRegistrationNumberCommand;
    private StatusCommand statusCommand;

    public void createParkingLot()
    {
        createParkingLotCommand.execute(new String[]{});
    }


    public void leave()
    {
        leaveCommand.execute(new String[]{});
    }


    public void park()
    {
        parkCommand.execute(new String[]{});
    }


    public void registrationNumbersForCarsWithColor()
    {
        registrationNumbersForCarsWithColorCommand.execute(new String[]{});
    }


    public void slotNumbersForCarsWithColor()
    {
        slotNumbersForCarsWithColorCommand.execute(new String[]{});
    }


    public void slotNumbersForRegistrationNumber()
    {
        slotNumbersForRegistrationNumberCommand.execute(new String[]{});
    }


    public void status()
    {
        statusCommand.execute(new String[]{});
    }

}
