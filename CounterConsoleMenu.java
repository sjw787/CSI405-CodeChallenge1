/* Team 2
 * Sam Wylock
 * Andrew Tsui
 * Nicholas Meyers
 * 06/30/2015
 * The counterconsole class that contains all of the implementation of the counter gui. This is where the button handlers and action listeners to the gui reside
 */ 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CounterConsoleMenu extends JFrame implements ActionListener{
  
 Container container;               // This will be the window in which the counter pops up in (the blue box and the buttonPanel are held contained by this
 Counter result ;                // This is the blue box in which the result is found in
 JPanel buttonPanel = new JPanel(); // This is the panel in the window that contains the buttons (does not contain the blue result box)
 JButton button[] = new JButton[3]; // This is the array of buttons that will be added to the buttonPanel
 String buttonLabels[] = {"+", "-", "reset"};  // This is the array of names for identifying each button
 int currentCount = 0;              // This is the counter variable that is displayed as the count in the blue result box
 String Screen="";                  // This is the string that holds the text in the blue text 
 
 
 public CounterConsoleMenu(){  // Constructor
   super ("Counter: Team 2");                  // Calls the JFrame Constructor, label "Counter: Team 2" appears at the top of window
   container = getContentPane();               // Gets the area where we put the content of the window and assigns it to the container
   result = new Counter();       // Makes the box blue
   buttonPanel.setLayout(new GridLayout(3,1)); // Makes the layout be 3 rows down and 1 column wide
  
   for(int i = 0; i < buttonLabels.length; i++){ // Loop that puts all of the buttons into the buttonPanel
    button[i] = new JButton(buttonLabels[i]);    // Puts the apropriate name on the button
    button[i].addActionListener(this);           // Links the actionListener to this button
    buttonPanel.add(button[i]);                  // Adds the button to the buttonPanel
   }
   
   container.add(result,BorderLayout.NORTH);  // Puts the blue box at the top (can switch to bottom by using SOUTH) 
   container.add(buttonPanel);                // Adds the buttonPanel (which now is filled with buttons) to the container
   
   setSize(300,300);                                // Makes the Counter window 300 by 300
   setVisible(true);                                // Makes the Counter window visible to the user
   setResizable(false);                             // Makes it so the user cannot resize the Counter window
   setLocationRelativeTo(null);                     // Doesn't make the Counter show up anywhere in particular on the screen (shows up in center screen)
   result.setText(Integer.toString(currentCount));  // Sets the initial value seen in the blue text box (0) when counter is created
 }
  
   public void actionPerformed(ActionEvent event){  // Listens for actions performed by the buttons, we linked them to this method in the Constructor    
    if(event.getSource() == button[0]){ // Increments the count
    result.add(); // Updates the blue text box
    }
    
    if(event.getSource() == button[1]){ // Decrements the count
     result.sub(); // Updates the blue text box
    }
     
    if(event.getSource() == button[2]){ // Resets the count to 0 
    result.reset(); // Updates the blue text box
    }     
   }//end actionPerformed 
  

}