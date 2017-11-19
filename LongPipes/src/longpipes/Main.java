package longpipes;

import pipes.Pipe;
import pipes.Pipe5;
import pipes.Pipe4;
import pipes.Pipe3;
import pipes.Pipe2;
import pipes.Pipe1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author up826133
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean error = false;
        double length;
        double diameter;
        int grade;
        int colour;
        String insul;
        String outerInforce;
        String chemRes;
        int quantity;
        do {
            print("Enter the length of the pipes in metres: ");
            length = myScanner.nextDouble();
            System.out.println(length+"");
            print("Enter the diameter in inches: ");
            diameter = myScanner.nextDouble();
            System.out.println(diameter+"");
            print("Enter the grade: ");
            grade = myScanner.nextInt();
            System.out.println(grade+"");
            print("Colour [0], [1], [2]");
            colour = myScanner.nextInt();
            System.out.println(colour+"");
            print("Insulation: Y/N ");
            do {
                insul = myScanner.nextLine();
            } while (insul.equals(""));
            System.out.println(insul);
            print("Outer Reinforcement: Y/N");
            outerInforce = myScanner.nextLine();
            System.out.println(outerInforce);
            print("Chemical Resistance: Y/N");
            chemRes = myScanner.nextLine();
            System.out.println(chemRes);
            print("Quanity of Pipe: ");
            quantity = myScanner.nextInt();
            System.out.println(quantity);
        } while (error);
        ArrayList<Pipe> pipes = new ArrayList<Pipe>();

        //Deciding pipe type
        if (insul.equalsIgnoreCase("N") && outerInforce.equalsIgnoreCase("N")) {
            //Pipe1
            if (colour == 0) {
                if (grade >= 1 && grade <= 3) {
                    pipes.add(new Pipe1(length, diameter, grade, chemRes, quantity));
                    print("Pipe1 created");
                }
            }
            //Pipe2
            if (colour == 1) {
                if (grade >= 2 && grade <= 4) {
                    pipes.add(new Pipe2(length, diameter, grade, chemRes, quantity));
                }
            }
            //Pipe3
            if (colour == 2) {
                if (grade >= 2 && grade <= 5) {
                    pipes.add(new Pipe3(length, diameter, grade, chemRes, quantity));
                }
            }
        }
        //Pipe4
        if (colour == 2 && grade >= 2 && grade <= 5 && insul.equalsIgnoreCase("Y") && outerInforce.equalsIgnoreCase("N")) {
            pipes.add(new Pipe4(length, diameter, grade, chemRes, quantity));
        }

        //Pipe5
        if (colour == 2 && grade >= 3 && grade <= 5 && insul.equalsIgnoreCase("Y") && outerInforce.equalsIgnoreCase("Y")) {
            pipes.add(new Pipe5(length, diameter, grade, chemRes, quantity));
        } 
        else {
            System.out.println("Invalid Pipe Type");
        }
        print(pipes.get(0).getPrice()+"");

    }

    public static void print(String text) {
        System.out.println(text);
    }

}
