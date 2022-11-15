import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;

public class RunBlockchain {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to your wallet!!" +
                "\n Please Enter the task that you would like to perform : ");
        ProgramRunner runner = new ProgramRunner();
        runner.printTasks();
        int ch = scn.nextInt();
        if(ch == 1){
        }
        else if(ch == 2){
            ArrayList<String> res = Node.generateNewPublicAndPrivateKeys();
            System.out.println("Your keys are : " + "\n Private Key : " + res.get(0)+ "\n Public Key : "  +res.get(1));
        }
        else{
            System.out.println("please enter a valid entry!");
        }




    }
}
