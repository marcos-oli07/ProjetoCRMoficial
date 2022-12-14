public class Produto {
    private int produto_id;
    private String produto_nome;
    private double produto_valor;
    private String produto_desc;
    private int produto_qtd;

    public int getProduto_id() {
        return this.produto_id;
    }
    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }
    public String getProduto_nome() {
        return this.produto_nome;
    }
    public void setProduto_nome(String produto_nome) {
        this.produto_nome = produto_nome;
    }
    public double getProduto_valor() {
        return this.produto_valor;
    }
    public void setProduto_valor(double produto_valor) {
        this.produto_valor = produto_valor;
    }
    public String getProduto_desc() {
        return this.produto_desc;
    }
    public void setProduto_desc(String produto_desc) {
        this.produto_desc = produto_desc;
    }
    public int getProduto_qtd() {
        return this.produto_qtd;
    }
    public void setProduto_qtd(int produto_qtd) {
        this.produto_qtd = produto_qtd;
    }

    public void produto_visualizar(){
        System.out.println("\nProduto\nID do Produto: "+getProduto_id()+"\nNome: "+getProduto_nome()+"\nValor: "+getProduto_valor()
        +"\nDescrição: "+getProduto_desc()+"\nQtd: "+getProduto_qtd());
    }
}