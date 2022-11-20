public class ProgramRunner {
    public void printTasks(){
        System.out.println("1) Login " +
                "\n2) Create Account" + "\n Press anything else for exit!!");
    }
    public void enterPrivateKey(){
        System.out.println("Please enter your Private Key: ");
    }
    public void enterPublicKey(){
        System.out.println("Please enter your Public Key: ");
    }
    public void normalFunctions(){
        System.out.println("1) Send Transaction");
        System.out.println("2) Check your Balance");
        System.out.println("3) Log Off");
    }
    public void minerFunctions(){
        System.out.println("1) Send Transaction");
        System.out.println("2) Validate Other Blocks ");
        System.out.println("3) Add block in the Blockchain");
        System.out.println("4) Check your Balance");
        System.out.println("4) Check your Credit");
        System.out.println("5) Log Off");
    }
    public void sendTransaction(){
        System.out.println("Please enter the address of the Payee and the amount");
    }


}
