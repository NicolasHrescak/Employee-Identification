package salario;

public class Concursado extends Funcionario{
    protected int ano_ingresso;
    protected double salarioMensal;

    public Concursado(String nome, String funcao, int ano_ingresso, double salario) {
        super(nome, funcao);
        this.ano_ingresso = ano_ingresso;
        this.salarioMensal = salario;
    }

    @Override
    public void gerar_contra_cheque(){
        super.gerar_contra_cheque();
        System.out.println("Ano de ingresso:" + ano_ingresso
        + "\nSalario: "+ salarioMensal);

    }
}


