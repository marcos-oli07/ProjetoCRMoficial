public class Loja extends Endereco{
    private int loja_cnpj;
    private int loja_num_caixas;

    public int getLoja_cnpj() {
        return this.loja_cnpj;
    }

    public void setLoja_cnpj(int loja_cnpj) {
        this.loja_cnpj = loja_cnpj;
    }

    public int getLoja_num_caixas() {
        return this.loja_num_caixas;
    }

    public void setLoja_num_caixas(int loja_num_caixas) {
        this.loja_num_caixas = loja_num_caixas;
    }
    public void loja_visualizar(){
        System.out.println("\nLoja\nLoja ID: "+getLoja_cnpj()+"\nNúmero de Caixas"+getLoja_num_caixas());
    }
    public void endereco_visualizar(){
        System.out.println("\nEndereço Loja\nNúmero do lote: "+getEndereco_num_lote()+"\nCPE: " +getEndereco_cpe()+"\nRua: "+getEndereco_rua() 
        +"\nBairro: "+getEndereco_bairro() +"\nCidade: "+getEndereco_cidade() +"\nEstado: "+getEndereco_estado());
    }
}
