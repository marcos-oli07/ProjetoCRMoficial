import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            Vendedor vendedor = new Vendedor();
            Atendente atendente = new Atendente();
            Gerente gerente = new Gerente();
            Estoque estoque = new Estoque();
            Fornecedor fornecedor = new Fornecedor();
            Cliente cliente = new Cliente();
            Loja loja = new Loja();
            Pedido pedido = new Pedido();
            Produto produto = new Produto();
            Venda venda = new Venda();
            
            int acd, acv, aci, op = 0;

            System.out.printf("\nBem vindo ao sistema de CRM!\n");
            while (op<=3){
                System.out.printf("\nOque vai querer agora?\n1 - Visualizar\n2 - Cadastrar\n3 - Sair\nOpção: ");
                acd = sc.nextInt();  
                switch (acd) {
                    case 1:
                        System.out.printf("\nGostaria de visualizar quem?\n1 - Atendente\n2 - Cliente\n3 - Estoque\n4 - Fornecedor\n5 - Gerente\n6 - Loja\n7 - Pedido\n8 - Produto\n9 - Vendendor\n10 - Venda\nOpção: ");
                        acv = sc.nextInt();
                        switch (acv) {
                            case 1:atendente.atendente_visualizar(); break;
                            case 2:cliente.cliente_visualizar(); break;
                            case 3:estoque.estoque_visualizar();break;
                            case 4:fornecedor.Fornecedor_visualizar(); break;
                            case 5:gerente.gerente_visualizar(); break;
                            case 6:loja.loja_visualizar();loja.endereco_visualizar(); break;
                            case 7:pedido.pedido_visualizar(); break;
                            case 8:produto.produto_visualizar(); break;
                            case 9:vendedor.vedendor_visualizar();vendedor.endereco_visualizar(); break;
                            case 10:venda.venda_visualizar(); break;
                            default:System.out.printf("\nError, valor inválido!\n");break;
                        }
                        break;
                    case 2:
                        System.out.printf("\nGostaria de cadastrar quem?\n1 - Atendente\n2 - Cliente\n3 - Estoque\n4 - Fornecedor\n5 - Gerente\n6 - Loja\n7 - Pedido\n8 - Produto\n9 - Vendendor\n10 - Venda\nOpção: ");
                        aci = sc.nextInt();
                        switch (aci) {
                            case 1: atendente.setar_atendente();break;
                            case 2: cliente.setar_cliente();break;
                            case 3: estoque.setar_estoque();break;
                            case 4: fornecedor.setar_fornecedor();break;
                            case 5: gerente.setar_gerente();break;
                            case 6: System.out.printf("xzxz");break;
                            case 7: break;
                            case 8: produto.setar_produto();break;
                            case 9: break;
                            case 10: break;
                            default:System.out.printf("\nError, valor inválido!\n");break;
                        }
                        break;
                        case 3:
                            System.out.printf("\nTchau!\n");
                            System.exit(0);
                        break;
                        default:
                            System.out.printf("\nError, valor inválido!\n");
                        break;
                }
                System.out.printf("");
            }
        }
    }
}