public class Estoque {
    private int produto_id;
    private int estoque_qtd;
    private int fornecedor_tele;

    public int getProduto_id() {
        return this.produto_id;
    }

    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }

    public int getEstoque_qtd() {
        return this.estoque_qtd;
    }

    public void setEstoque_qtd(int estoque_qtd) {
        this.estoque_qtd = estoque_qtd;
    }

    public int getFornecedor_tele() {
        return this.fornecedor_tele;
    }

    public void setFornecedor_tele(int fornecedor_tele) {
        this.fornecedor_tele = fornecedor_tele;
    }
    public void estoque_visualizar(){
        System.out.println("Estoque \nProduto ID: "+getProduto_id()+"\nQuantidade Estoque: "+getEstoque_qtd()+"\nTelefone do Fornecedor"+getFornecedor_tele());
    }
}
