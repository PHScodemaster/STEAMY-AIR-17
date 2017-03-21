// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4949.LeFuente.subsystems;

import org.usfirst.frc4949.LeFuente.RobotMap;
import org.usfirst.frc4949.LeFuente.commands.*;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drive extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Encoder quadratureEncoder1 = RobotMap.driveQuadratureEncoder1;
    private final Encoder quadratureEncoder2 = RobotMap.driveQuadratureEncoder2;
    private final Encoder quadratureEncoder3 = RobotMap.driveQuadratureEncoder3;
    private final Encoder quadratureEncoder4 = RobotMap.driveQuadratureEncoder4;
    private final SpeedController frontLeft = RobotMap.driveFrontLeft;
    private final SpeedController rearLeft = RobotMap.driveRearLeft;
    private final SpeedController frontRight = RobotMap.driveFrontRight;
    private final SpeedController rearRight = RobotMap.driveRearRight;
    private final AnalogGyro analogGyro1 = RobotMap.driveAnalogGyro1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void mecanumDrive(Joystick joy){
    	robotDrive.mecanumDrive_Cartesian(xAxis, yAxis, zAxis, angle);
    }
    
    /**
     * @param xAxis
     * 			  X axis value
     * @param yAxis
     * 			  Y axis value
     * @param Zaxis
     * 			  Z axis value
     */
    public void mecanumDrive(double xAxis, double yAxis, double zAxis, double angle){
    	robotDrive.mecanumDrive_Cartesian(xAxis, yAxis, zAxis, angle);
    }
     /**
      * Stop the drive from moving.
      */
    public void stop() {
    	robotDrive.mecanumDrive_Cartesian(0, 0, 0, 0);
    }
    
    /**
     * @return The encoder getting the distance and speed of left front of the 
     *         drive.
     */
    public Encoder 
     //iklnj;ijknk
}

