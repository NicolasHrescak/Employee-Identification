package salario;
public class Funcionario {
    protected String nome;
    protected String funcao;

    public Funcionario(String nome, String funcao){
        this.nome = nome;
        this.funcao = funcao;
    }

    public void gerar_contra_cheque(){
        System.out.println("Funcionário: " + nome
        + "\nFunção: " + funcao);
    }
}
