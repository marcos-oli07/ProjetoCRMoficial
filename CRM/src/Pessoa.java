public abstract class Pessoa {
    private int pessoa_CPF;
    private String pessoa_nome;

    public int getPessoa_CPF() {
        return this.pessoa_CPF;
    }
    public void setPessoa_CPF(int pessoa_CPF) {
        this.pessoa_CPF = pessoa_CPF;
    }
    public String getPessoa_nome() {
        return this.pessoa_nome;
    }
    public void setPessoa_nome(String pessoa_nome) {
        this.pessoa_nome = pessoa_nome;
    }
    
}