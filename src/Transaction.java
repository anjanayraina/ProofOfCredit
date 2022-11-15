public class Transaction {
    
    double amount;
    Node payer;
    Node payee;
    Transaction(double amount , Node payer , Node payee){
        this.amount = amount ;
        this.payer = payer;
        this.payee = payee;
    }
    @Override
    public String toString(){
        return this.amount + this.payer.toString() + this.payee.toString();
    }
    public boolean isTransactoinValid(){
        return true;
    }
}
