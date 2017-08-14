package com.team2502.swervedrive.subsystems;

/**
 * Created by Miguel on 8/6/17
 */

import com.ctre.CANTalon;
import com.team2502.swervedrive.OI;
import com.team2502.swervedrive.Robot;
import com.team2502.swervedrive.RobotMap;
import com.team2502.swervedrive.commands.SwerveDriveCommand;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class SwerveSubsystem extends Subsystem
{
    public final CANTalon cimTalon0;
    public final CANTalon baneTalon0;
    public final CANTalon cimTalon1;
    public final CANTalon baneTalon1;
    public final CANTalon cimTalon2;
    public final CANTalon baneTalon2;
    public final CANTalon cimTalon3;
    public final CANTalon baneTalon3;

    public SwerveSubsystem()
    {
        baneTalon0 = new CANTalon(RobotMap.Motor.BANE_Talon_0);
        cimTalon0 = new CANTalon(RobotMap.Motor.CIM_TALON_0);
        baneTalon1 = new CANTalon(RobotMap.Motor.BANE_Talon_1);
        cimTalon1 = new CANTalon(RobotMap.Motor.CIM_TALON_1);
        baneTalon2 = new CANTalon(RobotMap.Motor.BANE_Talon_2);
        cimTalon2 = new CANTalon(RobotMap.Motor.CIM_TALON_2);
        baneTalon3 = new CANTalon(RobotMap.Motor.BANE_Talon_3);
        cimTalon3 = new CANTalon(RobotMap.Motor.CIM_TALON_3);


    }

    @Override
    protected void initDefaultCommand() {  setDefaultCommand(new SwerveDriveCommand());}

    public void drive()
    {

    }

}