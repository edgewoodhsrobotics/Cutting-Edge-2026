package frc.robot.subsystems;

import com.ctre.phoenix6.signals.BrushedMotorWiringValue;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase{
    private SparkMax leftIntakeMotor;
    private SparkMax rightIntakeMotor;
    public IntakeSubsystem(){
        leftIntakeMotor = new SparkMax(31, MotorType.kBrushed);
        rightIntakeMotor = new SparkMax(11, MotorType.kBrushed);
    }

    public void Intake(){
        leftIntakeMotor.set(0.5);
        rightIntakeMotor.set(0.5);
    }
}
