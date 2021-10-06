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
		return courseName;
	}
	
	public double getCostperCredit()
	{
		return costPerCredit;
	}
	
	public double getNumberofCredits() 
	{
		return numberofCredits;
	}
	
	
	public double getTotalTuition()
	{
		double cost;
		cost = costPerCredit * numberofCredits;
		return cost;
	}
	
	public String printTuitionDetails()
	{
		return JOptionPane.showInputDialog("");
	}
}
