package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BackIntakeSubsystem extends SubsystemBase{
    private SparkMax backIntakeMotor;

    public BackIntakeSubsystem(){
        backIntakeMotor = new SparkMax(11, MotorType.kBrushed);
    }



    public void BackIntake(double speed){
        backIntakeMotor.set(speed);
    }
}
