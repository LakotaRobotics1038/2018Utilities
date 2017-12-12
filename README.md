# 2018Utilities
  A repository of utility classes for the 2018 FRC Season. This project contains several classes created for generic implementation across any future robot project
# Joystick1038.java 
  Defines all the button and joystick inputs of the Logitech joystick and then lists methods that call those definitions off the WPI Joystick class. This class is intended for use in place of the WPI Joystick class
# CIMCoder.java
  Defines the usage for a CIM Encoder. Uses the WPI Encoder class to store the location of an encoder, and based off encoder counts per revolution and wheel diameter, change the value of getCount() to output the units of wheelDiameter. (i.e. if wheelDiameter is inches, getCount() will output inches)
#
