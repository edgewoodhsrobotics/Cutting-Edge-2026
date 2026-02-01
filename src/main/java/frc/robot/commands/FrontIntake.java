package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.FrontIntakeSubsystem;

public class FrontIntake extends Command {
    private FrontIntakeSubsystem myFrontIntakeSubsystem;
    private double mySpeed;
    
    public FrontIntake(FrontIntakeSubsystem frontIntakeSubsystem, double speed){
        myFrontIntakeSubsystem = frontIntakeSubsystem;
        mySpeed = speed;
        addRequirements(myFrontIntakeSubsystem);
    }

    public void Initialize(){

    }

    public void execute(){
        myFrontIntakeSubsystem.FrontIntake(mySpeed);
    }

    public void end(boolean isInterrupted){
        myFrontIntakeSubsystem.FrontIntake(0);
    }
}
