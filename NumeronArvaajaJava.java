import java.util.Random;
import java.util.Scanner;
import java.lang.System;

public class NumeronArvaajaJava {

    public static void main(String[] args) {

        System.out.println("Tervetuloa pelaamaan numeron arvauspeliä.");
        System.out.println("Valitse numero: ");

        Scanner inputnum = new Scanner(System.in); // This number will be the max number the player has to guess too.
        int maxnum;
        maxnum = inputnum.nextInt();

        Random rand = new Random();
        int number = rand.nextInt(maxnum);
        int tries = 0; // Will increase depending on how many tires it takes
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false) { // This while loop false the code with in it repeat until win === true

            System.out.println("Arvaa numero väliltä 1 ja " + maxnum + ": ");
            guess = input.nextInt();
            tries++; // Increasing the number set in the variable tries by 1

            if (guess == number) {
                win = true; // Since the number is correct win == true then ending the loop
                // First thing the guess is compared too
            }

            else if (guess < number) {
                System.out.println("Numero on liian pieni, arvaa uudestaan?");
                // 2nd thing guess is compared too.
            }

            else if (guess > number) {
                System.out.println("Numero on liian iso, arvaa uudestaan?");
                // 3rd thing guess is compared too.
            }

        }

        System.out.println("Voitit!");
        System.out.println("Sinulta meni " + tries + " arvausta.");

    }
}