public class CalculoMedia {
    public static void main(String[] args){
        double nota1 = 8.0;
        double nota2 = 6.0;
        double nota3 = 4.0;
        double nota4 = 5.0;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7.0) {
            System.out.println("Aluno aprovado! :" + media);
        } else {
            System.out.println("Aluno reprovado! :" + media);
        }
    }
}
