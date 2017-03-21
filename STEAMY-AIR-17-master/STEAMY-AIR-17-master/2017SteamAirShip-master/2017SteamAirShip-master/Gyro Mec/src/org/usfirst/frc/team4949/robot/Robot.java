package org.usfirst.frc.team4949.robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
/**
 * This is a sample program that uses mecanum drive with a gyro sensor to
 * maintian rotation vectorsin relation to the starting orientation of the robot
 * (field-oriented controls).
 */
public class Robot extends IterativeRobot {
	// gyro calibration constant, may need to be adjusted;
	// gyro value of 360 is set to correspond to one full revolution
	private static final double kVoltsPerDegreePerSecond = 0.0128;

	private static final int kFrontLeftMotorPort = 0;
	private static final int kFrontRightMotorPort = 1;
	private static final int kRearLeftMotorPort = 2;
	private static final int kRearRightMotorPort = 3;
	private static final int kGyroPort = 0;
	private static final int kJoystickPort = 0;

	private RobotDrive myRobot;
	private AnalogGyro gyro = new AnalogGyro(kGyroPort);
	private Joystick joystick = new Joystick(kJoystickPort);
	
	private static final int kFrontLeftEncoderAPort = 4;
	private static final int kFrontLeftEncoderBPort = 5;
	private static final int kFrontRightEncoderAPort = 2;
	private static final int kFrontRightEncoderBPort = 3;
	private static final int kRearLeftEncoderAPort = 6;
	private static final int kRearLeftEncoderBPort = 7;
	private static final int kRearRightEncoderAPort = 0;
	private static final int kRearRightEncoderBPort = 1;
	
	private Encoder frontLeftEncoder = new Encoder(kFrontLeftEncoderAPort, kFrontLeftEncoderBPort, true, Encoder.EncodingType.k4X);
	private Encoder frontRightEncoder = new Encoder(kFrontRightEncoderAPort, kFrontRightEncoderBPort, true, Encoder.EncodingType.k4X);
	private Encoder rearLeftEncoder = new Encoder(kRearLeftEncoderAPort, kRearLeftEncoderBPort, true, Encoder.EncodingType.k4X);
	private Encoder rearRightEncoder = new Encoder(kRearRightEncoderAPort, kRearRightEncoderBPort, true, Encoder.EncodingType.k4X);
	//Will be defined and used later~
	double leftFrontEncode;
	
	@Override
	public void robotInit() {
		myRobot = new RobotDrive(kFrontLeftMotorPort, kFrontRightMotorPort,
			kRearLeftMotorPort, kRearRightMotorPort);
		
		LiveWindow.addActuator("Encoders", "Front Left", frontLeftEncoder );
		LiveWindow.addActuator("Encoders", "Front Right", frontRightEncoder);
		LiveWindow.addActuator("Encoders", "Rear Left", rearLeftEncoder);
		LiveWindow.addActuator("Encoders", "Rear Right", rearRightEncoder);
		
		// invert the left side motors
		// you may need to change or remove this to match your robot
		myRobot.setInvertedMotor(MotorType.kFrontLeft, true);
		myRobot.setInvertedMotor(MotorType.kRearLeft, true);
		
		gyro.setSensitivity(kVoltsPerDegreePerSecond);
	}

	/**
	 * Mecanum drive is used with the gyro angle as an input.
	 */
	@Override
	public void teleopPeriodic() {
		myRobot.mecanumDrive_Cartesian(joystick.getX(), joystick.getY(), joystick.getZ(), gyro.getAngle());
		leftFrontEncode = frontLeftEncoder.getDistance();
		System.out.println(leftFrontEncode);
	
	}
	
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
