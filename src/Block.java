import java.sql.Timestamp;
import java.util.ArrayList;

public class Block {
    Node validator;
    ArrayList<Transaction> transactions;
    long index;
    Timestamp timestamp;
    String prevHash;
    String currentHash;
    String data;
    Block(String currentHash , String prevHash , String data , long index , ArrayList<Transaction> transactions, Node validator){
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.prevHash = prevHash;
        this.currentHash =currentHash;
        this.data = data;
        this.index = index;
        this.transactions = transactions;
        this.validator = validator;

    }
}
