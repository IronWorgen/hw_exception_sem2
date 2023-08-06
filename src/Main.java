public class Main {
    public static void main(String[] args) {


        System.out.println("задание 1");
        Task1 task1 = new Task1();
        task1.input();

        System.out.println("\nзадание 2");
        Task2 task2 = new Task2();
        task2.task2();

        System.out.println("\nзадание 3");
        Task3 task3 = new Task3();
        task3.task3();

        System.out.println("\nзадание 4");
        Task4 task4 = new Task4();
        try {
            String input = task4.task4();
        }catch (RuntimeException e ){
            System.out.println("пустые строки вводить нельзя");
        }





    }
}