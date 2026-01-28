// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.io.IOException;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.Drive;
import frc.robot.subsystems.DrivetrainSubsystem;

public class RobotContainer {
  private final DrivetrainSubsystem myDriveTrainSubsystem;
  private final CommandXboxController controller;

  public RobotContainer() throws IOException {
    myDriveTrainSubsystem = new DrivetrainSubsystem();
    configureBindings();
    controller = new CommandXboxController(0);
    myDriveTrainSubsystem.setDefaultCommand(new Drive(myDriveTrainSubsystem, () -> -controller.getLeftY()*4, () -> -controller.getLeftX()*4, () -> -controller.getRightX()*2*Math.PI));
    
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
