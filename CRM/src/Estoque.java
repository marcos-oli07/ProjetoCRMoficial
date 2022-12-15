import java.util.Scanner;

public class Estoque {
    Scanner sc = new Scanner(System.in);
    private int estoque_qtd;
    private int loja_id;
    private int produto_id;

    public int getEstoque_qtd() {
        return this.estoque_qtd;
    }
    public void setEstoque_qtd(int estoque_qtd) {
        this.estoque_qtd = estoque_qtd;
    }
    public int getLoja_id() {
        return this.loja_id;
    }
    public void setLoja_id(int loja_id) {
        this.loja_id = loja_id;
    }
    public int getProduto_id() {
        return this.produto_id;
    }
    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }
    
    public void estoque_lojaid(int Elojaid){
        this.loja_id = Elojaid;
    }
    public void estoque_proid(int Eproid){
        this.loja_id = Eproid;
    }
    public void estoque_visualizar(){
        System.out.println("\nEstoque\nLoja ID: "+getLoja_id()+"\nProduto ID: "+getProduto_id()+"\nQtd no estoque: "+getEstoque_qtd());
    }
    public void setar_estoque(){
        System.out.printf("\nQtd no estoque: ");
        setEstoque_qtd(sc.nextInt());
    }
}
