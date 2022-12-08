public class Pedido {
    private int pedido_id;
    private double pedido_valor_frete;
    private int lista_de_compras_id;
    private double pedido_valor_total;
    private double pedido_valor_em_pontos;

    public int getPedido_id() {
        return this.pedido_id;
    }

    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }

    public double getPedido_valor_frete() {
        return this.pedido_valor_frete;
    }

    public void setPedido_valor_frete(double pedido_valor_frete) {
        this.pedido_valor_frete = pedido_valor_frete;
    }

    public int getLista_de_compras_id() {
        return this.lista_de_compras_id;
    }

    public void setLista_de_compras_id(int lista_de_compras_id) {
        this.lista_de_compras_id = lista_de_compras_id;
    }

    public double getPedido_valor_total() {
        return this.pedido_valor_total;
    }

    public void setPedido_valor_total(double pedido_valor_total) {
        this.pedido_valor_total = pedido_valor_total;
    }

    public double getPedido_valor_em_pontos() {
        return this.pedido_valor_em_pontos;
    }

    public void setPedido_valor_em_pontos(double pedido_valor_em_pontos) {
        this.pedido_valor_em_pontos = pedido_valor_em_pontos;
    }
        public void pedido_visualizar(){
        System.out.println("Pedido\nID do Pedido: "+getPedido_id()+"ID da Lista de compras: "+getLista_de_compras_id()
        +"Valor da compra(Frete incluído): "+getPedido_valor_total()+"Valor do Frete: "+getPedido_valor_frete()
        +"Valor em pontos"+getPedido_valor_em_pontos());
    }
}