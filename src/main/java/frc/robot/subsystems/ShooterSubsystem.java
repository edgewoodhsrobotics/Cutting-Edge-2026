package frc.robot.subsystems;
import java.util.prefs.BackingStoreException;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.BackIntake;
import frc.robot.commands.BackIntakeWheel;
import frc.robot.commands.FrontIntake;

public class ShooterSubsystem extends SubsystemBase {
    private BackIntakeSubsystem myBackIntakeSubsystem;
    private BackIntakeWheelSubsystem myBackIntakeWheelSubsystem;
    private FrontIntakeSubsystem myFrontIntakeSubsystem;

    public ShooterSubsystem(){
        myBackIntakeSubsystem = new BackIntakeSubsystem();
        myBackIntakeWheelSubsystem = new BackIntakeWheelSubsystem();
        myFrontIntakeSubsystem = new FrontIntakeSubsystem();
    }

    public void Shooter(){
        new ParallelCommandGroup(new BackIntake(myBackIntakeSubsystem, -1), new BackIntakeWheel(myBackIntakeWheelSubsystem, 0.6), new FrontIntake(myFrontIntakeSubsystem, 0.8));
    }
}
