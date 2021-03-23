public class App {
    public static void main(String[] args) throws Exception {
        Pedido p1 = new Pedido();
        Produto pd = new Produto();
        pd.setNome("notebook");
        pd.setDescricao("5i,8gRAM,500HD");
        pd.setValor(500.00);

        Produto pc = new Produto();
        pc.setNome("Computador");
        pc.setDescricao("7i,16gRAM,500HD");
        pc.setValor(600.00);

        p1.addProduto(pd);
        p1.addProduto(pd,5);
        p1.addProduto(pc);
        System.out.println(pc.getValor());
        System.out.println(p1.quantProdutos());
    }
}
