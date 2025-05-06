package salario;

public class Horista extends Temporario{
    protected int horas_trabalhadas;
    protected double valor_da_hora;


    public Horista (String nome, String funcao, int tempo_meses, int hora_trabalhadas, double valor_da_hora){
        super(nome,funcao,tempo_meses);
        this.horas_trabalhadas = hora_trabalhadas;
        this.valor_da_hora = valor_da_hora;
    }

    @Override
    public void gerar_contra_cheque(){
        super.gerar_contra_cheque();
        System.out.println("Horas trabalhadas:" + horas_trabalhadas
        + "\nValor da hora: " + valor_da_hora
        + "\nTotal: "+ (horas_trabalhadas * valor_da_hora));
    }
}
