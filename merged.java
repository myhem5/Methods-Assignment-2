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
        benfordsLaw();
        countDigits()
        exportFile();



    

    
    /* 
     * @Author - Emily
     * 
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

                        
                        while (scanner.hasNextLine()) {
                            // line exist
                            String importedFile = scanne

                        
                        }
                     

                    
                    catch (FileNotFoundException e) {
                     

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
             

    
            }
     

    /*
     * @Author - Chloe
     * Benfords Law
     *
     * @param : 
        rn : 

        tatic void benfordsLaw(double[]
            unt = new int

            

            // line exist
            

            

            String sales = "sales.csv";
            
                ner.useDeli
            
                 firstChara
            if (firstCharacter == '1') {
                count[0]++;
            }  else if (firstCharacter == '2') 
                count[1]++;
            }  else if (firstCharacter == '3') 

                e if (first
                 count[3]++; 
                e if (first
             

             
            }else if (firstCharacter == '8') {
     

    
                }
            }
    }
    /*
     * @Author - Chloe
     * Counting the Digits
     *
     * @param : 
     * @return : 
     */ 
    public static double[

    countDigits() {
        d

        for (double i = 1; i < 10; i++){
     

    }

    /* 
     * @Author - Emily
     * export the file as results.csv
     * 
     * @param : data from code
     * @return : results.cs
     */
    public static void exportFile() {
        Scanner reader2 = new

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
            System.out.println("File existin g, overwrite?(y/n)");
            if (reader2.nextLine().startsWith("y") || reader2.nextLine().startsWith("Y")) {
                //print fileName 
                int num = 1;

                System.out.println("Find your information at " + "results"+ num + ".csv");
                PrintWriter out = new PrintWriter(outFile);


     

        out.close();
    }


}