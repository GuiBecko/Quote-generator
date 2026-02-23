public enum metodoPagamentos {
    PIX("pix"),//chama o constructor com o valor = "pix"
    CREDITO("credito"),
    DEBITO("debito");

    private final String type;

    metodoPagamentos(String type) {
        this.type= type;
    }

    public String getType() {
        return type;
    }
}
