import javax.xml.bind.DatatypeConverter;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class RunBlockchain {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to your wallet!!" +
                "\n Please Enter the task that you would like to perform : ");
        ProgramRunner runner = new ProgramRunner();
        runner.printTasks();
        int ch = scn.nextInt();
        if(ch == 1){
            runner.loginYourAccount();
        }
        else if(ch == 2){
            System.out.println("Do you want to register as a miner : y/n ");
            scn.nextLine();
            String y = scn.nextLine();
            boolean isMiner = y.equals("y");
            ArrayList<Object> res = Node.generateNewPublicAndPrivateKeys(isMiner);
            System.out.println("Your keys are : " + "\n Public Key : " + Node.getPublicKeyString((PublicKey) res.get(0))+ "\n Private Key : "  +Node.getPrivateKeyString((PrivateKey) res.get(1)));
//            System.out.println(Node.do_RSADecryption(Node.do_RSAEncryption("Name" , (PrivateKey) res.get(1)), (PublicKey) res.get(0)));
        }
        else{
            System.out.println("please enter a valid entry!");
        }




    }
}
