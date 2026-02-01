package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.BackIntakeSubsystem;

public class BackIntake extends Command{
    private BackIntakeSubsystem myBackIntakeSubsystem;

    public BackIntake(BackIntakeSubsystem backIntakeSubsystem){
        myBackIntakeSubsystem = backIntakeSubsystem;
        addRequirements(myBackIntakeSubsystem);
    }

    public void Initialize(){

    }

    public void execute(){
        myBackIntakeSubsystem.BackIntake(1);
    }

    public void end(boolean isInterrupted){
        myBackIntakeSubsystem.BackIntake(0);
    }
}

