public class Pessoa {
    private String nome;
    private int id;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setar_pessoa_nome(String nome){
        this.nome=nome;
    }
    public String ver_nome(){
        return this.nome;
    }
    public void setar_pessoa_id(int id){
        this.id=id;
    }
    public int ver_id(){
        return this.id;
    }

}