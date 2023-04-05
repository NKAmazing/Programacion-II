public class Calculator {
    
    public void makeCalculate(String choice, float[] numbers) {
        // Creo objeto de la clase Calculator        
        Calculator calculator = new Calculator();
        // Llamo a la funcion calculateResult
        float result = calculateResult(choice, numbers);
        // Llamo a la funcion showResult
        calculator.showResult(result);
    }

    private float calculateResult(String choice, float[] numbers) {
        // Creo objeto de la clase Calculate
        Calculate  calculate = new Calculate();
        // Creo variable para guardar el resultado
        float result = 0;
        // Muestro la opcion seleccionada
        System.out.println("You selected: " + choice);
        // Realizo la operacion segun la opcion seleccionada
        switch (choice) {
            case "1":
                result = calculate.add(numbers);
                break;
            case "2":
                result = calculate.subtract(numbers);
                break;
            case "3":
                result = calculate.multiply(numbers);
                break;
            case "4":
                result = calculate.divide(numbers);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        // Retorno el resultado
        return result;
    }

    public void showResult(float result) {
        // Muestro el resultado
        System.out.println("Result: "+ result);
    }
}

