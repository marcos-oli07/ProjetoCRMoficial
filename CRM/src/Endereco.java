import java.util.Scanner;
public abstract class Endereco {

    Scanner sc = new Scanner(System.in);

private int endereco_num_lote;
private int endereco_cpe;
private String endereco_rua;
private String endereco_bairro;
private String endereco_cidade;
private String endereco_estado;

    public int getEndereco_num_lote() {
        return this.endereco_num_lote;
    }
    public void setEndereco_num_lote(int endereco_num_lote) {
        this.endereco_num_lote = endereco_num_lote;
    }
    public int getEndereco_cpe() {
        return this.endereco_cpe;
    }
    public void setEndereco_cpe(int endereco_cpe) {
        this.endereco_cpe = endereco_cpe;
    }
    public String getEndereco_rua() {
        return this.endereco_rua;
    }
    public void setEndereco_rua(String endereco_rua) {
        this.endereco_rua = endereco_rua;
    }
    public String getEndereco_bairro() {
        return this.endereco_bairro;
    }
    public void setEndereco_bairro(String endereco_bairro) {
        this.endereco_bairro = endereco_bairro;
    }
    public String getEndereco_cidade() {
        return this.endereco_cidade;
    }
    public void setEndereco_cidade(String endereco_cidade) {
        this.endereco_cidade = endereco_cidade;
    }
    public String getEndereco_estado() {
        return this.endereco_estado;
    }
    public void setEndereco_estado(String endereco_estado) {
        this.endereco_estado = endereco_estado;
    }   

    public void setar_endereco(){
        System.out.printf("Nº do lote: ");
                    setEndereco_num_lote(sc.nextInt());
                    System.out.printf("CPE: ");
                    setEndereco_cpe(sc.nextInt());
                    System.out.printf("Rua: ");
                    setEndereco_rua(sc.nextLine());
                    sc.nextLine();
                    System.out.printf("Bairro: ");
                    setEndereco_bairro(sc.nextLine());
                    System.out.printf("Cidade: ");
                    setEndereco_cidade(sc.nextLine());
                    System.out.printf("Estado: ");
                    setEndereco_estado(sc.nextLine());
    }
    public void endereco_visualizar(){
        System.out.println("\n\nEndereço Atendente\nNúmero do lote: "+getEndereco_num_lote()+"\nCPE: " +getEndereco_cpe()+"\nRua: "+getEndereco_rua() 
        +"\nBairro: "+getEndereco_bairro() +"\nCidade: "+getEndereco_cidade() +"\nEstado: "+getEndereco_estado());
    }
}