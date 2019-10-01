/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minecraftmods;

import java.awt.AWTException;
import java.awt.EventQueue;
import java.awt.Robot;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.event.InputEvent.BUTTON1_DOWN_MASK;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class AUtoClicker 
{
     static TextField b=new TextField();
   static int c;static double d;
     static JLabel e=new JLabel();
     static byte check=0;
public static void main(String[] args) throws AWTException, InterruptedException {
  JFrame a=new JFrame("hi");
     JButton b1=new JButton("ENTER");
EventQueue.invokeLater(new Runnable()
        {
      @Override
      public void run() {
          a.setVisible(true);
          a.setDefaultCloseOperation(EXIT_ON_CLOSE);
      }
        });
        a.setLayout(null);
     a.setSize(500,500);
       b.setBounds(200,200, 100,200);
    e.setBounds(10,200, 150,200);
a.add(b);
a.add(e);
e.setText("ENTER number of times");
a.add(b1);
b1.addActionListener(al);
b1.setBounds(10,100, 100, 100);
    }
public static void execute() throws AWTException, InterruptedException
{  Robot r=new Robot();
        Thread.sleep(5000);
        for(int i=0;i<=c;i++)
        {
            r.mousePress(BUTTON1_DOWN_MASK);
            r.delay((int)d*1000);
            r.mouseRelease(BUTTON1_DOWN_MASK);
       r.delay(200);
}        
}
 static ActionListener al=new ActionListener()
 {
     @Override
     public void actionPerformed(ActionEvent ae )
{
         switch (check) {
             case 0:
                 c=Integer.parseInt(b.getText());
                 e.setText("ENTER duration in seconds");
                 break;
             case 1:
                 d=Double.parseDouble(b.getText());
             default:
                  try {
                     execute();
                 } catch (AWTException | InterruptedException ex) {
                 }
break;
         }
check++;
}
 };
         }


        
    
    

