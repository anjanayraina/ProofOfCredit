import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Blockchain {
    ArrayList<Block> allBlocks;
    public boolean isValidBlock(Block block ){
        return true;
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
    public Block chooseBlock(ArrayList<Block> blockList){


        Random rand = new Random();
        int max = Integer.MIN_VALUE;
        Block chosenBlock = null;
        for(Block block  : blockList){

            int tempVal = rand.nextInt((int)(block.miner.getCredit() + block.miner.getBalance()/100));
            if(tempVal > max){
                max= tempVal;
                chosenBlock = block;
            }
            else if(tempVal == max){
                if(chosenBlock == null){
                    max= tempVal;
                    chosenBlock = block;
                }
                else {
                    if(chosenBlock.miner.getBalance()  < chosenBlock.miner.getBalance() ){

                        chosenBlock = block;
                    }
                    else if(chosenBlock.miner.getCredit() < chosenBlock.miner.getCredit()){

                        chosenBlock = block;
                    }
                }
            }
        }
        return chosenBlock;

    }
    public void addBlockInBlockchain(Block newBlock){
        if(isValidBlock(newBlock)){
            System.out.println("New Block has been added to the Blockchain!!");
            allBlocks.add(newBlock);
        }

        else{
            System.out.println("The Block is invalid!!");
        }

    }

//    public void validateOtherMinersBlock()
    Blockchain(){
        allBlocks  = new ArrayList<>();
    }


}
