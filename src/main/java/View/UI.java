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
<<<<<<< HEAD
        System.out.println("Choice operation:");
        System.out.println("\t1. Summarize");
        System.out.println("\t2. Subtract");
        System.out.println("\t3. Multiply");
        System.out.println("\t4. Divide");
=======
        System.out.println("Выбрать операцию:");
        System.out.println("\t1. Сложить");
        System.out.println("\t2. Вычесть");
        System.out.println("\t3. Умножить");
        System.out.println("\t4. Разделить");
>>>>>>> 157f92a (05,04)
        return in.nextInt();
    }
}
