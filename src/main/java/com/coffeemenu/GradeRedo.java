package com.coffeemenu;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * Student Grade Calculator
 * Lets the user enter his prelim,
 * midterm, final grades
 * and the program will compute the
 * final rating and save the grades into file

 */
public class GradeRedo{
    public static final double MIN_GRADE = 50;
    public static final String FILE_DIR = "target/records";
    public static final int TOTAL_SUBJECTS = 64;
    public static void main(String[] args){
        String name;
        String subject;

        String[] terms = {"Prelim", "Midterm", "Finals"};
        String[] subjects = new String[TOTAL_SUBJECTS];
        double[][] grades = new double[TOTAL_SUBJECTS][terms.length];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();

        for(int i = 0; i < TOTAL_SUBJECTS; i++){
            // subject input
            System.out.print("Enter subject " + (i+1) + ": ");
            subjects[i] = scanner.nextLine();
            // grade input
            for(int j = 0; j < terms.length; j++){
                System.out.print("\t" + terms[j] + ": ");
                try {
                    grades[i][j] = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("\tInvalid grade, try again");
                    j--; //go back and fill in the missed grade because of invalid input
                }

                if(grades[i][j] < MIN_GRADE){
                    System.out.println("\tInvalid grade, try again");
                    j--;
                }
            }
            // lets user choose to continue or stop
            System.out.print("Add subject (y/n): ");
            char c = scanner.nextLine().charAt(0);
            if(Character.toLowerCase(c) != 'y') break;


        }
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        //program prints header
        sb.append(String.format("%-13s%-8s%9s%9s%16s\n", "Subject", terms[0], terms[1], terms[2], "Final Rating"));
        // first column is subject[i]
        for(int i = 0; i < TOTAL_SUBJECTS; i++) {
            if(subjects[i] == null) break;
            sb.append(String.format("%-13s", subjects[i]));
            if(subjects[i] == null) break;
            // second to fourth column
            for(int j = 0; j < terms.length; j++) {
                sb.append(String.format("%-10.2f", grades[i][j]));
            }
            sb.append(String.format("%4.2f", getFinalRating(grades[i]))); // fifth column
            sb.append("\n");
        }

        System.out.println(sb.toString());
        writeToFile(name, sb.toString());

        System.out.println("File saved.");

        System.out.println("\n\nReading Files -----------------");
        readAllFiles();

    }

    /**
     * This function computes for the final rating
     * Formula: 30% of Prelim + 30 % of Midterm + 40% of Finals
     *
     * @param termGrades double[] - of 3 elements containing grade for prelims, midterm and finals
     * @return - double - the final rating
     */
    public static double getFinalRating(double[] termGrades){
        double finalRating = termGrades[0] * .3 + termGrades[1] * .3 + termGrades[2] * .4;
        return finalRating;
    }


    public static void writeToFile(String fileName,  String data){
        File folder = new File(FILE_DIR);
        if(folder.exists() == false){
            folder.mkdirs();
        }
        File file = new File(folder, fileName);
        try ( FileWriter fw = new FileWriter(file)) {
            fw.write(data);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
    public static void readAllFiles(){
        File folder = new File(FILE_DIR);
        File[] studentGradeFiles = folder.listFiles();
        for(int i = 0; i < studentGradeFiles.length; i++){
            if(studentGradeFiles[i].isFile()){
                readFile(studentGradeFiles[i]);
            }
        }
    }

    public static void readFile(File file){
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            System.out.println("--------------------------");
            String line;
            while((line = br.readLine()) !=null ){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}