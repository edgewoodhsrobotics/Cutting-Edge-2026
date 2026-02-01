package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.PersistMode;
import com.revrobotics.ResetMode;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class FrontIntakeSubsystem extends SubsystemBase{
    private SparkMax frontIntakeMotor;
    
    public FrontIntakeSubsystem(){
        SparkMaxConfig config = new SparkMaxConfig();
        config.inverted(true);
        frontIntakeMotor = new SparkMax(31, MotorType.kBrushed);
        frontIntakeMotor.configure(config, ResetMode.kResetSafeParameters, PersistMode.kNoPersistParameters);
    }

    public void FrontIntake(double speed){
        frontIntakeMotor.set(speed);
    }
}
