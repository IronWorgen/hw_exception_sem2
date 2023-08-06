import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public float input(){
        Scanner scanner;
        float userInput=0;
        boolean flag = true;
        while ( flag) {
            flag = false;
            try {
                System.out.print("Введите число: ");
                scanner  = new Scanner(System.in);
                userInput = scanner.nextFloat();

            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Вы ввели не число!\n");
                flag=true;
            }
        }
        return userInput;
    }
}
