import java.util.Scanner;

public class desafio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o percentual de falta: ");
        double falta = scanner.nextDouble();

        System.out.print("Digite a nota da GS: ");
        double gs = scanner.nextDouble();

        double media_semestral = (falta * 0.4) + (gs * 0.6) / 2;
        System.out.println("Sua média do primeiro semestre: " +media_semestral);

        System.out.print("Digite sua media do segundo semestre: ");
        double ms2 = scanner.nextDouble();

        double segundo_semestre = (media_semestral * 0.4) + (ms2 * 0.6) / 2;
        double media_anual = (media_semestral + segundo_semestre) / 2;

        if (media_anual >= 6.0) {
            System.out.print("Aluno aprovado: " + media_anual);
        } else if (media_anual >= 4.0 && media_anual <= 5.9) {
            System.out.print("Aluno de recuperação: " + media_anual);
        } else {
            System.out.print("Aluno reprovado: " + media_anual);
        }

    }
}
