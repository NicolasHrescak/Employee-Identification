package salario;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Empresa petrobras = new Empresa("Petrobras");
        petrobras.adicionar(new Concursado("Joao Silva", "Engenheiro Químico", 1998, 8000.00));
        petrobras.adicionar(new Comissionado("Carmem Luz", "Engenheiro Civil", 2007, 20000.00, 6000.00, "Diretor Geral"));
        petrobras.adicionar(new Horista("Manoel de Barros", "Auxiliar de Limpeza", 12, 500, 40.00));
        petrobras.adicionar(new Mensalista("Tereza Alves", "Secretaria", 24, 2500.00));
        petrobras.gerar_folha();
    }

}