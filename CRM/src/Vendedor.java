public class Vendedor extends Funcionario{
    private int id_loja;
    private int qtd_itens_vend;
    private double total_em_vendas;

    public int getId_loja() {
        return this.id_loja;
    }
    public void setId_loja(int id_loja) {
        this.id_loja = id_loja;
    }
    public int getQtd_itens_vend() {
        return this.qtd_itens_vend;
    }
    public void setQtd_itens_vend(int qtd_itens_vend) {
        this.qtd_itens_vend = qtd_itens_vend;
    }
    public double getTotal_em_vendas() {
        return this.total_em_vendas;
    }
    public void setTotal_em_vendas(double total_em_vendas) {
        this.total_em_vendas = total_em_vendas;
    }

    public void visual_atri(){
        System.out.printf("\n\nVendedor:\nId: "+getPessoa_id()+"\nNome: "+getPessoa_nome()+
        "\nSálario: "+getFuncio_salario()+"\nCarga horária: "+getFuncio_cargaH()+
        "\nId loja: "+getId_loja()+"\nQtd de itens Vendidos: "+getQtd_itens_vend()+"\nTotal em vendas: "+getTotal_em_vendas());
    }
}