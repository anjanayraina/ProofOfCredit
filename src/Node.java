import java.util.HashMap;

public class Node {
    private String publicKey;
    private String privateKey;
    boolean isMiner;
    int credit;
    double balance;
    static HashMap<String , Node> allNodes;
    public Blockchain blockchain;
    public boolean canChangeNode(String publicKey){
        return allNodes.get(publicKey).isMiner() && allNodes.get(publicKey).publicKey.equals(allNodes.get(this.getPublicKey()).publicKey);
    }
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
    public int getCredit() {
        return credit;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    Node(String publicKey , String privateKey , boolean isMiner){
       this.publicKey = publicKey;
       this.privateKey = privateKey;
       this.credit = 1;
       this.balance = 0;
       this.isMiner = isMiner;
       this.blockchain = new Blockchain();
    }
    @Override
    public String toString(){
        return this.publicKey;
    }


}
