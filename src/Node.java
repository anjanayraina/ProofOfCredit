import java.util.HashMap;

public class Node {
    private String publicKey;
    private String privateKey;
    boolean isMiner;
    long credit;
    long balance;
    static HashMap<String , Node> allNodes;

    public Blockchain blockchain;
    public String getPublicKey() {
        return publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }


    public boolean isMiner() {
        return isMiner;
    }

    public void setMiner(boolean miner) {
        isMiner = miner;
    }

    public long getCredit() {
        return credit;
    }

    public void setCredit(long credit) {
        this.credit = credit;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    Node(String publicKey , String privateKey){
        allNodes.put()
    }




}
