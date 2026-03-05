import java.util.Scanner;

public class correcao_desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota1 = 0.0;
        double nota2 = 0.0;
        double trabalho = 0.0;

        // Entrada nota 1
        System.out.print("Digite a primeira nota: ");
        String entradaNota1 = scanner.nextLine().trim();
        if (entradaNota1.isEmpty()) {
            System.out.println("Campo obrigatório!");
            scanner.close();
            return;
        } else {
            nota1 = Double.parseDouble(entradaNota1);
        }
        // Entrada nota 2
        System.out.print("Digite a segunda nota: ");
        String entradaNota2 = scanner.nextLine().trim();
        if (entradaNota2.isEmpty()) {
            System.out.println("Campo obrigatório!");
            scanner.close();
            return;
        } else {
            nota2 = Double.parseDouble(entradaNota2);
        }

        // Entrada nota trabalho
        System.out.print("Digite a nota do trabalho: ");
        String entradaTrabalho = scanner.nextLine().trim();
        if (entradaTrabalho.isEmpty()) {
            System.out.println("Campo obrigatório!");
            scanner.close();
            return;
        } else {
            trabalho = Double.parseDouble(entradaTrabalho);
        }

        // Cálculo da Média Semestral
        double mediaSemestral = (nota1 * 0.4) + (nota2 * 0.4) + (trabalho * 0.2);
        // validacao de aprovacao e exame
        if (mediaSemestral >= 7.0) {
            System.out.println("Parabens! Aluno aprovado com media: " + mediaSemestral);
        } else {
            // Requisitos do Exame
            System.out.println("Recuperacao! Aluno com media: " + mediaSemestral);

            // Entrada da nota de corte
            double notaCorte = (10.0 - mediaSemestral);
            System.out.println("Nota de corte para o exame: " + notaCorte);

            System.out.print("Digite a nota do exame: ");
            String entradaExame = scanner.nextLine().trim();

            if (entradaExame.isEmpty()) {
                System.out.println("Campo obrigatório!");
                scanner.close();
                return;
            }

            double exame = Double.parseDouble(entradaExame);
            double mediaExame = (mediaSemestral + exame) / 2;

            // validacao da media do exame
            if (mediaExame >= 5.0) {
                System.out.println("Parabens! Aluno aprovado apos exame: " + mediaExame);
            } else {
                System.out.println("Aluno reprovado");
            }
        }

        scanner.close();
    }
}