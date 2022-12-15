public class Gerente extends Funcionario{
    private String gerente_setor;
    private String cpf_aten;
    private String cpf_vend;

    public String getCpf_aten() {
        return this.cpf_aten;
    }
    public void setCpf_aten(String cpf_aten) {
        this.cpf_aten = cpf_aten;
    }
    public String getCpf_vend() {
        return this.cpf_vend;
    }
    public void setCpf_vend(String cpf_vend) {
        this.cpf_vend = cpf_vend;
    }
    public String getGerente_setor() {
        return this.gerente_setor;
    }
    public void setGerente_setor(String gerente_setor) {
        this.gerente_setor = gerente_setor;
    }  
    
    public void setar_funcio_gerenciados(int aten, int vend){
        
    }

    public void setar_gerente(){
        System.out.printf("Nome: ");
        sc.nextLine();
        setPessoa_nome(sc.nextLine());
        System.out.printf("CPF: ");
        setPessoa_CPF(sc.nextInt());
        System.out.printf("Salário: ");
        setFuncio_salario(sc.nextDouble());
        System.out.printf("Carga Horária: ");
        setFuncio_cargaH(sc.nextInt());
        System.out.printf("Setor: ");
        sc.nextLine();
        setGerente_setor(sc.nextLine());

        setar_endereco();
    }
    public void gerente_visualizar(){ 
        System.out.printf("\nAtendente\nID loja"+getFuncio_idloja_setar()+"\nNome: "+getPessoa_nome()+"\nCPF: "+getPessoa_CPF()
        +"\nSalário: "+getFuncio_salario()+"\nCarga Horária: "+getFuncio_cargaH()+"\nSetor: "+getGerente_setor()+"\nLista de funcionário: ");

        endereco_visualizar();
    }
}