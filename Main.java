public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];
        
        funcionarios[0] = new Funcionario("Matteo", 3000.00);
        funcionarios[1] = new Gerente("Nana", 5000.00);
        funcionarios[2] = new Vendedor("Max", 2000.00, 500.00);

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Pagamento de " + funcionario.getNome() + " = R$ " + funcionario.calcularPagamento());
        }
    }
}