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

        print("Enter the length of the pipes in metres: ");
        double length = myScanner.nextDouble();
        print("Enter the diameter in inches: ");
        double diameter = myScanner.nextDouble();
        print("Enter the grade: ");
        int grade = myScanner.nextInt();
        print("Colour [0], [1], [2]");
        int colour = myScanner.nextInt();
        print("Insulation: Y/N ");
        String insul = myScanner.nextLine();
        print("Outer Reinforcement: Y/N");
        String outerInforce = myScanner.nextLine();
        print("Chemical Resistance: Y/N");
        String chemRes = myScanner.nextLine();
        print("Quanity of Pipe: ");
        int quantity = myScanner.nextInt();

        ArrayList<Pipe> pipes = new ArrayList<Pipe>();

        //Deciding pipe type
        if (insul.equals("N") && outerInforce.equals("N")) {
            //Pipe1
            if (colour == 0) {
                if (grade >= 1 && grade <= 3) {
                    pipes.add(new Pipe1(length, diameter, grade, chemRes, quantity));
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
        if (colour == 2 && grade >= 2 && grade <= 5 && insul.equals("Y") && outerInforce.equals("N")) {
            pipes.add(new Pipe4(length, diameter, grade, chemRes, quantity));
        }
        
        //Pipe5
        if (colour == 2 && grade >= 3 && grade <= 5 && insul.equals("Y") && outerInforce.equals("Y")) {
            pipes.add(new Pipe5(length, diameter, grade, chemRes, quantity));
        } else {
            System.out.println("Invalid Pipe Type");
        }

    }

    public static void print(String text) {
        System.out.println(text);
    }

}
