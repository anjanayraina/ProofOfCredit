public class Transaction {
    
    double amount;
    String payer;
    String payee;
    Transaction(double amount , String payer , String payee){
        this.amount = amount ;
        this.payer = payer;
        this.payee = payee;
    }
    @Override
    public String toString(){
        return this.amount + this.payer + this.payee;
    }
}
