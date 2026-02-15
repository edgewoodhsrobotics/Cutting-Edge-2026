package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ClimberSubsystem;

public class Climber extends Command{
    private ClimberSubsystem myClimberSubsystem;
    private double mySpeed;

    public Climber(ClimberSubsystem climberSubsystem, double speed){
        myClimberSubsystem = climberSubsystem;
        mySpeed = speed;
        addRequirements(myClimberSubsystem);
    }

    public void Initialize(){

    }

    public void execute(){
        myClimberSubsystem.Climber(mySpeed);
    }

    public void end(boolean isInterrupted){
        myClimberSubsystem.Climber(0);
    }
}
