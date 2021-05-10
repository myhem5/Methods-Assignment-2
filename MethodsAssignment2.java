/*
* Name : Emily & Chloe
* Teacher: Mr.Ho
* Date: May 5th 2021
* Description: 
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

class MethodsAssignment2 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Would you like to begin loading sales data (Yes or No):");
        String begin = reader.nextLine();
        int num = 0;

        while(num == 0){
            // Begin
            if(begin.equals("Yes")||begin.equals("yes")){
                try{
                    salesFile();

                }
                catch(Exception e){
                    System.out.println(e);
                }
                reader.close();
                num = num+1;

            }
            // User doesn't want to start
            else if(begin.equals("No")||begin.equals("no")){
                System.out.println("The code will not continue then. Please start again when you are ready.");
                num = num+1;
            }

            // Invalid
            else{
                System.out.println("Would you like to begin loading sales data (Yes or No):");
                begin = reader.nextLine();
            }

        }
        
        
    }

    /* 
     * @Author - Emily
     * Load the sales data from input file "sales.csv"
     * 
     * @param : sales.csv
     * @return : Loaded data from sales.csv into the program
     */
    public static void salesFile(){

        try {
            //create file to reference
            File sSheet = new File("sales.csv");
            //read file
            // initialize scanner
            Scanner scanner = new Scanner(sSheet);

            while (scanner.hasNextLine()) {
                // line exist
                String line = scanner.nextLine();
                // System.out.println(line);
            }
            scanner.close();
            System.out.println("File Imported.");
        }

        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

}

