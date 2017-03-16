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
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Solenoid;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Pneumatics extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Compressor compressor1 = RobotMap.pneumaticsCompressor1;
    private final Solenoid liftSolenoid1 = RobotMap.pneumaticsLiftSolenoid1;
    private final Solenoid liftSolenoid2 = RobotMap.pneumaticsLiftSolenoid2;
    private final Solenoid gobblerSolenoid = RobotMap.pneumaticsGobblerSolenoid;
    private final Solenoid rockerSolenoid = RobotMap.pneumaticsRockerSolenoid;
    private final Servo liftyDo1 = RobotMap.pneumaticsLiftyDo1;
    private final Servo liftyDo2 = RobotMap.pneumaticsLiftyDo2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void raiseBoxToLevel1 () {
    	liftSolenoid1.set(true);
    	
    	
    }
    public void raiseBoxToLevel2 () {
    	liftSolenoid2.set(true);
    }
    public void lowerBoxToLevel0 () {
    	liftSolenoid1.set(false);
    	liftSolenoid2.set(false);
    }
    public void shakeBox () {
    	rockerSolenoid.set(true);
    }
    public void hangGear () {
    	gobblerSolenoid.set(true);
    }
}
