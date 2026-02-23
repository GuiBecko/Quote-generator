public enum TransactionStatus {
    PENDING("Pending"), PROCESSED("Processed");

    private final String value;

    TransactionStatus(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
