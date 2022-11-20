import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
    public static byte[] getSHA(String input) throws NoSuchAlgorithmException
    {

        MessageDigest md = MessageDigest.getInstance("SHA-256");


        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }

    public static String toHexString(byte[] hash)
    {

        BigInteger number = new BigInteger(1, hash);


        StringBuilder hexString = new StringBuilder(number.toString(16));


        while (hexString.length() < 64)
        {
            hexString.insert(0, '0');
        }

        return hexString.toString();
    }

    public static String getHash(Block block) throws NoSuchAlgorithmException {
        String allTransactionsString = block.transactions.toString();
        return toHexString(getSHA(allTransactionsString));
    }

    public boolean isTransactoinValid(Transaction transaction){
        return true;
    }
}
