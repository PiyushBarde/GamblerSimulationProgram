package com.bridgelabz.gamblersimulation;

import java.util.Scanner;

public class GamblerSimulation {

	public static void main(String[] args) {
		
		int condition = 0;
		int counterLosePerDay= 0;
		int counterWonPerDay=0;
		int [] won = new int[21];
		int [] lost = new int[21];
		System.out.println("Gambler starts every day with 100$");
		int betPlaced = 1;
		String ans = "Start";
		System.out.println("and Playes the bet of " + betPlaced + "$");
		while(ans.equals("Y") || ans.equals("Start"))	
		{
			for(int i=1; i<=20; i++)
				{
				int currentAmount = 100;
				int temp = i;
				while(currentAmount>=50 && currentAmount<=150) {
					if(currentAmount==50)
					{	
						won[i] = temp;
						counterWonPerDay=counterWonPerDay+1;
						System.out.println("gambler lost & calling a day " + i);
						break;
					}
					else if(currentAmount==150)
					{	
						lost[i] = temp;
						counterLosePerDay=counterLosePerDay+1;
						System.out.println("gambler won & calling a day " + i);
						break;
					}
					condition = (int) (Math.floor(Math.random()*10)%2);
					if(condition==1)
					{
						currentAmount++;
			//			System.out.println("Gambler wont the bet and he have " + currentAmount + " $");
						
					}
					else
					{
						currentAmount--;
			//			System.out.println("Gambler lost the bet and he have " + currentAmount + " $");	
					}
				}
			}
			int totalWonInAmonth = (counterWonPerDay*50) - (counterLosePerDay*50);
			System.out.println("Total days gambler won = " + counterWonPerDay);
			System.out.println("Total days gambler lose = " + counterLosePerDay);
			
			if(totalWonInAmonth<0)
			{
				System.out.println("Total amount lost in 20 days that is in a month is " + Math.abs(totalWonInAmonth));
				System.out.println("In 20 days he lost " + Math.abs(totalWonInAmonth) + " $ amount");
			}
			else if(totalWonInAmonth>0)
			{
				System.out.println("Total amount won in 20 days that is in a month is " + totalWonInAmonth);
				System.out.println("In 20 days he won " + Math.abs(totalWonInAmonth) + " $ amount");
			}
			else
			{
				System.out.println("Neither won or loss any dollar");
			}
			
				System.out.println("Lucky days are = ");
				for(int j=1; j<=20; j++) 
				{
				if(won[j]!= 0)
				{
					System.out.println("day :" + won[j]);
				}
				}
				System.out.println("Unlucky days are");
				for(int j=1; j<=20; j++) 
				{
				if(lost[j] !=0) {
					System.out.println("day : " + lost[j]);
				}	
				}
			ans = "Stop";
			Scanner sc = new Scanner(System.in);
			System.out.println("Do you want to Continue Gambling for next month ?(Y-yes/N-no)");
			ans = sc.nextLine();
			if(totalWonInAmonth>0)
			{
				if(ans.equals("Y")) 
				{
				System.out.println("Next month Gambling result -------->");	
				}
				else {
					System.out.println("Program Ended");
					break;
				}
			}
				
		}
	}
}
