

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto prod){
        this.produto = prod;
    }
    public ItemPedido(Produto prod,int quant){
        this.produto = prod;
        this.quantidade = quant;
    }
    public Produto getProduto() {
        return produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
