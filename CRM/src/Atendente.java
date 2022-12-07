public class Atendente extends Funcionario{
private int atendente_num_caixa;

    public int getAtendente_num_caixa() {
        return this.atendente_num_caixa;
    }

    public void setAtendente_num_caixa(int atendente_num_caixa) {
        this.atendente_num_caixa = atendente_num_caixa;
    }

    public void atendente_visualizar(){
        System.out.println("Atendente\nNúmero do caixa: "+getAtendente_num_caixa());
    }
}