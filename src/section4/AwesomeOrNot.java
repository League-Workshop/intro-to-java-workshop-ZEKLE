package section4;

import java.util.Random;

import javax.swing.JOptionPane;


public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
    public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int number = new Random().nextInt(4);
	// 3. Print out this variable
    System.out.println(number);
	// 4. Get the user to enter something that they think is awesome
    JOptionPane.showInputDialog(null, "hi im robot i want to know what you think is awesome!");
	// 5. If the random number is 0
    if (number == 0) {
	// -- tell the user whatever they entered is awesome!
     JOptionPane.showMessageDialog(null, "that sounds awesome!");
     }
	// 6. If the random number is 1
    if (number == 1);{
	// -- tell the user whatever they entered is ok.
    JOptionPane.showMessageDialog(null, "thats cool");}
	// 7. If the random number is 2
    if (number == 2);
	// -- tell the user whatever they entered is boring.
    JOptionPane.showMessageDialog(null, "BORING!");
	// 8. If the random number is 3
    if (number == 3);{
	// -- write your own answer
    JOptionPane.showMessageDialog(null, "why are you still talking?");}
}}


