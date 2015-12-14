/* Team 2
 * Sam Wylock
 * Andrew Tsui
 * Nicholas Meyers
 * 07/03/2015
 * This is the counter class which contains the implementation to the counter class.
 * this is called by the counter console class to help increment everytime a button is pressed.
 */ 
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
public class Counter extends JTextField{
  int count;
  public Counter(){
    
   this.setEditable(false); // sets the text field to be non editable to prevent anyone from messing uo the count
   this.setBackground(Color.cyan);       //sets the background color to cyan
    count=0;
    
  }
   // decrements the textfield by one count
 public void sub(){
    
    if(count < 0){
      JOptionPane.showMessageDialog( Counter.this,
            "You cannot go below 0", "Error", JOptionPane.ERROR_MESSAGE);
    }else{
      this.setText(Integer.toString(count--));
    }
 }
  
  //increments the textfield by one
  public void add(){
    if(count >= 15){
      JOptionPane.showMessageDialog( Counter.this,
            "You cannot go over 15", "Error", JOptionPane.ERROR_MESSAGE);
    }else{
      this.setText(Integer.toString(++count));
    }
  }
  
  public void reset(){
    
    
    this.setText(Integer.toString(count = 0));//resets the textfield back to 0
    
  }
  
  
  
  
}