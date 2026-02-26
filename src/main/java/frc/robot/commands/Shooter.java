package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;


public class Shooter extends Command{
    private ShooterSubsystem myShooterSubsystem;

    public Shooter(ShooterSubsystem shooterSubsystem){
        myShooterSubsystem = shooterSubsystem;
        addRequirements(myShooterSubsystem);
    }

    public void Initialize(){

    }

    public void execute(){
        myShooterSubsystem.Shooter();
    }

    public void end(boolean isInterrupted){
        myShooterSubsystem.Shooter();
    }

}
