package org.usfirst.frc.team4949.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Timer;

/**
 * This is a demo programiik showing how to use Mecanum control with the RobotDrive
 * class.
 */
public class Robot extends SampleRobot {
	RobotDrive robotDrive;

	// Channels for the wheels
	final int kFrontLeftChannel = 2;
	final int kRearLeftChannel = 3;
	final int kFrontRightChannel = 1;
	final int kRearRightChannel = 0;

	// The channel on the driver station that the joystick is connected to
	final int kJoystickChannel = 0;

	Joystick stick = new Joystick(kJoystickChannel);

	public Robot() {
		robotDrive = new RobotDrive(kFrontLeftChannel, kRearLeftChannel, kFrontRightChannel, kRearRightChannel);
		//Motors are over here (if you cannot read)
		robotDrive.setInvertedMotor(MotorType.kFrontLeft, false); // invert the left side motors
		robotDrive.setInvertedMotor(MotorType.kRearLeft, false);  // you may need to change or remove this
																  // to match your robot
		robotDrive.setInvertedMotor(MotorType.kFrontRight, true);
		robotDrive.setInvertedMotor(MotorType.kRearRight, true);
		robotDrive.setExpiration(0.1);
		//ssstick.getY
	}

	/**
	 * Runs the motors with Mecanum drive.
	 */
	@Override
	public void operatorControl() {
		robotDrive.setSafetyEnabled(true);
		while (isOperatorControl() && isEnabled()) {

			// Use the joystick X axis for lateral movement, Y axis for forward
			// movement, and Z axis for rotation.
			// This sample does not use field-oriented drive, so the gyro input
			// is set to zero.
			
			//robotDrive.mecanumDrive_Cartesian(stick.getX(), stick.getY(), stick.getZ(), 0);
			robotDrive.mecanumDrive_Cartesian(stick.getX(), stick.getY(), stick.getZ(), 0);

			Timer.delay(0.005); // wait 5ms to avoid hogging CPU cycles
		}
	}
}