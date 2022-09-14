package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter start amount: ");
		double startAmount = in.nextDouble();
		System.out.print("Enter win limit: ");
		double winLimit = in.nextDouble();
		System.out.print("Enter win chance: ");
		double winChance = in.nextDouble();
		System.out.print("Enter number of simulations: ");
		double simulations = in.nextDouble();
		double plays = 0;
		double money = 0;
		double days = 0;
		double ruins = 0;
		
		//boolean win = Math.random() >= winChance;
		while(days < simulations){
		while(money<winLimit&&money>0)
		{
	
		if(Math.random()<winChance)
		{
			money ++;
			simulations++;
			plays++;
			System.out.println(money);
			System.out.println(simulations);
			System.out.println(plays);
		}
		else
		{
			money --;
			simulations ++;
			plays++;
			System.out.println(money);
			System.out.println(simulations);
			System.out.println(plays);
		}
		
		}
		days++;
		System.out.println(days);
		}	
	}

}
