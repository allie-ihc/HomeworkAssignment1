package driver;
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Salesman[] allSalesman = new Salesman[10];
		String[] salesmanNames = {"Gus", "Shawn", "Riley", "Irmingard", "Cecelia", "Grace", "Sophie", "Abbie", "Brandon", "Alicia"};
		for(int i = 0; i < allSalesman.length; i++)
		{
			Random rand = new Random();
			allSalesman[i] = new Salesman(salesmanNames[i], rand.nextInt(10000 - 0 + 1));
		}

		for (int i = 0; i < allSalesman.length; i++)
		{
			System.out.println(allSalesman[i].getName() + ": " + allSalesman[i].getSales());
		}
		System.out.println();
		Salesman[] topFive = Salesman.getTopFive(allSalesman);
		for (int i = 0; i <topFive.length; i++)
		{
			System.out.println(topFive[i].getName() + ": " + topFive[i].getSales());
		}
		System.out.println();
		for (int i = 0; i < allSalesman.length; i++)
		{
			System.out.println(allSalesman[i].getName() + ": " + allSalesman[i].getSales());
		}
	}
	
	
}
