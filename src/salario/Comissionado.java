package salario;

public class Comissionado extends Concursado{
    protected double comissao;
    protected String cargo;

    public Comissionado (String nome, String funcao, int ano_ingresso, double salarioMensal, double comissao, String cargo){
        super(nome, funcao, ano_ingresso, salarioMensal);
        this.comissao = comissao;
        this.cargo = cargo;
    }

    @Override
    public void gerar_contra_cheque(){
        super.gerar_contra_cheque();
        System.out.println("Comissao: " + comissao
        + "\nCargo: " + cargo
        + "\nTotal recebido: " + (comissao + salarioMensal));
   }
}