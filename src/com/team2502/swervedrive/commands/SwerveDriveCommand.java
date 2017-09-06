package com.team2502.swervedrive.commands;

/**
 * Created by Miguel on 8/6/17
 */

import com.team2502.swervedrive.Robot;
import com.team2502.swervedrive.subsystems.SwerveSubsystem;
import edu.wpi.first.wpilibj.command.Command;

public class SwerveDriveCommand extends Command
{
    private final SwerveSubsystem swerveDrive;

    public SwerveDriveCommand()
    {
        requires(Robot.DRIVE_TRAIN);
        swerveDrive = Robot.DRIVE_TRAIN;
    }

    @Override
    protected void initialize() {}

    @Override
    protected void execute()
    {
        swerveDrive.drive();
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {}

    @Override
    protected void interrupted() {}
}
