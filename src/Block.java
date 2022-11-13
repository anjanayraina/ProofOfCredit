import java.sql.Timestamp;

public class Block {
    long index;
    Timestamp timestamp;
    String prevHash;
    String currentHash;
    String data;
    Block(String currentHash , String prevHash , String data , long index){
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.prevHash = prevHash;
        this.currentHash =currentHash;
        this.data = data;
        this.index = index;
    }
}
