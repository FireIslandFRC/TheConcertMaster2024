package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Hand;

public class ShootAtSafe extends Command {


  public ShootAtSafe() {

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Arm.ArmToDistance(16);
    Hand.ShootAtSpeed(0.9);
  }


  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Hand.StopIntake();
    Arm.StopArm();

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return Arm.ArmIsAtPoint(4);
  }
}
