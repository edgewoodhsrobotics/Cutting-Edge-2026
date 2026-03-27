package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.subsystems.BackIntakeSubsystem;
import frc.robot.subsystems.BackIntakeWheelSubsystem;
import frc.robot.subsystems.FrontIntakeSubsystem;

public class Shooter extends Command{
    private BackIntakeSubsystem backIntakeSubsystem;
    private FrontIntakeSubsystem frontIntakeSubsystem;
    private BackIntakeWheelSubsystem backIntakeWheelSubsystem;
    private double flywheelTargetSpeed;

    public Shooter(BackIntakeSubsystem backIntakeSubsystem, FrontIntakeSubsystem frontIntakeSubsystem, BackIntakeWheelSubsystem backIntakeWheelSubsystem){
        this.backIntakeSubsystem = backIntakeSubsystem;
        this.backIntakeWheelSubsystem = backIntakeWheelSubsystem;
        this.frontIntakeSubsystem = frontIntakeSubsystem;
        flywheelTargetSpeed = 4000*.95;

        addRequirements(backIntakeSubsystem, backIntakeWheelSubsystem, frontIntakeSubsystem);
    }

    public void execute(){
        backIntakeWheelSubsystem.BackIntakeWheelRPM(-4000);
        if(Math.abs(backIntakeWheelSubsystem.getEncoder()) > flywheelTargetSpeed){
           backIntakeSubsystem.BackIntake(-1);
           frontIntakeSubsystem.FrontIntake(1);
        }
    }
    
    public void end(boolean isInterrupted){
        backIntakeWheelSubsystem.BackIntakeWheelRPM(0);
        backIntakeSubsystem.BackIntake(0);
        frontIntakeSubsystem.FrontIntake(0);
    }

    
}
