//import java.sql.Timestamp;
//import java.util.ArrayList;
//
//public class Transaction {
//    public static ArrayList<Transaction> transactionPool = new ArrayList<>();
//    Timestamp timestamp;
//    double amount;
//    Node payer;
//    Node payee;
//    Transaction(double amount , Node payer , Node payee){
//        this.amount = amount ;
//        this.payer = payer;
//        this.payee = payee;
//        timestamp    =new Timestamp(System.currentTimeMillis());
//    }
//    @Override
//    public String toString(){
//        return this.amount + this.payer.toString() + this.payee.toString() + this.timestamp.toString();
//    }
//
//}
