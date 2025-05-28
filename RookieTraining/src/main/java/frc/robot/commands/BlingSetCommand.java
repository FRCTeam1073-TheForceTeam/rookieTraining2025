package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Bling;

public class BlingSetCommand extends Command
{
    Bling bling;
    

    //Create a new BlingSetCommand//
    public BlingSetCommand(Bling bling_){
        bling = bling_;
        addRequirements(bling);
    }

    @Override
    public void initialize(){
        bling.setRGB(1, 15, 0, 0);
        //Sets the first bling to red
    }

    @Override
    public void execute(){
        bling.setRGB(2, 0, 15, 15);
    }

    @Override
    public void end(boolean interrupted){
        bling.setRGB(1, 0, 0, 0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
