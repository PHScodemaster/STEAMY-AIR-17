// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4949.RobotSteamWorks;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Solenoid pneumaticsSolenoid1;
    public static Compressor pneumaticsCompressor1;
    public static Relay pneumaticsRelaySolenoid1;
    public static DoubleSolenoid pneumaticsDoubleSolenoid1;
    public static SpeedController picker/ShooterSpeedController1;
    public static Encoder driveQuadratureEncoder1;
    public static Encoder driveQuadratureEncoder2;
    public static Encoder driveQuadratureEncoder3;
    public static Encoder driveQuadratureEncoder4;
    public static SpeedController driveSpeedController1;
    public static SpeedController driveSpeedController2;
    public static SpeedController driveSpeedController3;
    public static SpeedController driveSpeedController4;
    public static AnalogGyro driveAnalogGyro;
    public static SpeedController climber;
    public static Servo cameraPan;
    public static Servo cameraTilt;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        pneumaticsSolenoid1 = new Solenoid(0, 0);
        LiveWindow.addActuator("Pneumatics", "Solenoid 1", pneumaticsSolenoid1);
        
        pneumaticsCompressor1 = new Compressor(0);
        
        
        pneumaticsRelaySolenoid1 = new Relay(0);
        LiveWindow.addActuator("Pneumatics", "Relay Solenoid 1", pneumaticsRelaySolenoid1);
        
        pneumaticsDoubleSolenoid1 = new DoubleSolenoid(0, 1, 2);
        LiveWindow.addActuator("Pneumatics", "Double Solenoid 1", pneumaticsDoubleSolenoid1);
        
        picker/ShooterSpeedController1 = new Talon(7);
        LiveWindow.addActuator("Picker/ Shooter", "Speed Controller 1", (Talon) picker/ShooterSpeedController1);
        
        driveQuadratureEncoder1 = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Drive", "Quadrature Encoder 1", driveQuadratureEncoder1);
        driveQuadratureEncoder1.setDistancePerPulse(1.0);
        driveQuadratureEncoder1.setPIDSourceType(PIDSourceType.kRate);
        driveQuadratureEncoder2 = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("Drive", "Quadrature Encoder 2", driveQuadratureEncoder2);
        driveQuadratureEncoder2.setDistancePerPulse(1.0);
        driveQuadratureEncoder2.setPIDSourceType(PIDSourceType.kRate);
        driveQuadratureEncoder3 = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("Drive", "Quadrature Encoder 3", driveQuadratureEncoder3);
        driveQuadratureEncoder3.setDistancePerPulse(1.0);
        driveQuadratureEncoder3.setPIDSourceType(PIDSourceType.kRate);
        driveQuadratureEncoder4 = new Encoder(6, 7, false, EncodingType.k4X);
        LiveWindow.addSensor("Drive", "Quadrature Encoder 4", driveQuadratureEncoder4);
        driveQuadratureEncoder4.setDistancePerPulse(1.0);
        driveQuadratureEncoder4.setPIDSourceType(PIDSourceType.kRate);
        driveSpeedController1 = new Talon(0);
        LiveWindow.addActuator("Drive", "Speed Controller 1", (Talon) driveSpeedController1);
        
        driveSpeedController2 = new Talon(1);
        LiveWindow.addActuator("Drive", "Speed Controller 2", (Talon) driveSpeedController2);
        
        driveSpeedController3 = new Talon(2);
        LiveWindow.addActuator("Drive", "Speed Controller 3", (Talon) driveSpeedController3);
        
        driveSpeedController4 = new Talon(3);
        LiveWindow.addActuator("Drive", "Speed Controller 4", (Talon) driveSpeedController4);
        
        driveAnalogGyro = new AnalogGyro(0);
        LiveWindow.addSensor("Drive", "AnalogGyro", driveAnalogGyro);
        driveAnalogGyro.setSensitivity(0.007);
        climber = new Talon(6);
        LiveWindow.addActuator("Climber", "", (Talon) climber);
        
        cameraPan = new Servo(4);
        LiveWindow.addActuator("Camera", "Pan", cameraPan);
        
        cameraTilt = new Servo(5);
        LiveWindow.addActuator("Camera", "Tilt", cameraTilt);
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
