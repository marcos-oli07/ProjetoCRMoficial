public class Gerente extends Funcionario{
    private String gerente_setor;
    private int gerente_lista_funcio;

    public String getGerente_setor() {
        return this.gerente_setor;
    }
    public void setGerente_setor(String gerente_setor) {
        this.gerente_setor = gerente_setor;
    }
    public int getGerente_lista_funcio() {
        return this.gerente_lista_funcio;
    }
    public void setGerente_lista_funcio(int gerente_lista_funcio) {
        this.gerente_lista_funcio = gerente_lista_funcio;
    }
    public void gerente_visualizar(){ 
        System.out.printf("\nAtendente\nNome: "+getPessoa_nome()+"\nCPF: "+getPessoa_CPF()+"\nSalário: "+getFuncio_salario()
        +"\nCarga Horária: "+getFuncio_cargaH()+"\nSetor: "+getGerente_setor()+"\nLista de funcionário: "+getGerente_lista_funcio());
    }
    public void endereco_visualizar(){
        System.out.println("\nEndereço Gerente\nNúmero do lote: "+getEndereco_num_lote()+"\nCPE: " +getEndereco_cpe()+"\nRua: "+getEndereco_rua() 
        +"\nBairro: "+getEndereco_bairro() +"\nCidade: "+getEndereco_cidade() +"\nEstado: "+getEndereco_estado());
    }
}