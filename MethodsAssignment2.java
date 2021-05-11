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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class MethodsAssignment2 {
    public static void main(String[] args) {
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
                    salesFile(begin);

                } catch (Exception e) {
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
     * Load the sales data from input file "sales.csv"
     * 
     * @param : sales.csv
     * @return : Loaded data from sales.csv into the program
     */
    public static void salesFile(String fileName) {

        String file = fileName;

        try {
            //create file to reference
            File sSheet = new File(file);
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
