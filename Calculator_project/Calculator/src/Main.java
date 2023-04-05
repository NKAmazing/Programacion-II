import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Llamo a la funcion showMenu
        showMenu();
    }

    public static void showMenu() {
        // Muestro el menu
        while (true) {
            System.out.println(Constants.BLANK_LINE);
            System.out.println(Constants.CALCULATOR_TITLE);
            System.out.println(Constants.ADD);
            System.out.println(Constants.SUBTRACT);
            System.out.println(Constants.MULTIPLY);
            System.out.println(Constants.DIVIDE);
            System.out.println(Constants.EXIT);
            // Llamo a la funcion selectOption
            selectOption();
        }
        
    }

    public static void selectOption() {
        // Pido al usuario que ingrese una opcion
        Scanner scanner = new Scanner(System.in);
        System.out.println(Constants.ENTER_YOUR_CHOICE);
        String choice = scanner.nextLine();
        if (choice.equals("5")) {
            exit();
        }
        // Llamo a la funcion insertNumbers
        float[] numbers = insertNumbers();
        // Muestro los numeros ingresados
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        // Creo objeto de la clase Calculator
        Calculator calculator = new Calculator();
        // Llamo a la funcion makeCalculate
        calculator.makeCalculate(choice, numbers);
    }

    public static float[] insertNumbers() {
        // Pido al usuario que ingrese los numeros
        Scanner scanner = new Scanner(System.in);
        System.out.println(Constants.EXAMPLE);
        System.out.println(Constants.ENTER_THE_NUMBERS);
        String numbers = scanner.nextLine();
        System.out.println(numbers);
        // Convierto String a String array
        String[] numbersArray = numbers.split(",");
        // Convierto String array a float array
        float[] floatArray = new float[numbersArray.length];
        // Recorro el array de numeros
        for (int i = 0; i < numbersArray.length; i++) {
        floatArray[i] = Float.parseFloat(numbersArray[i]);
        }
        // Retorno el array de numeros
        return floatArray;
    }

    public static void exit() {
        // Salgo del programa
        System.out.println(Constants.BYE);
        System.exit(0);
    }
}