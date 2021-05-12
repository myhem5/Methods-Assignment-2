/*
* Name : Emily & Chloe
* Teacher: Mr.Ho
* Date: May 5th 2021
* Description: Benfords Law Assignmnet
*/

/* Stringdoc Example
* @Author - Emily
* Description:
*
* @param :
* @return :
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;

class MethodsAssignment2 {
    public static void main(String[] args) {
        salesFile();
        exportFile();


    }    


    /* 
     * @Author - Emily
     * Load the sales data from input file "sales.csv"
     * 
     * @param : sales.csv
     * @return : Loaded data from sales.csv into the program
     */
    public static void salesFile(){

        Scanner reader = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter the file name of file you would like to import(ex. sales.csv): ");
        String begin = reader.nextLine();
        System.out.println(" ");
        int num = 0;

        while (num == 0) {
            // Begin
            if (begin.equals("sales.csv")) {
                try {
                    // This is where the file is imported
                    try {
                        //create file to reference
                        File sSheet = new File("sales.csv");
                        //read file
                        // initialize scanner
                        Scanner scanner = new Scanner(sSheet);
            
                        while (scanner.hasNextLine()) {
                            // line exist
                            String importedFile = scanner.nextLine();
                            // System.out.println(line);
            
                        }
                        scanner.close();
                    }
            
                    catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                    
                } 
                catch (Exception e) {
                    System.out.println(e);
                }
                reader.close();
                num = num + 1;
            }

            // File not found
            else if (!(begin.equals("sales.csv"))) {
                System.out.println("File not found.");
                System.out.println("Enter the file name of file you would like to import(ex. sales.csv):");
                begin = reader.nextLine();
                System.out.println(" ");

            }
        }
    }


    /* 
     * @Author - Emily
     * export the file as results.csv
     * 
     * @param : data from code
     * @return : results.cs
     */
    public static void exportFile() {
        Scanner reader2 = new Scanner(System.in);

        //Success input
        System.out.println("Your data file CSV will be generated.");
        System.out.println();
        
        //File name
        File outFile = new File("results.csv");

        if (!(outFile.exists())) {
            PrintWriter out = new PrintWriter(outFile);
            System.out.println("Find your information at result.csv");
        }

        if (outFile.exists()) {
            System.out.println("File existing, overwrite?(y/n)");
            if (reader2.nextLine().startsWith("y") || reader2.nextLine().startsWith("Y")) {
                //print fileName
                int num = 1;
                outFile = new File("results"+ num + ".csv");
                num = num + 1;
                System.out.println("Find your information at " + "results"+ num + ".csv");
                PrintWriter out = new PrintWriter(outFile);


            }

        }
        out.close();
    }


}