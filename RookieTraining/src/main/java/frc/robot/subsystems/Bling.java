package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Bling extends SubsystemBase {
    //Bling CLass//
    public AddressableLED m_LED;
    public AddressableLEDBuffer m_LEDBuffer;


    public int ledR = 0;
    public int ledG = 0;
    public int ledB = 0;


    /*
     * COLOR CODES
     * Red: 15, 0, 0
     * Orange: 24, 10, 0 
     * Yellow: 20, 20, 1
     * Green: 0, 15, 15
     * Blue: 0, 0, 5
     * Purple: 9, 2, 6
     */
    

     public Bling(){
        m_LED = new AddressableLED(0);
        //TBD//
        m_LEDBuffer = new AddressableLEDBuffer(8);
        m_LED.setLength(m_LEDBuffer.getLength());
        m_LED.setData(m_LEDBuffer);
        m_LED.start();
        //Next stuff is to add to shuffleboard//
        SmartDashboard.putNumber("R Value", ledR);
        SmartDashboard.putNumber("G Value", ledG);
        SmartDashboard.putNumber("B Value", ledB);
         
     }


     @Override
     public void periodic(){
        //Period runs once per scheduled run//
        m_LED.setData(m_LEDBuffer);
        //More shuffleboard things//
        ledR = (int)SmartDashboard.getNumber("R Value", ledR);
        ledG = (int)SmartDashboard.getNumber("G Value", ledG);
        ledB = (int)SmartDashboard.getNumber("B Value", ledB);

     }

     public void setRGB(int i, int r, int g, int b){
        m_LEDBuffer.setRGB(i, r, g, b);
        //This will let you change the color of a LED strip from a command//
     }
    
}
