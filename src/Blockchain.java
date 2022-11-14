import java.util.ArrayList;
import java.util.HashMap;

public class Blockchain {
    ArrayList<Block> allBlocks;
    public boolean isValidBlock(Block block ){
        return true;
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
        return null;

    }
    Blockchain(){
        allBlocks  = new ArrayList<>();
    }


}
