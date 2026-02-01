// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.io.IOException;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.BackIntake;
import frc.robot.commands.FrontIntake;
import frc.robot.subsystems.BackIntakeSubsystem;
//import frc.robot.commands.Drive;
//import frc.robot.subsystems.DrivetrainSubsystem;
import frc.robot.subsystems.FrontIntakeSubsystem;


public class RobotContainer {
  //private final DrivetrainSubsystem myDriveTrainSubsystem;
  private final CommandXboxController controller;
  private final FrontIntakeSubsystem myFrontIntakeSubsystem;
  private final BackIntakeSubsystem myBackIntakeSubsystem;

  public RobotContainer() throws IOException {
    //myDriveTrainSubsystem = new DrivetrainSubsystem();
    myFrontIntakeSubsystem = new FrontIntakeSubsystem();
    myBackIntakeSubsystem = new BackIntakeSubsystem();
    controller = new CommandXboxController(0);
    configureBindings();
   // myDriveTrainSubsystem.setDefaultCommand(new Drive(myDriveTrainSubsystem, () -> -controller.getLeftY()*4, () -> -controller.getLeftX()*4, () -> -controller.getRightX()*2*Math.PI));
    
  }

  private void configureBindings() {
    controller.x().whileTrue(new ParallelCommandGroup(new BackIntake(myBackIntakeSubsystem, 1), new FrontIntake(myFrontIntakeSubsystem, 1))); //shooter
    controller.a().whileTrue(new ParallelCommandGroup(new BackIntake(myBackIntakeSubsystem, 1), new FrontIntake(myFrontIntakeSubsystem, -1))); //outtake
    controller.b().whileTrue(new ParallelCommandGroup(new BackIntake(myBackIntakeSubsystem, -1), new FrontIntake(myFrontIntakeSubsystem, 1))); //outtake
    controller.y().whileTrue(new ParallelCommandGroup(new BackIntake(myBackIntakeSubsystem, -1), new FrontIntake(myFrontIntakeSubsystem, 0))); //unstick

  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
