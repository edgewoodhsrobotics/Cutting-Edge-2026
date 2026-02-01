package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.BackIntakeSubsystem;

public class BackIntake extends Command{
    private BackIntakeSubsystem myBackIntakeSubsystem;
    private double mySpeed;

    public BackIntake(BackIntakeSubsystem backIntakeSubsystem, double speed){
        myBackIntakeSubsystem = backIntakeSubsystem;
        mySpeed = speed;
        addRequirements(myBackIntakeSubsystem);
    }

    public void Initialize(){

    }

    public void execute(){
        myBackIntakeSubsystem.BackIntake(mySpeed);
    }

    public void end(boolean isInterrupted){
        myBackIntakeSubsystem.BackIntake(0);
    }
}

