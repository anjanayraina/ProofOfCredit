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
        while(true) {
            runner.printTasks();
            int ch = scn.nextInt();
            if (ch == 1) {
                runner.enterPublicKey();
                String publicKey = scn.nextLine();
                runner.enterPrivateKey();
                String privateKey = scn.nextLine();
                Node user = Node.getNode(publicKey, privateKey);
                if (user == null) System.out.println("User Not found!");
                else {
                    System.out.println("User found");
                    while (true) {
                        break;
                    }

                }
            } else if (ch == 2) {
                System.out.println("Do you want to register as a miner : y/n ");
                scn.nextLine();
                String y = scn.nextLine();
                boolean isMiner = y.equals("y");
                ArrayList<Object> res = Node.generateNewPublicAndPrivateKeys(isMiner);
                System.out.println("Your keys are : " + "\n Public Key : " + Node.getPublicKeyString((PublicKey) res.get(0)) + "\n Private Key : " + Node.getPrivateKeyString((PrivateKey) res.get(1)));
                runner.enterPublicKey();
                String publicKey = scn.nextLine();
                runner.enterPrivateKey();
                String privateKey = scn.nextLine
                        ();
                Node user = Node.getNode(publicKey, privateKey);
                if (user == null) System.out.println("User Not found!");
                else
                {
                    System.out.println("user found");
                    while(true){
                        break;
                    }
                    System.out.println("Still in the outer loop");
                }
            } else {
                System.out.println("Program Exiting!!");
                break;
            }
        }




    }
}
