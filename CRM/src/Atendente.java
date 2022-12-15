import java.util.Scanner;

public class Atendente extends Funcionario{
    private int aten_n_caixa;
    Scanner sc = new Scanner(System.in);

    public int getAten_n_caixa() {
        return this.aten_n_caixa;
    }
    public void setAten_n_caixa(int aten_n_caixa) {
        this.aten_n_caixa = aten_n_caixa;
    }
    public void setar_idlojaA(int idlojaA){
        setFuncio_idloja_setar(idlojaA);
    }
    public void setar_atendente(){
        System.out.printf("\nAtendente\nNome: ");
        setPessoa_nome(sc.nextLine());
        System.out.printf("CPF: ");
        setPessoa_CPF(sc.nextInt());
        System.out.printf("Salário: ");
        setFuncio_salario(sc.nextDouble());
        System.out.printf("Carga Horária: ");
        setFuncio_cargaH(sc.nextInt());
        System.out.printf("Nº registro: ");
        setFuncio_registro(sc.nextInt());
        System.out.printf("Nº do caixa: ");
        setAten_n_caixa(sc.nextInt());  

        setar_endereco();
    }
    public void atendente_visualizar(){ 
        System.out.printf("\nAtendente\nID loja: "+getFuncio_idloja_setar()+"\nNome: "+getPessoa_nome()+"\nCPF: "+getPessoa_CPF()+"\nSalário: "+getFuncio_salario()
        +"\nCarga Horária: "+getFuncio_cargaH()+"\nNº registro: "+getFuncio_registro()+"\nNº do caixa: "+getAten_n_caixa());
        
        endereco_visualizar();
    }   
}