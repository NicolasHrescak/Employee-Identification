package salario;

public class Mensalista extends Temporario{
    protected double salario_mensal;
    public Mensalista(String nome, String funcao, int tempo_meses, double salario_mensal){
        super(nome, funcao, tempo_meses);
        this.salario_mensal = salario_mensal;
    }
    public void gerar_contra_cheque(){
        super.gerar_contra_cheque();
        System.out.println("Salario: "+ salario_mensal);
    }
}
