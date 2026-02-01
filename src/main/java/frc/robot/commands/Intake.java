package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class Intake extends Command{
    private IntakeSubsystem myIntakeSubsystem;

    public Intake(IntakeSubsystem intakeSubsystem){
        myIntakeSubsystem = intakeSubsystem;
        addRequirements(myIntakeSubsystem);
    }

    public void Initialize(){

    }

    public void execute(){
        myIntakeSubsystem.Intake();
    }
}

