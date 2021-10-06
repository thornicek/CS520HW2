package cs520.hw2.part1;

import javax.swing.JOptionPane;

public class Course {

	private String courseName;
	private int costPerCredit;
	private int numberofCredits;
	
	public void setCourseName(String x)
	{
		courseName= x;
	}
	
	public void setCostPerCredit(int value)
	{
		costPerCredit= value;
	}
	
	public void setNumberofCredits(int value) 
	{
		numberofCredits= value;
	}
	
	
	public String getCourseName()
	{	
		courseName = JOptionPane.showInputDialog("What is the name of the course you are taking?");
		return courseName;
	}
	
	public int getCostperCredit()
	{
		String input = JOptionPane.showInputDialog("What is the cost per credit of this course?");
		costPerCredit = Integer.parseInt(input);
		return costPerCredit;
	}
	
	public int getNumberofCredits() 
	{
		String input = JOptionPane.showInputDialog("How many credits is this course?");
		numberofCredits = Integer.parseInt(input);
		return numberofCredits;
	}
	
	
	public int getTotalTuition()
	{
		int cost;
		cost = costPerCredit * numberofCredits;
		return cost;
	}
	
	public String printTuitionDetails()
	{
		String print = JOptionPane.showInputDialog( "The cost of " + courseName +" is $" + getTotalTuition() );
		return print;
	}
	
}
