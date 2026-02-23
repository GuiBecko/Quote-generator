import java.util.List;

public class Executor implements Runnable {
    final List<Transaction> transactions;
    
    public Executor(List<Transaction> transactions){
        this.transactions = transactions;
    }
    
    @Override
    public void run(){
        for(Transaction t : transactions){
            t.status = TransactionStatus.PROCESSED;
            System.out.println(Thread.currentThread().getName() + " processando " + t.getTransaction());
        }
    }
}
