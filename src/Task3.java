import java.io.FileNotFoundException;

public class Task3 {

    /**
     * убрал исключения, которые никогда не возникнут в коде из задания
     * можно избавиться от последнего исключения ( abc[3] = 9; -> заменить 3 на 0 или 1)
     * (из задания непонятно на что менять)
     */
    public  void task3(){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }

    }
    public static void printSum(Integer a, Integer b)  {
        System.out.println(a + b);
    }

}
