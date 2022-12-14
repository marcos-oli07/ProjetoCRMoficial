public class Fornecedor {
    private int fornecedor_id;
    private String fornecedor_nome;
    private String fornecedor_desc;
    private int fornecedor_tele;

    public int getFornecedor_id() {
        return this.fornecedor_id;
    }

    public void setFornecedor_id(int fornecedor_id) {
        this.fornecedor_id = fornecedor_id;
    }

    public String getFornecedor_nome() {
        return this.fornecedor_nome;
    }

    public void setFornecedor_nome(String fornecedor_nome) {
        this.fornecedor_nome = fornecedor_nome;
    }

    public String getFornecedor_desc() {
        return this.fornecedor_desc;
    }

    public void setFornecedor_desc(String fornecedor_desc) {
        this.fornecedor_desc = fornecedor_desc;
    }

    public int getFornecedor_tele() {
        return this.fornecedor_tele;
    }

    public void setFornecedor_tele(int fornecedor_tele) {
        this.fornecedor_tele = fornecedor_tele;
    }
    public void Fornecedor_visualizar(){
        System.out.println("\nFornecedor \nFornecedor ID: "+getFornecedor_id()+"\nNome: "+getFornecedor_nome()+"\nDescrição do Fornecedor: "+getFornecedor_desc()+"\nTelefone do Fornecedor: "+getFornecedor_tele());
    }
}
