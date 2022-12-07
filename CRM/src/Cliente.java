public class Cliente {
     private int cliente_id;
 private int cliente_pontos = 0;

    public int getCliente_id() {
        return this.cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getCliente_pontos() {
        return this.cliente_pontos;
    }

    public void setCliente_pontos(int cliente_pontos) {
        this.cliente_pontos = cliente_pontos; 
    }

    public void cliente_visualizar(){
        System.out.println("Cliente\nID: "+getCliente_id()+"\nPontos: "+getCliente_pontos());
    }
}
