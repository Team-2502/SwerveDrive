package com.team2502.swervedrive;

import com.team2502.swervedrive.commands.ExampleCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public static final Joystick JOYSTICK_DRIVE_LEFT = new Joystick(RobotMap.Joystick.JOYSTICK_DRIVE_LEFT);
    public static final Joystick JOYSTICK_DRIVE_RIGHT = new Joystick(RobotMap.Joystick.JOYSTICK_DRIVE_RIGHT);

}
