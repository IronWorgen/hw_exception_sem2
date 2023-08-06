import java.util.Scanner;

public class Task4 {

    public String task4(){
        Scanner scanner = new Scanner(System.in);
        String userInput =  scanner.nextLine().trim();
        if (userInput.length()==0){

            throw new RuntimeException();
        }
        return userInput;
    }

}
