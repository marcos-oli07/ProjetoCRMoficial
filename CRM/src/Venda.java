public class Venda {
private int venda_id;
private int venda_cliente_id;
private int venda_pedido_id;

    public int getVenda_id() {
        return this.venda_id;
    }
    public void setVenda_id(int venda_id) {
        this.venda_id = venda_id;
    }
    public int getVenda_cliente_id() {
        return this.venda_cliente_id;
    }
    public void setVenda_cliente_id(int venda_cliente_id) {
        this.venda_cliente_id = venda_cliente_id;
    }
    public int getVenda_pedido_id() {
        return this.venda_pedido_id;
    }
    public void setVenda_pedido_id(int venda_pedido_id) {
        this.venda_pedido_id = venda_pedido_id;
    }
    public void relacionador(int VenCliID){
        this.venda_cliente_id = VenCliID;
    }
    public void venda_visualizar(){
        System.out.println("\nVenda\nID da venda: "+getVenda_id()+"\nID Cliente: " +getVenda_cliente_id()+"\nID Pedido: "+getVenda_pedido_id());
    }
}