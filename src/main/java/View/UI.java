package View;

import java.util.Scanner;
import java.util.function.Function;

public class UI {

    Scanner in = new Scanner(System.in, "cp866");


    public Function<String, Double> inputDouble = msg -> {
        System.out.println(msg);
        return in.nextDouble();
    };

    /**
     * Метод выбора операции
     * @return - номер операции
     */
    public int getChoice() {

        System.out.println("Выбрать операцию:");
        System.out.println("\t1. Сложить");
        System.out.println("\t2. Вычесть");
        System.out.println("\t3. Умножить");
        System.out.println("\t4. Разделить");

        return in.nextInt();
    }
}
