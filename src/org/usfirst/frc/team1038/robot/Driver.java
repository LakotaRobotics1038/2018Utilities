package org.usfirst.frc.team1038.robot;

import edu.wpi.first.wpilibj.RobotDrive;

public class Driver {
	
	private Joystick1038 joystick;
	private RobotDrive drive;
	public enum driveMode {tankDrive, singleArcadeDrive, dualArcadeDrive};
	private driveMode currentDriveMode = driveMode.dualArcadeDrive;
	private final boolean squaredInputs = true;
	
	
	public Driver(Joystick1038 aJoystick, RobotDrive aDrive)
	{
		joystick = aJoystick;
		drive = aDrive;
	}
	
	public void drive()
	{
		switch (currentDriveMode)
		{
		case tankDrive:
			drive.tankDrive(joystick.getLeftJoystickVertical(), joystick.getRightJoystickVertical(), squaredInputs);
			break;
		case singleArcadeDrive:
			drive.arcadeDrive(joystick.getLeftJoystickVertical(), joystick.getLeftJoystickHorizontal(), squaredInputs);
			break;
		case dualArcadeDrive:
			drive.arcadeDrive(joystick.getLeftJoystickVertical(), joystick.getRightJoystickHorizontal(), squaredInputs);
			break;
		}
	}

	public void driveSelector()
	{
		switch (currentDriveMode)
		{
		case tankDrive:
			currentDriveMode = driveMode.singleArcadeDrive;
			break;
		case singleArcadeDrive:
			currentDriveMode = driveMode.dualArcadeDrive;
			break;
		case dualArcadeDrive:
			currentDriveMode = driveMode.tankDrive;
			break;
		}
	}
}
