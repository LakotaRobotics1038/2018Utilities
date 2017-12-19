package org.usfirst.frc.team1038.robot;

import edu.wpi.first.wpilibj.RobotDrive;

public class AutonDriveForward {
	
	private RobotDrive drive;
	private I2CGyro gyro;
	private CIMCoder leftEncoder;
	private CIMCoder rightEncoder;

	public AutonDriveForward(RobotDrive aDrive, I2CGyro aGyro, CIMCoder aLeftEncoder, CIMCoder aRightEncoder)
	{
		drive = aDrive;
		gyro = aGyro;
		leftEncoder = aLeftEncoder;
		rightEncoder = aRightEncoder;
	}
	
	public void driveStraight(double distance)
	{
		while (leftEncoder.getCount() < distance)
		{
			drive.drive(.3, 0);
		}
	}
}
