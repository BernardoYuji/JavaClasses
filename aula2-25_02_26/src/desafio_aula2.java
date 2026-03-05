import java.util.Scanner; // 'S' de Scanner deve ser maiúsculo

public class desafio_aula2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota1 = 0.0;
        double nota2 = 0.0;
        double trabalho = 0.0;

        System.out.print("Digite a primeira nota: ");
        String entradaNota1 = scanner.nextLine().trim();
        if (entradaNota1.isEmpty()) {
            System.out.println("Campo obrigatório!");
            scanner.close();
            return;
        } else {
            nota1 = Double.parseDouble(entradaNota1); // Faltava ';'
        }

        System.out.print("Digite a segunda nota: ");
        String entradaNota2 = scanner.nextLine().trim();
        if (entradaNota2.isEmpty()) {
            System.out.println("Campo obrigatório!");
            scanner.close();
            return;
        } else {
            nota2 = Double.parseDouble(entradaNota2); // Faltava ';'
        }

        System.out.print("Digite a nota do trabalho: ");
        String entradaTrabalho = scanner.nextLine().trim(); // Nome da variável ajustado para clareza
        if (entradaTrabalho.isEmpty()) {
            System.out.println("Campo obrigatório!");
            scanner.close();
            return;
        } else {
            trabalho = Double.parseDouble(entradaTrabalho); // Corrigido: usava entradaNota1 antes
        }

        double mediaSemestral = (nota1 * 0.4) + (nota2 * 0.4) + (trabalho * 0.2);
        if (mediaSemestral >= 7.0) {
            System.out.println("Parabens! Aluno aprovado com media: " + mediaSemestral);
        } else {
            System.out.println("Recupecao! Aluno com media: " + mediaSemestral);
            double exame = 0.0;
            System.out.print("Digite a nota do exame: ");
            String entradaExame = scanner.nextLine().trim();

            double notaCorte = (10.0 - mediaSemestral);
            double mediaExame = (mediaSemestral + exame) / 2;
            if (mediaExame >= 5.0) {
                System.out.println("Parabens! Aluno aprovado apos exame: " + mediaExame);
            }else {
                System.out.println("Aluno reprovado");
            }
        }

    } // Faltava fechar o método main
} // Faltava fechar a classe