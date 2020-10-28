import java.util.Scanner;
import java.io.*;
class ProgressiveTaxation{
	public static double marriedFiledJointly(double income)
	{
		double totaltax = 0;
		if (income <= 19900)
		{
			totaltax += income*0.10;
		}
		else if (income <= 81050)
		{
			totaltax += 1990 + (income - 19900)*0.12;
		}
		else if (income <= 172750)
		{
			totaltax += 9328 + (income-81050)*0.22;
		}
		else if (income <= 329850)
		{
			totaltax += 29502 + (income-172750)*0.24;
		}
		else if (income <= 418850)
		{
			totaltax += 67206 + (income-329850)*0.32;
		}
		else if (income <= 628300)
		{
			totaltax += 95686 + (income-418850)*0.35;
		}
		else
		{
			totaltax += 168993.50 + (income-628300)*0.37;
		}
		return totaltax;
	}
	public static double headOfHousehold(double income)
	{
		double totaltax = 0;
		if (income <= 14200)
		{
			totaltax += income*0.10;
		}
		else if (income <= 54200)
		{
			totaltax += 1420 + (income - 14200)*0.12;
		}
		else if (income <= 86350)
		{
			totaltax += 6220 + (income-54200)*0.22;
		}
		else if (income <= 164900)
		{
			totaltax += 13293 + (income-86350)*0.24;
		}
		else if (income <= 209400)
		{
			totaltax += 32145 + (income-164900)*0.32;
		}
		else if (income <= 523600)
		{
			totaltax += 46385 + (income-209400)*0.35;
		}
		else
		{
			totaltax += 156355 + (income-523600)*0.37;
		}
		return totaltax;
	}
	public static double singleFiled(double income)
	{
		double totaltax = 0;
		if (income <= 9950)
		{
			totaltax += income*0.10;
		}
		else if (income <= 40525)
		{
			totaltax += 995 + (income - 9950)*0.12;
			return totaltax;
		}
		else if (income <= 86375)
		{
			totaltax += 4664 + (income-40525)*0.22;
			return totaltax;
		}
		else if (income <= 164925)
		{
			totaltax += 14751 + (income-86375)*0.24;
			return totaltax;
		}
		else if (income <= 209425)
		{
			totaltax += 33603 + (income-164925)*0.32;
			return totaltax;
		}
		else if (income <= 523600)
		{
			totaltax += 47843 + (income-209425)*0.35;
			return totaltax;
		}
		else
		{
			totaltax += 157804.25 + (income-523600)*0.37;
		}
		return totaltax;
	}
	public static double marriedFiledSeparately(double income){
		double totaltax = 0;
		if (income <= 9950)
		{
			totaltax += income*0.10;
		}
		else if (income <= 40525)
		{
			totaltax += 995 + (income - 9950)*0.12;
			return totaltax;
		}
		else if (income <= 86375)
		{
			totaltax += 4664 + (income-40525)*0.22;
			return totaltax;
		}
		else if (income <= 164925)
		{
			totaltax += 14751 + (income-86375)*0.24;
			return totaltax;
		}
		else if (income <= 209425)
		{
			totaltax += 33603 + (income-164925)*0.32;
			return totaltax;
		}
		else if (income <= 314150)
		{
			totaltax += 47843 + (income-209425)*0.35;
			return totaltax;
		}
		else
		{
			totaltax += 84496.75 + (income-314150)*0.37;
		}
		return totaltax;
	}
	public static void main(String[] args) throws Exception
	{
		BufferedReader readIncomes = new BufferedReader(new FileReader(args[0]));
		BufferedWriter writeIncomeTaxes = new BufferedWriter(new FileWriter("Income_Taxes.txt"));
		while(readIncomes.ready())
		{
			String inputData = readIncomes.readLine();
			String[] inputSplitUp = inputData.split(",");
			String filingStatus = inputSplitUp[2].split("\\s+")[1];
			double income = Double.parseDouble(inputSplitUp[3].split("\\s+")[1]);
			double incomeTax = 0;
			switch(filingStatus)
			{
				case "MJ":
					incomeTax = marriedFiledJointly(income);
					break;
				case "H":
					incomeTax = headOfHousehold(income);
					break;
				case "S":
					incomeTax = singleFiled(income);
					break;
				case "MS":
					incomeTax = marriedFiledSeparately(income);
			}
			String incomeTaxFormatted = String.format("%.2f", incomeTax);
			System.out.println(incomeTaxFormatted);
			writeIncomeTaxes.write(incomeTaxFormatted,0,incomeTaxFormatted.length());
			writeIncomeTaxes.newLine();
			writeIncomeTaxes.flush();
			//writeIncomeTaxes.newLine();
		}
		writeIncomeTaxes.close();
		/*
		try
		{
		readIncome = new BufferedReader(new FileReader(args[0]));
		writeIncomeTax = new BufferedWriter(new FileWriter("Income_Taxes.txt"));
		}
		catch (ArrayIndexOutOfBoundsException a)
		{
			System.out.println();
			System.out.println("You did not enter a filename when calling the program! Make sure you enter the filename "
						  	  + "and classpath if it is not located in the same directory as the ProgressiveTaxation.java file");
			System.exit(1);
		}
		catch (FileNotFoundException f)
		{
			System.out.println();
			System.out.println("The file you entered was not found! Make sure the file name is correct and the correct file path is "
						  	  + "specified if the file is not located in the same directory as the ProgressiveTaxation.java file");
			System.exit(1);
		}
		catch(IOException io)
		{
			System.out.println("An error has occurred");
		}
		*/
	}
} 