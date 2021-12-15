package com.bridgelabz.gamblersimulation;

public class GamblerSimulation {

	public static void main(String[] args) {
		int currentAmount = 100;
		int condition = 0;
		System.out.println("Gambler starts every day with " + currentAmount + "$");
		int betPlaced = 1;
		System.out.println("and Playes the bet of " + betPlaced + "$");
		while(currentAmount>50 && currentAmount<150) {
			
			if(currentAmount==50)
			{
				System.out.println("gambler lost & calling a day");
				break;
			}
			else if(currentAmount==150)
			{
				System.out.println("gambler won & calling a day");
				break;
			}
			condition = (int) (Math.floor(Math.random()*10)%2);
			if(condition==1)
			{
				currentAmount++;
				System.out.println("Gambler wont the bet and he have " + currentAmount + " $");
				
			}
			else
			{
				currentAmount--;
				System.out.println("Gambler lost the bet and he have " + currentAmount + " $");	
			}
		}
	}
}
