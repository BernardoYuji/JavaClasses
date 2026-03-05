import java.util.Scanner;

public class correcao_desafio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pccf = 0.0;
        double gs = 0.0;
        //Bloco 1

        // Apresentar o rótulo
        System.out.print("Digite o valor de PCC&F: ");
        // O valor da string
        String entradaPCCF = scanner.nextLine().trim();
        //Validar se a string é vazia para realização de cast
        if(entradaPCCF.isEmpty()){
            System.out.println("Campo Obrigatório");
            scanner.close();
            return;
        }else{
            //transforma em double
            pccf = Double.parseDouble(entradaPCCF);
        }

        //Bloco 2
        // Apresentar o rótulo
        System.out.print("Digite o valor de GS: ");
        // O valor da string
        String entradaGs = scanner.nextLine().trim();
        //Validar se a string é vazia para realização de cast
        if(entradaGs.isEmpty()){
            System.out.println("Campo Obrigatório");
            scanner.close();
            return;
        }else{
            //transforma em double
            gs = Double.parseDouble(entradaGs);
        }

        // Cálculo de MS1
        double ms1 = (pccf * 0.4) + (gs * 0.6);

        // Exibir o resultado
        System.out.println("O valor de MS1 é: " + ms1);

        // Fechar o scanner
        scanner.close();
    }
}
