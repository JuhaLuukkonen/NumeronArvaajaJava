
//huuliposkella harjoitellen
import java.util.Random;
import java.util.Scanner;

public class NumeronArvaus {

    public static Scanner scanner = new Scanner(System.in);

    public static int askNumber() {
        int number = 0;

        while (number <= 0) {
            try {
                System.out.print("Annas sviudis? >");
                number = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Tunget vääriä numeroita!!!! PERKELE!");
            }
        }

        return number;
    }

    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;
        int amountOfQuess = 3;

        System.out.println("Arvaa numero 1-10 väliltä, saat kolome rätinkiä.");

        while (amountOfQuess > 0) {
            int number = NumeronArvaus.askNumber();

            if (number == randomNumber) {
                System.out.println("UAivan OIJEKKIN.. No onneksi niin helevetisti olokoon, voititti perkule!");
                break;
            } else if (number > randomNumber) {
                System.out.println("Numero on heiveröisempi");
            } else {
                System.out.println("Numero on isompi");
            }

            amountOfQuess--;
        }

        if (amountOfQuess <= 0) {
            System.out.println("Meni jo.");
        }

        scanner.close();
    }
}