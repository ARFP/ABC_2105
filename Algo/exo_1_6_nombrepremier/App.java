package exo_1_6_nombrepremier;

import java.util.Scanner;

public class App 
{
    public static void main_example(String[] args) {
        
        int numberToTest = 0;
        int divisetoTestNumber = 2;
        Boolean isNumberFirst = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre pour vérifier si il est premier :");
        numberToTest = scanner.nextInt();

        while (divisetoTestNumber < numberToTest && isNumberFirst) {
            if (!(numberToTest % divisetoTestNumber == 0)) {
                isNumberFirst = false;
            }

            divisetoTestNumber++;
        }

        if (isNumberFirst) {
            System.out.println("Le nombre est premier !");
        } else {
            System.out.println("Le nombre n'est pas premier :(");
        }

        scanner.close();

    }

    public static void main(String[] args) {

        int num2test;
        int divise;
        Boolean first;
        Scanner scanner;
        
        num2test = 0;
        divise = 2;
        first = true;
        scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre pour vérifier si il est premier :");
        num2test = scanner.nextInt();

        num2test = Math.abs(num2test);

        while(divise < num2test && first) {
            first = (num2test % divise++ != 0);
        }

        if (first) {
            System.out.println("Le nombre est premier !");
        } else {
            System.out.println("Le nombre n'est pas premier :(");
        }
        
        scanner.close();
    }
}
