import java.sql.Timestamp;

public class Block {
    Timestamp timestamp;
    String prevHash;
    String currentHash;
    String data;
    Block(String currentHash , String prevHash , String data){
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.prevHash = prevHash;
        this.currentHash =currentHash;
        this.data = data;
    }
}
