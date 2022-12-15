public class Venda {
private int venda_id;
private int cliente_id;
private int pedido_id;

    public int getVenda_id() {
        return this.venda_id;
    }
    public void setVenda_id(int venda_id) {
        this.venda_id = venda_id;
    }
    public int getCliente_id() {
        return this.cliente_id;
    }
    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }
    public int getPedido_id() {
        return this.pedido_id;
    }
    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }
    public void venda_visualizar(){
        System.out.println("\nVenda\nID da venda: "+getVenda_id()+"\nCliente Id: " +getCliente_id()+"\nPedido: "+getPedido_id());
    }
}