package driver;


public class Salesman {
	String name = " ";
	int sales = 0;		
	
	public Salesman(String name, int sales)
	{
		this.name = name;
		this.sales = sales;
	}
	public int getSales()
	{
		return sales;
	}

	public String getName()
	{
		return name;
	}
	//returns the top five salesman in the list
		public static Salesman[] getTopFive(Salesman[] allSales){
			Salesman[] topFiveSalesman = new Salesman[5];
			for(int i = 0; i < 5; i++)
			{				
				Salesman tempMaxSalesman = allSales[i];
				int tempMaxSalesmanIndex = i;
				for(int j = i; j < allSales.length; j++)
				{
					if (allSales[j].getSales() > tempMaxSalesman.getSales())
					{
						tempMaxSalesman = allSales[j];
						tempMaxSalesmanIndex = j;
					}
				}
				Salesman tempSalesman = allSales[i];
				allSales[i] = tempMaxSalesman;
				allSales[tempMaxSalesmanIndex] = tempSalesman;
				
			}
			for (int i = 0; i < topFiveSalesman.length; i++)
			{
				topFiveSalesman[i] = allSales[i];
			}
			return topFiveSalesman;
		}

}
