/*
* Name : Emily & Chloe
* Teacher: Mr.Ho
* Date: May 5th 2021
* Description: Benfords Law Assignmnet
*/

import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 * 
 * @author - Chloe and Emily
 * 
 * @version 1.0
 * 
 */

class MethodsAssignment2 extends Application{

    // Variables declared under the class
    private int total = 0;
    private int count[] = new int[9];
    private static double percent1;
    private static double percent2;
    private static double percent3;
    private static double percent4;
    private static double percent5;
    private static double percent6;
    private static double percent7;
    private static double percent8;
    private static double percent9;

    // constructor
    public void BenfordLawAssignment() {
        try {
           benfordsLaw();
        } catch (FileNotFoundException exception) {
           System.out.println("File not found");
        }
     }

    public static void main(String[] args) {
        int digitOccurance = 1;
        salesFile();
        exportFile(digitOccurance);

        // Required by JavaFX
      launch(args);
      fraudCheck(percent1, percent2, percent3, percent4, percent5, percent6, percent7, percent8, percent9);

    }

    /* 
     * @Author - Emily
     * Load the sales data from input file "sales.csv"
     * 
     * @param : sales.csv
     * @return : Loaded data from sales.csv into the program
     */
    public static void salesFile() {

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
                            System.out.println(importedFile);

                        }
                        System.out.println(" ");
                        System.out.println("File Imported.");
                        System.out.println(" ");

                        scanner.close();
                    }

                    catch (FileNotFoundException e) {
                        System.out.println(e);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
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
        reader.close();
    }

    /**
    * @Author - Chloe
    * 
    * @throws FileNotFoundException - thrown if the file is not valid or found
    */
   public void benfordsLaw() throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("Sales.csv")); // reads from the file

    // Read the first line which is "Postal Code,Sales"
    if (scanner.hasNextLine()) {
       String firstLine = scanner.nextLine();
    }

    while (scanner.hasNextLine()) {
       // line exist
       String line = scanner.nextLine();
       // System.out.println(line);

       // Split the line with commas
       String[] columns = line.split(Pattern.quote(","));
       String postalCode = columns[0];
       String sales = columns[1];

       char firstCharacter = sales.charAt(0); // looks at first character and increments the count
       if (firstCharacter == '1') {
          count[0]++;
       } else if (firstCharacter == '2') {
          count[1]++;
       } else if (firstCharacter == '3') {
          count[2]++;
       } else if (firstCharacter == '4') {
          count[3]++;
       } else if (firstCharacter == '5') {
          count[4]++;
       } else if (firstCharacter == '6') {
          count[5]++;
       } else if (firstCharacter == '7') {
          count[6]++;
       } else if (firstCharacter == '8') {
          count[7]++;
       } else if (firstCharacter == '9') {
          count[8]++;
       }

       total++;  // keeps running total of the number of rows

    }
 }

    /**
    * @Author - Chloe
    * 
    * @param stage - Sets scene name
    *
    * @return - returns values to be used in the graph and table
    *
    */
 @Override
 public void start(Stage stage) {
     // Sets the title for the graph
    stage.setTitle("Benford's Law Assignment");

    // Sets lables for graph
    CategoryAxis xAxis = new CategoryAxis();
    xAxis.setLabel("Digit");
    NumberAxis yAxis = new NumberAxis("Percent", 0, 50, 5);
    BarChart<String, Number> barChart = new BarChart<String, Number>(xAxis, yAxis);
    barChart.setTitle("Figure 1 - Benford's Law Distribution Leading Digit");

    // calculates percent for each first digit in sales
    double percent1 = (double) count[0] / (double) total * 100;
    double percent2 = (double) count[1] / (double) total * 100;
    double percent3 = (double) count[2] / (double) total * 100;
    double percent4 = (double) count[3] / (double) total * 100;
    double percent5 = (double) count[4] / (double) total * 100;
    double percent6 = (double) count[5] / (double) total * 100;
    double percent7 = (double) count[6] / (double) total * 100;
    double percent8 = (double) count[7] / (double) total * 100;
    double percent9 = (double) count[8] / (double) total * 100;

    // Adds data from percent into the bars on the graphs
    XYChart.Series series = new XYChart.Series();
    series.getData().add(new XYChart.Data("1", percent1));
    series.getData().add(new XYChart.Data("2", percent2));
    series.getData().add(new XYChart.Data("3", percent3));
    series.getData().add(new XYChart.Data("4", percent4));
    series.getData().add(new XYChart.Data("5", percent5));
    series.getData().add(new XYChart.Data("6", percent6));
    series.getData().add(new XYChart.Data("7", percent7));
    series.getData().add(new XYChart.Data("8", percent8));
    series.getData().add(new XYChart.Data("9", percent9));

    // Sets the size of the window (scene) for the bar graph
    Scene scene = new Scene(barChart, 800, 600);
    barChart.getData().addAll(series);
    stage.setScene(scene);
    stage.show();

    return;
 }

    /**
    * 
    * @Author - Chloe
    * 
    * @param percent1 - uses to check if fraud occured
    * @return - returns percent1 
    *
    */
 public static double fraudCheck(double percent1) {
        // Checks the percentage of the value 1 to see if it could be fraud

        // If the percentage is in between the values 29-32, fraud likely did not occur
    if (percent1 <= 32 && percent1 >= 29) {
         System.out.println("Fraud Liekly Did Not Occur");
    } else {
        System.out.println("Fraud Likely Did Occur");
    }
    return percent1;
 }


    /* 
     * @Author - Emily and Chloe
     * export the file as results.csv
     * 
     * @param : data from code
     * 
     * @return : results.cs
     */
    public static void exportFile(int digitOccurance) {
        double digitPerc = 0;
        try{
            File export = newFile("results.csv");
            PrintWriter out = new PrintWriter(export);

            //Generating CSV
            if(export.exists()){
                // Imports percent into a table
                out.println("1 = " + percent1 + "%");
                out.println("2 = " + percent2 + "%");
                out.println("3 = " + percent3 + "%");
                out.println("4 = " + percent4 + "%");
                out.println("5 = " + percent5 + "%");
                out.println("6 = " + percent6 + "%");
                out.println("7 = " + percent7 + "%");
                out.println("8 = " + percent8 + "%");
                out.println("9 = " + percent9 + "%");
            }
        }

        catch (Exception e) {
                    System.out.println(e);
        }
                
    }

}