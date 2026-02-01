package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.FrontIntakeSubsystem;

public class FrontIntake extends Command {
    private FrontIntakeSubsystem myFrontIntakeSubsystem;
    
    public FrontIntake(FrontIntakeSubsystem frontIntakeSubsystem){
        myFrontIntakeSubsystem = frontIntakeSubsystem;
        addRequirements(myFrontIntakeSubsystem);
    }

    public void Initialize(){

    }

    public void execute(){
        myFrontIntakeSubsystem.FrontIntake(1);
    }

    public void end(boolean isInterrupted){
        myFrontIntakeSubsystem.FrontIntake(0);
    }
}
