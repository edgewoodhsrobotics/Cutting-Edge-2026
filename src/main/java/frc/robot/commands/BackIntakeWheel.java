package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.BackIntakeWheelSubsystem;

public class BackIntakeWheel extends Command{
    private BackIntakeWheelSubsystem myBackIntakeWheelSubsystem;
    private double mySpeed;

    public BackIntakeWheel(BackIntakeWheelSubsystem backIntakeWheelSubsystem, double speed){
        myBackIntakeWheelSubsystem = backIntakeWheelSubsystem;
        mySpeed = speed;
        addRequirements(myBackIntakeWheelSubsystem);
    }

    public void Initialize(){

    }

    public void execute(){
        myBackIntakeWheelSubsystem.BackIntakeWheel(mySpeed);
    }

    public void end(boolean isInterrupted){
        myBackIntakeWheelSubsystem.BackIntakeWheel(0);
    }
}

