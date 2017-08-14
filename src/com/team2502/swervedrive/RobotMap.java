package com.team2502.swervedrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    private RobotMap() {}

    public static final class Joystick
    {
        //define joysticks here
        public static final int JOYSTICK_DRIVE_LEFT = 1;
        public static final int JOYSTICK_DRIVE_RIGHT = 0;

        private Joystick() {}

        public static final class Button
        {
            //define buttons here
            //EX: public static final int GO_SLOW = 1;

            private Button() {}
        }
    }

    public static final class Electrical { private Electrical() {} }

    public static final class Motor
    {
        public static int CIM_TALON_0 = 1;
        public static int BANE_Talon_0 = 2;
        public static int CIM_TALON_1 = 3;
        public static int BANE_Talon_1 = 4;
        public static int CIM_TALON_2 = 5;
        public static int BANE_Talon_2 = 6;
        public static int CIM_TALON_3 = 7;
        public static int BANE_Talon_3 = 8;

        private Motor() {}
    }

    public static final class Solenoid
    {
        //Define Solenoid here
        //EX: public static final int TRANSMISSION_SWITCH = 0;

        private Solenoid() {}
    }

}
