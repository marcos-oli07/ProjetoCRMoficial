public class Gerente extends Funcionario{
    private int geren_do_setor;

    public int getGeren_do_setor() {
        return this.geren_do_setor;
    }
    public void setGeren_do_setor(int geren_do_setor) {
        this.geren_do_setor = geren_do_setor;
    }

    public void visual_atri(){
        System.out.printf("\n\nGerente:\nId: "+getPessoa_id()+"\nNome: "+getPessoa_nome()+
        "\nSálario: "+getFuncio_salario()+"\nCarga horária: "+getFuncio_cargaH()+
        "\nId loja: "+getGeren_do_setor());
    }
}