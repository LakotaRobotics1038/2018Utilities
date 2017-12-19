package org.usfirst.frc.team1038.robot;

import edu.wpi.first.wpilibj.I2C;

public class I2CGyro {
	//VARIABLES
	private final int SENSOR_ID_CODE = 0x02;
	private final int COMMAND = 0x03;
	private final int HEADING_DATA = 0x04;
	private final int INTEGRATED_Z_VALUE = 0x06;
	private final int RAW_X_VALUE = 0x08;
	private final int RAW_Y_VALUE = 0x0A;
	private final int RAW_Z_VALUE = 0x0C;
	private final int Z_AXIS_OFFSET = 0x0E;
	private final int DEVICE_ADDRESS = 0x10;
	private final int NORMAL_MEASUREMENT_MODE = 0x00;
	private final int GYRO_RECALIBRATE = 0x4E;
	private final int RESET_Z_AXIS_INTEGRATOR = 0x52;
	private I2C I2CBus;
	
	//Class constructor
	public I2CGyro()
	{
		I2CBus = new I2C(I2C.Port.kOnboard, DEVICE_ADDRESS);
		I2CBus.write(COMMAND, GYRO_RECALIBRATE);
		I2CBus.write(SENSOR_ID_CODE, NORMAL_MEASUREMENT_MODE);
	}
	
	//Reads and translates input from the Gyro into a value from 0-359
	public int readGyro()
	{
		byte[] dBuffer = new byte[2];
		I2CBus.read(HEADING_DATA, 2, dBuffer);
		int gyroVal = dBuffer[0] + (dBuffer[1] * 256);  
		if(gyroVal > 359) System.out.println("Unexpected Gyro Value From readGyro() read " + gyroVal + " max value should be 359");
		return gyroVal;
	}
	
	//Sets current gyro value to 0
	public void resetGyro()
	{
		I2CBus.write(COMMAND, RESET_Z_AXIS_INTEGRATOR);
	}
}
