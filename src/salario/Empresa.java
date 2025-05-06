package salario;
import java.util.ArrayList;

public class Empresa {
    protected String nome;
    protected ArrayList<Funcionario> funcionario;

    public Empresa (String nome){
        this.nome = nome;
        this.funcionario = new ArrayList<>();
    }

    public void adicionar(Funcionario funcionario){
        this.funcionario.add(funcionario);
    }

    public void gerar_folha(){
        for (Funcionario f : funcionario){
            f.gerar_contra_cheque();
            System.out.println("-------------------------------------");
        }
    }
}
