public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido = new Pedido();
        pedido.formPedido();

        Financeiro financeiro = new Financeiro();
        financeiro.calcularTotal();

        Models models = new Models();
        models.salvarNoBanco();
    }
}
