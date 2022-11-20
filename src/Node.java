import javax.crypto.Cipher;
import javax.xml.bind.DatatypeConverter;
import java.security.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Node {

    private static final String RSA
            = "RSA";
    private PublicKey publicKey;
    private PrivateKey privateKey;
    boolean isMiner;
    int credit;
    double balance;
    static HashMap<String , Node> allNodes = new HashMap<>();
    static ArrayList<Block> proposeBlocks= new ArrayList<>();

    public Blockchain blockchain;
    public boolean canChangeBlock(String publicKey){
        return allNodes.get(publicKey).isMiner() && allNodes.get(publicKey).publicKey.equals(allNodes.get(this.getPublicKey()).publicKey);
    }

    public static ArrayList<Object> generateNewPublicAndPrivateKeys(boolean isMiner) throws NoSuchAlgorithmException {

        SecureRandom secureRandom
                = new SecureRandom();

        KeyPairGenerator keyPairGenerator
                = KeyPairGenerator.getInstance("RSA");

        keyPairGenerator.initialize(
                512, secureRandom);
        ArrayList<Object> res = new ArrayList<>();
        KeyPair keypair= keyPairGenerator
                .generateKeyPair();
        if(allNodes.containsKey(Node.getPublicKeyString(keypair.getPublic())))return generateNewPublicAndPrivateKeys(isMiner);
        res.add(keypair.getPublic());
        res.add(keypair.getPrivate());
        allNodes.put(Node.getPublicKeyString(keypair.getPublic()) , new Node(keypair.getPublic() , keypair.getPrivate() , isMiner));
        return res;
    }
    public boolean loginIntoAccount(String publicKey , String privateKey){
        return false;
    }
    public static byte[] do_RSAEncryption(
            String plainText,
            PrivateKey privateKey)
            throws Exception
    {
        Cipher cipher
                = Cipher.getInstance(RSA);

        cipher.init(
                Cipher.ENCRYPT_MODE, privateKey);

        return cipher.doFinal(
                plainText.getBytes());
    }


    public static String do_RSADecryption(
            byte[] cipherText,
            PublicKey publicKey)
            throws Exception
    {
        Cipher cipher
                = Cipher.getInstance(RSA);

        cipher.init(Cipher.DECRYPT_MODE,
                publicKey);
        byte[] result
                = cipher.doFinal(cipherText);

        return new String(result);
    }
    public static String getPublicKeyString(PublicKey publicKey){
        return DatatypeConverter.printHexBinary(
                (publicKey).getEncoded());
    }
    public static String getPrivateKeyString(PrivateKey publicKey){
        return DatatypeConverter.printHexBinary(
                (publicKey).getEncoded());
    }

    public static  Node getNode(String publicKey ,String privateKey){
        if(!allNodes.containsKey(publicKey)){
            System.out.println("Private Key not found!!");
            return null;
        }

        Node temp = allNodes.get(publicKey);
        if(!Node.getPrivateKeyString(temp.getPrivateKey()).equals(privateKey)){
            System.out.println("Your Private Key doest macth the public key");
            return null;
        }
        return temp;
    }
    public PublicKey getPublicKey() {
        return publicKey;
    }
    public PrivateKey getPrivateKey() {
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
    Node(PublicKey publicKey , PrivateKey privateKey , boolean isMiner){
       this.publicKey = publicKey;
       this.privateKey = privateKey;
       this.credit = 0;
       this.balance = 0;
       this.isMiner = isMiner;
       this.blockchain = new Blockchain();
    }
    @Override
    public String toString(){
        return Node.getPublicKeyString(publicKey) + Node.getPrivateKeyString(privateKey);
    }

    public void lookIntoOtherBlockchains(){

    }



}
