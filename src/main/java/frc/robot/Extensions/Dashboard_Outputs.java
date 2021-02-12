// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Extensions;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTable;
import frc.robot.Constants;

/** Add your docs here. */

public class Dashboard_Outputs {
    public double getMaxSpeed(){
        NetworkTable table=NetworkTableInstance.getDefault().getTable("Shuffleboard/Drivetrain");
        double maxSpeed = table.getEntry("Max Speed").getDouble(Constants.speedLimitDefault);
        return maxSpeed;
    }
}