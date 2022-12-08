import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Vendedor ve = new Vendedor();
        Atendente at = new Atendente();
        Gerente ge = new Gerente();
        Estoque es = new Estoque();
        Fornecedor fo = new Fornecedor();
        Cliente cli = new Cliente();
        
        int deci_ver_ou_atri = 0;

        System.out.printf("Bem vindo ao sistema de CRM!\n");
        while (deci_ver_ou_atri<=3){
            System.out.printf("Oque vai querer agora?\n1 - Visualizar\n2 - Cadastrar\nOpção: ");
            sc.nextInt();
            if (deci_ver_ou_atri==1){

            }
            else if (deci_ver_ou_atri==2){

            }
            else{
                System.exit(0);
            }
        }
    }
}