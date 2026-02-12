package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BackIntakeSubsystem extends SubsystemBase{
    private SparkMax backIntakeMotorPush;
    private SparkMax backIntakeMotorWheel;


    public BackIntakeSubsystem(){
        backIntakeMotorPush = new SparkMax(11, MotorType.kBrushless);
        backIntakeMotorWheel = new SparkMax(14, MotorType.kBrushless);
    }



    public void BackIntake(double speed){
        backIntakeMotorPush.set(speed);
        backIntakeMotorWheel.set(2*speed);

    }
}
