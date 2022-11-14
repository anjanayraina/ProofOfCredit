import java.util.ArrayList;
import java.util.HashMap;

public class Blockchain {

    public static  boolean isValidBlock(Block block ){
        return true;
    }
    public static void rewardCreditForValidation(Node miner){
        miner.setCredit(miner.getCredit() +1 );
    }
    public static void deductForFalseTransaction(Node miner){
        miner.setCredit(miner.getCredit()/2);
    }

    public static ArrayList<Node> getAllMiners(HashMap<String , Node> allNodes ){
        ArrayList<Node> res= new ArrayList<>();
        for(String i  : allNodes.keySet()){
            if(allNodes.get(i).isMiner())res.add(allNodes.get(i));
        }
        return res;
    }

    public static  Node chooseMiner(ArrayList<Node > allMiners){
        return null;
    }

//    public static  boolean addToBlockchain()

}
