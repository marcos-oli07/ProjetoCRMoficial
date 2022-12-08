public abstract class Funcionario extends Pessoa{
    private double funcio_salario;
    private int funcio_cargaH;
    private int funcio_registro;

    public double getFuncio_salario() {
        return this.funcio_salario;
    }

    public void setFuncio_salario(double funcio_salario) {
        this.funcio_salario = funcio_salario;
    }

    public int getFuncio_cargaH() {
        return this.funcio_cargaH;
    }

    public void setFuncio_cargaH(int funcio_cargaH) {
        this.funcio_cargaH = funcio_cargaH;
    }

    public int getFuncio_registro() {
        return this.funcio_registro;
    }

    public void setFuncio_registro(int funcio_registro) {
        this.funcio_registro = funcio_registro;

    }
    public void funcionario_visualizar(){
        System.out.println("Funcionário\nCPF: "+getPessoa_CPF()+"Nome: "+getPessoa_nome()+"Salário: "+getFuncio_salario()+"Carga Horário: "+getFuncio_cargaH()+"Registro: "+getFuncio_registro());
    }

}