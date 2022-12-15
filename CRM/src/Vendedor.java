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
    public void setar_idlojaV(int idlojaV){
        setFuncio_idloja_setar(idlojaV);
    }
    public void setar_vedendor(){
        System.out.printf("\nVendedor\nNome: ");
        setPessoa_nome(sc.nextLine());
        System.out.printf("CPF: ");
        setPessoa_CPF(sc.nextInt());
        System.out.printf("Salário: ");
        setFuncio_salario(sc.nextDouble());
        System.out.printf("Carga Horária: ");
        setFuncio_cargaH(sc.nextInt());
        System.out.printf("Nº registro: ");
        setFuncio_registro(sc.nextInt());
        System.out.printf("Comissão: ");
        setVendedor_comissao(sc.nextDouble());
        System.out.printf("Meta semanal: ");
        setVendedor_meta(sc.nextDouble());

        setar_endereco();
    }
    public void vedendor_visualizar(){ 
        System.out.printf("\nAtendente\nID loja"+getFuncio_idloja_setar()+"\nNome: "+getPessoa_nome()+"\nCPF: "+getPessoa_CPF()+"\nSalário: "+getFuncio_salario()
        +"\nCarga Horária: "+getFuncio_cargaH()+"\nComissão: "+getVendedor_comissao()+"\nMeta samanal: "+getVendedor_meta());

        endereco_visualizar();
    }
}