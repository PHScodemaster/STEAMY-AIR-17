// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4949.LeVapeur.subsystems;

import org.usfirst.frc4949.LeVapeur.RobotMap;
import org.usfirst.frc4949.LeVapeur.commands.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drive extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Encoder rREncoder = RobotMap.driveRREncoder;
    private final Encoder fREncoder = RobotMap.driveFREncoder;
    private final Encoder fLEncoder = RobotMap.driveFLEncoder;
    private final Encoder rLEncoder = RobotMap.driveRLEncoder;
    private final SpeedController frontLeftMotor = RobotMap.driveFrontLeftMotor;
    private final SpeedController frontRightMotor = RobotMap.driveFrontRightMotor;
    private final SpeedController rearLeftMotor = RobotMap.driveRearLeftMotor;
    private final SpeedController rearRightMotor = RobotMap.driveRearRightMotor;
    private final RobotDrive mecanum = RobotMap.driveMecanum;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final ADXRS450_Gyro spiGyro = RobotMap.driveADXRS450_Gyro;


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new SweepField());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
        //Controls go here
        public void mecanumDrive(Joystick joy){
        	mecanum.mecanumDrive_Cartesian(joy.getX(), joy.getY(), joy.getZ(), 0);
        }
        
        /**
         * @param xAxis
         * 				X axis value
         * @param yAxis
         * 				y axis value
         * @param zAxis
         * 				z axis value
         */
        public void mecanumDrive(double xAxis, double yAxis, double zAxis, double angle){
        	mecanum.mecanumDrive_Cartesian(xAxis, yAxis, zAxis, angle);
        	
			Timer.delay(0.005); // wait 5ms to avoid hogging CPU cycles

        }
        
        /**
         * Stop the drive from moving
         */
        
        public void stop(){
        	mecanum.mecanumDrive_Cartesian(0, 0, 0, 0);
        }
        
        /**
         * @return The encoder getting the distance and speed of left front of the drive
         */
        
        public Encoder getLeftFrontEncoder(){
        	return fLEncoder;
        }
        
        /**
         * @return The encoder getting the distance and speed of left rear of the drive
         */
        
        public Encoder getLeftRearEncoder(){
        	return fREncoder;
        }
        
        /**
         * @return The encoder getting the distance and speed of the right front of the drive
         */
        
        public Encoder getRighFrontEncoder(){
        	return fREncoder;
        }
        
        /**
         * @return The encoder getting the distance and speed of the right rear of the drive
         */
        
        public Encoder getRightRearEncoder(){
        	return rREncoder;
        }
        
        /**
         * @return The current angle of the drive
         */
        
        public double getAngle(){
        	return spiGyro.getAngle();
        }
        public double getDistance(){
        	return 0;
        }
    }

    

