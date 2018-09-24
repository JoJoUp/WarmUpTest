import java.util.Scanner;

/**
 * Прогмамма предназначена для выполнения умножения без операции умнажения
 */
public class WarmUpTestt {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Вас приветствует программа для ваполнения умножения, для того чтобы начать процесс вычисления введите в консоль 2 числа");
        int operand1 = scanner.nextInt();
        int operand2 = scanner.nextInt();
        System.out.printf("В результате работы программа пришла к выводу, что результат выражения %d * %d равно %d", operand1, operand2, multiplication(operand1, operand2));
    }

    /**
     *
     * @param operand1
     * @param operand2
     * @return результат
     */
    public static int multiplication(int operand1, int operand2) {
        int min;
        int result = 0;
        int max;
        if (operand1 == 0 || operand2 == 0) return 0;
        if (operand1 > operand2) {
            min = operand2;
            max = operand1;
        } else {
            min = operand1;
            max = operand2;
        }
        do {
            min--;
            result += max;
        } while (min >= 1);
        return result;
    }


}

