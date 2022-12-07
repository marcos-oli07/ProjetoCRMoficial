import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Vendedor ve = new Vendedor();
        Atendente at = new Atendente();
        Gerente ge = new Gerente();

        ve.setPessoa_nome("Fabio");
        at.setPessoa_nome("Tulio");
        ge.setPessoa_nome("Gertrudes");

        ve.visual_atri();
        at.visual_atri();
        ge.visual_atri();

        
    }
}