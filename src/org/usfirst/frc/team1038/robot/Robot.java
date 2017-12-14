package org.usfirst.frc.team1038.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	final String defaultAuto = "Default";
	final String customAuto = "My Auto";
	String autoSelected;
	SendableChooser<String> chooser = new SendableChooser<>();
	
	//Robot Motor Code
	final private int LEFT_MOTOR_PORT = 0;
	final private int RIGHT_MOTOR_PORT = 1;
	Spark leftMotor = new Spark(LEFT_MOTOR_PORT);
	Spark rightMotor = new Spark(RIGHT_MOTOR_PORT);
	RobotDrive drive = new RobotDrive(leftMotor, rightMotor);
	
	//Gyro
	I2CGyro gyro = new I2CGyro();
	
	//Encoders
	final private int ENCODER_COUNTS_PER_REV = 220;
	final private double WHEEL_DIAMETER = 6;
	final private int LEFT_ENCODER_PORT_A = 0;
	final private int LEFT_ENCODER_PORT_B = 1;
	final private boolean LEFT_ENCODER_INVERTED = true;
	final private int RIGHT_ENCODER_PORT_A = 2;
	final private int RIGHT_ENCODER_PORT_B = 3;
	final private boolean RIGHT_ENCODER_INVERTED = false;
	CIMCoder leftEncoder = new CIMCoder(LEFT_ENCODER_PORT_A, LEFT_ENCODER_PORT_B, LEFT_ENCODER_INVERTED, ENCODER_COUNTS_PER_REV, WHEEL_DIAMETER);
	CIMCoder rightEncoder = new CIMCoder(RIGHT_ENCODER_PORT_A, RIGHT_ENCODER_PORT_A, RIGHT_ENCODER_INVERTED, ENCODER_COUNTS_PER_REV, WHEEL_DIAMETER);

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		chooser.addDefault("Default Auto", defaultAuto);
		chooser.addObject("My Auto", customAuto);
		SmartDashboard.putData("Auto choices", chooser);
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString line to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the
	 * switch structure below with additional strings. If using the
	 * SendableChooser make sure to add them to the chooser code above as well.
	 */
	@Override
	public void autonomousInit() {
		autoSelected = chooser.getSelected();
		// autoSelected = SmartDashboard.getString("Auto Selector",
		// defaultAuto);
		System.out.println("Auto selected: " + autoSelected);
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		switch (autoSelected) {
		case customAuto:
			// Put custom auto code here
			break;
		case defaultAuto:
		default:
			// Put default auto code here
			break;
		}
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
	}
}

