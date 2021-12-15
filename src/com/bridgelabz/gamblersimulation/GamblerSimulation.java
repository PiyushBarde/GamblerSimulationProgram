package com.bridgelabz.gamblersimulation;

public class GamblerSimulation {

	public static void main(String[] args) {
		
		int condition = 0;
		int counterLosePerDay= 0;
		int counterWonPerDay=0;
		System.out.println("Gambler starts every day with 100$");
		int betPlaced = 1;
		System.out.println("and Playes the bet of " + betPlaced + "$");
		for(int i=1; i<=20; i++)
		{
			int currentAmount = 100;
			while(currentAmount>=50 && currentAmount<=150) {
				if(currentAmount==50)
				{
					counterWonPerDay=counterWonPerDay+1;
					System.out.println("gambler lost & calling a day " + i);
					break;
				}
				else if(currentAmount==150)
				{	
					counterLosePerDay=counterLosePerDay+1;
					System.out.println("gambler won & calling a day " + i);
					break;
				}
				condition = (int) (Math.floor(Math.random()*10)%2);
				if(condition==1)
				{
					currentAmount++;
				//	System.out.println("Gambler wont the bet and he have " + currentAmount + " $");
					
				}
				else
				{
					currentAmount--;
				//	System.out.println("Gambler lost the bet and he have " + currentAmount + " $");	
				}
			}
		}
		int totalWonInAmonth = (counterWonPerDay*50) - (counterLosePerDay*50);
		if(totalWonInAmonth<0)
		{
			System.out.println("Total amount lost in 20 days that is in a month is " + Math.abs(totalWonInAmonth));
		}
		else if(totalWonInAmonth>0)
		{
			System.out.println("Total amount won in 20 days that is in a month is " + totalWonInAmonth);
		}
		else
		{
			System.out.println("Neither won or loss any dollar");
		}
	}
}
