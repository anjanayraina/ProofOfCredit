import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Blockchain {
    ArrayList<Block> allBlocks;
    public boolean isValidBlock(Block block ){
        return true;
    }
    public boolean validateTransactoin(Transaction transaction){
        return false;
    }
    public void rewardTokenForValidatoin(Node miner){
        miner.setBalance(miner.getBalance() + 2);
    }
    public void deductTokenForFalseTransactoin(Node miner){
        miner.setBalance(miner.getBalance() / 5);
    }
    public void rewardCreditForValidation(Node miner){
        miner.setCredit(miner.getCredit() +1 );
    }
    public void deductForFalseTransaction(Node miner){
        miner.setCredit(miner.getCredit()/2);
    }
    public ArrayList<Node> getAllMiners(HashMap<String , Node> allNodes ){
        ArrayList<Node> res= new ArrayList<>();
        for(String i  : allNodes.keySet()){
            if(allNodes.get(i).isMiner())res.add(allNodes.get(i));
        }
        return res;
    }
    public Node chooseMiner(){
        ArrayList<Node> allMiners = getAllMiners(Node.allNodes);
        Random rand = new Random();
        int max = Integer.MIN_VALUE;
        Node chosenMiner = null;
        for(Node miner  : allMiners){
            int tempVal = rand.nextInt((int)(miner.getCredit() + miner.getBalance()/100));
            if(tempVal > max){
                max= tempVal;
                chosenMiner = miner;
            }
        }
        return chosenMiner;

    }
    Blockchain(){
        allBlocks  = new ArrayList<>();
    }


}
