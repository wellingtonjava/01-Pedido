import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();

    public void addProduto(Produto produto, int quantidade){
        if(quantidade <= 0){
            System.out.println("Quantidade inválida");
        }else{
            itens.add(new ItemPedido(produto,quantidade));
        }
    }
    public void addProduto(Produto produto){
        itens.add(new ItemPedido(produto));
    }
    public int quantProdutos(){
		return itens.size();
    }
    public List<ItemPedido> getItens() {
        return itens;
    }

}
