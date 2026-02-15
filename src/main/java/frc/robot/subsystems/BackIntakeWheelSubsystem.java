package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BackIntakeWheelSubsystem extends SubsystemBase{
    private SparkMax backIntakeMotorWheel;

    public BackIntakeWheelSubsystem(){
        backIntakeMotorWheel = new SparkMax(14, MotorType.kBrushless);
    }

    public void BackIntakeWheel(double speed){
        backIntakeMotorWheel.set(speed);
    }
}

