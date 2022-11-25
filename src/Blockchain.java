import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Blockchain {
    ArrayList<Block> blockchain;
    public Boolean isChainValid() {
        Block currentBlock;
        Block previousBlock;

        for(int i=1; i < blockchain.size(); i++) {
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i-1);

            if(!currentBlock.hash.equals(currentBlock.calculateHash()) || !previousBlock.hash.equals(currentBlock.previousHash) ){
                System.out.println("The Hashes dont add up!!");
                return false;
            }

        }
        return true;
    }


}
