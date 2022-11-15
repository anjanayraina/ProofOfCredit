import java.util.Scanner;

public class RunBlockchain {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to your wallet!!" +
                "\n Please Enter the task that you would like to perform : ");
        ProgramRunner runner = new ProgramRunner();
        runner.printTasks();
        int ch = scn.nextInt();




    }
}
