public class Atendente extends Funcionario{
    private int aten_id_loja;
    private int aten_n_caixa;

    public int getAten_id_loja() {
        return this.aten_id_loja;
    }
    public void setAten_id_loja(int aten_id_loja) {
        this.aten_id_loja = aten_id_loja;
    }
    public int getAten_n_caixa() {
        return this.aten_n_caixa;
    }
    public void setAten_n_caixa(int aten_n_caixa) {
        this.aten_n_caixa = aten_n_caixa;
    }
    public void atendente_visualizar(){ 
        System.out.printf("\nAtendente\nNome: "+getPessoa_nome()+"\nCPF: "+getPessoa_CPF()+"\nSalário: "+getFuncio_salario()
        +"\nCarga Horária: "+getFuncio_cargaH()+"\nNº registro: "+getFuncio_registro()+"\nNº do caixa: ");      
    }
    public void endereco_visualizar(){
        System.out.println("\nEndereço Atendente\nNúmero do lote: "+getEndereco_num_lote()+"\nCPE: " +getEndereco_cpe()+"\nRua: "+getEndereco_rua() 
        +"\nBairro: "+getEndereco_bairro() +"\nCidade: "+getEndereco_cidade() +"\nEstado: "+getEndereco_estado());
    }
}