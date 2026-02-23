import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String args[]){
        List<Transaction> transactions = new ArrayList<>(100);
        
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        //Cria transações randomicas na lista
        createTransactions(transactions);

        for(int i = 0; i < 5; i++){
            int start = i * 20;
            int end = (i + 1) * 20;

            List<Transaction> subList = transactions.subList(start, end);
            executor.execute(new Executor(subList));
        }
        executor.shutdown();
    }

    public static void createTransactions(List<Transaction> transactions){
        Random random = new Random();

        for(int i = 0; i <= 100; i++){
            int metodo = random.nextInt(3) + 1;
            Transaction t;

            switch(metodo){
                case 1 -> t = new Transaction(i, Math.round((random.nextFloat(20) + 1)*100/100.0f), metodoPagamentos.PIX);
                case 2 -> t = new Transaction(i, Math.round((random.nextFloat(20) + 1)*100/100.0f), metodoPagamentos.CREDITO);
                case 3 -> t = new Transaction(i, Math.round((random.nextFloat(20) + 1)*100/100.0f), metodoPagamentos.DEBITO);
                default -> t = null;
            }

            transactions.add(t);
            
        }
    }
}

