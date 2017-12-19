package org.usfirst.frc.team1038.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Joystick1038 {
	
	//Button Locations
	private final int X_BUTTON = 1;
	private final int A_BUTTON = 2;
	private final int B_BUTTON = 3;
	private final int Y_BUTTON = 4;
	private final int LEFT_BUTTON = 5;
	private final int RIGHT_BUTTON = 6;
	private final int LEFT_TRIGGER = 7;
	private final int RIGHT_TRIGER = 8;
	private final int BACK_BUTTON = 9;
	private final int START_BUTTON = 10;
	private final int LEFT_JOYSTICK_CLICK = 11;
	private final int RIGHT_JOYSTICK_CLICK = 12;
	
	//Joystick locations
	private final int LEFT_STICK_VERTICAL = 0;
	private final int LEFT_STICK_HORIZONTAL = 1;
	private final int RIGHT_STICK_VERTICAL = 2;
	private final int RIGHT_STICK_HORIZONTAL = 3;
	
	private Joystick joystick;
	
	public Joystick1038(int port)
	{
		joystick = new Joystick(port);
	}
	
	public boolean getXButton()
	{
		return joystick.getRawButton(X_BUTTON);
	}
	
	public boolean getAButton()
	{
		return joystick.getRawButton(A_BUTTON);
	}
	
	public boolean getBButton()
	{
		return joystick.getRawButton(B_BUTTON);
	}
	
	public boolean getYButton()
	{
		return joystick.getRawButton(Y_BUTTON);
	}
	
	public boolean getLeftButton()
	{
		return joystick.getRawButton(LEFT_BUTTON);
	}
	
	public boolean getRightButton()
	{
		return joystick.getRawButton(RIGHT_BUTTON);
	}
	
	public boolean getLeftTrigger()
	{
		return joystick.getRawButton(LEFT_TRIGGER);
	}
	
	public boolean getRightTrigger()
	{
		return joystick.getRawButton(RIGHT_TRIGER);
	}
	
	public boolean getBackButton()
	{
		return joystick.getRawButton(BACK_BUTTON);
	}
	
	public boolean getStartButton()
	{
		return joystick.getRawButton(START_BUTTON);
	}
	
	public boolean getLeftJoystickClick()
	{
		return joystick.getRawButton(LEFT_JOYSTICK_CLICK);
	}
	
	public boolean getRightJoystickClick()
	{
		return joystick.getRawButton(RIGHT_JOYSTICK_CLICK);
	}
	
	public double getLeftJoystickVertical()
	{
		return joystick.getRawAxis(LEFT_STICK_VERTICAL) * -1;
	}
	
	public double getLeftJoystickHorizontal()
	{
		return joystick.getRawAxis(LEFT_STICK_HORIZONTAL) * -1;
	}
	
	public double getRightJoystickVertical()
	{
		return joystick.getRawAxis(RIGHT_STICK_VERTICAL) * -1;
	}
	
	public double getRightJoystickHorizontal()
	{
		return joystick.getRawAxis(RIGHT_STICK_HORIZONTAL) * -1;
	}
}
