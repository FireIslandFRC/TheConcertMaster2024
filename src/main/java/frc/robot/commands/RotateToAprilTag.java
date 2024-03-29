package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.LimelightHelpers;
import frc.robot.subsystems.SwerveSubsystem;

public class RotateToAprilTag extends Command {
  private SwerveSubsystem swerveSubs; 
  private PIDController RotationPID; 
  private boolean done = false;

  public RotateToAprilTag(SwerveSubsystem swerveSubs) {
    this.swerveSubs = swerveSubs; 
    RotationPID = new PIDController(0.01, 0, 0);

    addRequirements(swerveSubs);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double RotationSpeed;

<<<<<<< HEAD
    RotationSpeed = RotationPID.calculate(LimelightHelpers.getTX("limelight"), 0);

    swerveSubs.drive(0, 0, RotationSpeed, true, 1);

=======
    /*if (LimelightHelpers.getTX("limelight") > 0.5){*/

      RotationSpeed = RotationPID.calculate(LimelightHelpers.getTX("limelight"), 0);

    swerveSubs.drive(0, 0, RotationSpeed, true, 1);
    /*}else{
      done = true;
    }*/
>>>>>>> 707d38d (idrkatp)
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    swerveSubs.stopModules();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return done;
  }

  public double deadzone(double num){
    return Math.abs(num) > 0.1 ? num : 0;
}
}
