public class Vendedor extends Funcionario{
    private double vendedor_comissao;
    private double vendedor_meta;

    public double getVendedor_comissao() {
        return this.vendedor_comissao;
    }
    public void setVendedor_comissao(double vendedor_comissao) {
        this.vendedor_comissao = vendedor_comissao;
    }
    public double getVendedor_meta() {
        return this.vendedor_meta;
    }
    public void setVendedor_meta(double vendedor_meta) {
        this.vendedor_meta = vendedor_meta;
    }
    public void vedendor_visualizar(){ 
        System.out.printf("\nAtendente\nNome: "+getPessoa_nome()+"\nCPF: "+getPessoa_CPF()+"\nSalário: "+getFuncio_salario()
        +"\nCarga Horária: "+getFuncio_cargaH()+"\nComissão: "+getVendedor_comissao()+"\nMeta samanal: "+getVendedor_meta());
    }
    public void endereco_visualizar(){
        System.out.println("\nEndereço Vedendor\nNúmero do lote: "+getEndereco_num_lote()+"\nCPE: " +getEndereco_cpe()+"\nRua: "+getEndereco_rua() 
        +"\nBairro: "+getEndereco_bairro() +"\nCidade: "+getEndereco_cidade() +"\nEstado: "+getEndereco_estado());
    }
}