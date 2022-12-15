public class Cliente extends Pessoa{
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
    public void gerador_de_pontos(int pontos){
        this.cliente_pontos = pontos;
    }
    public void setar_cliente(){
        System.out.printf("\nAtendente\nNome: ");
        setPessoa_nome(sc.nextLine());
        System.out.printf("CPF: ");
        setPessoa_CPF(sc.nextInt());
        System.out.printf("Cliente ID: ");
        setCliente_id(sc.nextInt());
        setar_endereco();
    }
    public void cliente_visualizar(){
        System.out.println("\nCliente\nID: "+getCliente_id()+"\nNome: "+getPessoa_nome()
        +"\nCPF: "+getPessoa_CPF()+"\nPontos:  "+getCliente_pontos());

        endereco_visualizar();
    }   
}