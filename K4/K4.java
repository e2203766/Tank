package K4;

import robocode.*;
import java.awt.Color;

public class K4 extends AdvancedRobot {
  
    int gunDirection = 1;

    public void run() {
        setColors(Color.blue, Color.yellow, Color.yellow); // Set colors for the robot components
        
        while (true) {
            turnGunRight(360); // Infinite loop to make the robot constantly turn its gun right
        }
    }
	

    public void onScannedRobot(ScannedRobotEvent e) {
        setTurnRight(e.getBearing()); // Turn the robot's body right towards the scanned robot
        setFire(4); // Fire a bullet with power 4
        setAhead(360); // Move the robot ahead by 360 units
         //double energy = getEnergy();
        gunDirection = -gunDirection; // Change the direction of the gun movement
        setTurnGunRight(360 * gunDirection); // Turn the gun right by 360 units multiplied by the gunDirection

        execute(); // Execute all pending robot actions
    }

    
}
