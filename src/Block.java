import java.sql.Timestamp;
import java.util.ArrayList;

public class Block {
    public static Block oldBlock = null;
    Node miner;
    ArrayList<Transaction> transactions;
    long index;
    Timestamp timestamp;
    String prevHash;
    String currentHash;
    String data;
    Block(String currentHash ,  String data , long index , ArrayList<Transaction> transactions, Node miner){
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.prevHash = oldBlock.prevHash;
        this.currentHash =currentHash;
        this.data = data;
        this.index = index;
        this.transactions = transactions;
        this.miner = miner;

    }
}
