public class Calculate {
    public float add(float[] numbers) {
        float add = 0;
        for (float number : numbers) {
            add += number;
        }
        return add;
    }

    public float subtract(float[] numbers) {
        float subtract = numbers[0];
        numbers[0] = 0;
        for (float number : numbers) {
            subtract -= number;
        }
        return subtract;
    }

    public float multiply(float[] numbers) {
        float multiply = 1;
        for (float number : numbers) {
            multiply *= number;
        }
        return multiply;
    }

    public float divide(float[] numbers) {
        float divide = numbers[0];
        numbers[0] = 1;
        for (float number : numbers) {
            divide /= number;
        }
        return divide;
    }
}
