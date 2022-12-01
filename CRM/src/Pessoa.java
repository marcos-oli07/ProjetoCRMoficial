public abstract class Pessoa {
    private String pessoa_nome;
    private int pessoa_id;

    public String getPessoa_nome() {
        return this.pessoa_nome;
    }
    public void setPessoa_nome(String pessoa_nome) {
        this.pessoa_nome = pessoa_nome;
    }
    public int getPessoa_id() {
        return this.pessoa_id;
    }
    public void setPessoa_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

}