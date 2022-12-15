public class Loja extends Endereco{
    private int loja_id; 
    private int loja_cnpj;
    private int loja_num_caixas;
    private Endereco endereco;

    public int getLoja_id() {
        return this.loja_id;
    }
    public void setLoja_id(int loja_id) {
        this.loja_id = loja_id;
    }
    public int getLoja_cnpj() {
        return this.loja_cnpj;
    }
    public void setLoja_cnpj(int loja_cnpj) {
        this.loja_cnpj = loja_cnpj;
    }
    public int getLoja_num_caixas() {
        return this.loja_num_caixas;
    }
    public void setLoja_num_caixas(int loja_num_caixas) {
        this.loja_num_caixas = loja_num_caixas;
    }
    public void setar_loja(){

        System.out.printf("\nLoja ID: ");
        setLoja_id(sc.nextInt());
        System.out.printf("CNPJ: ");
        setLoja_cnpj(sc.nextInt());
        System.out.printf("Nº de caixas: ");
        setLoja_num_caixas(sc.nextInt());

        setar_endereco();
    }
    public void loja_visualizar(){
        System.out.printf("\nLoja\nLoja ID: "+getLoja_id()+"\nLoja CNPJ: "+getLoja_cnpj()+"\nNúmero de Caixas"+getLoja_num_caixas());
        endereco_visualizar();
    }
}