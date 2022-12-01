import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa pe = new Pessoa();
        
        System.out.printf("\nId: ");
        pe.setar_pessoa_id(sc.nextInt());
        sc.nextLine();        
        System.out.printf("\nNome: ");
        pe.setar_pessoa_nome(sc.nextLine());

        System.out.print("\nPessoa\nVendo Id: "+pe.ver_id());
        System.out.print("\nVendo nome: "+pe.ver_nome());

    }
}