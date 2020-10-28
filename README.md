# Progressive-Income-Tax-Calculator

## Overview
The Progressive Taxation program reads in sample data from a provided text file, extracts the relevant income information, calculates the income tax based on the income and filing status, and adds the income taxes to the "Income_Taxes.txt" text file.
### Legend
The "Sample_Incomes.txt" file contains test data which contains an uppercased letter(s) as the third item in each row. The letter(s) stand for the following: 
- S = Single  
- MS = Married Filing Separately  
- MJ = Married Filing Jointly   
- H = Head of Household
### Installation and Execution
In order to run this program,
1. Clone this repository to the desired location.
2. Delete the "Income_Taxes.txt" file. The program will create and populate this file when it is executed.
3. Compile the ProgressiveTaxation.java file in the Shell by typing "javac ProgressiveTaxation.java".
4. Run the program by typing "java ProgressiveTaxation Sample_Incomes.txt" in the Shell. After execution is completed, a "Income_Taxes.txt" file should exist in the repository directory containing the income taxes for the incomes provided.
