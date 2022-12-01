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

    public void visual_atri(){
        System.out.printf("\n\nAtendente:\nId: "+getPessoa_id()+"\nNome: "+getPessoa_nome()+
        "\nSálario: "+getFuncio_salario()+"\nCarga horária: "+getFuncio_cargaH()+
        "\nId loja: "+getAten_id_loja()+"\nNúmero do caixa: "+getAten_n_caixa());
    }
}