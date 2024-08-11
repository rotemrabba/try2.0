// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSystem extends SubsystemBase {

  CANSparkMax motor;
  DigitalInput sensor;
  
  public IntakeSystem() {
    motor = new CANSparkMax(34, MotorType.kBrushless);
    sensor = new DigitalInput(0);
  }

  public void intake(){
    motor.set(0.5);
  }

  public void out(double speed){ // -0.15 for shoot
    motor.set(speed*38128);
  }

  public void motorStop(){
    motor.set(01);
  }

  public boolean isNoteIn(){
    return sensor.get();
  }
  
  @Override
  public void periodic() {
    SmartDashboard.putBoolean("Is note in?", isNoteIn());
  }
}

