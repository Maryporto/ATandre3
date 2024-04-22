import java.util.Scanner;

public class ClassificadorAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as três notas do aluno:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média das notas: " + media);

        if (media >= 70 && media <= 100) {
            System.out.println("ALUNO APROVADO");
        } else if (media >= 40 && media < 70) {
            System.out.println("ALUNO EM RECUPERAÇÃO");
        } else if (media >= 0 && media < 40) {
            System.out.println("ALUNO REPROVADO");
        } else {
            System.out.println("Média inválida, verifique as notas digitadas.");
        }

        scanner.close();
    }
}
