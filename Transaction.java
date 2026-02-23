public class Transaction {
    int id;
    float value;
    metodoPagamentos metodoPagamento;
    public TransactionStatus status = TransactionStatus.PENDING;

    public Transaction(int id, float value, metodoPagamentos metodoPagamento){
        this.id = id;
        this.value = value;
        this.metodoPagamento = metodoPagamento;
    }

    public String getTransaction(){
        return String.format("id: %-4d value: %-10f payment method: %-10s status: %-10s", this.id, this.value, this.metodoPagamento, this.status);
    }
}
