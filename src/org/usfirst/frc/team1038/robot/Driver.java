package org.usfirst.frc.team1038.robot;

import edu.wpi.first.wpilibj.RobotDrive;

public class Driver {
	
	private Joystick1038 joystick;
	private RobotDrive drive;
	public enum driveMode {tankDrive, singleArcadeDrive, dualArcadeDrive};
	private driveMode current = driveMode.dualArcadeDrive;
	
	
	public Driver(Joystick1038 aJoystick, RobotDrive aDrive)
	{
		joystick = aJoystick;
		drive = aDrive;
	}
	
	public void drive()
	{
		
	}

	public void driveSelector()
	{
		
	}
}
