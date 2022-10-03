import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double hora = console.nextFloat();
        System.out.println("Você trabalha quantas horas por mês? ");
        double mes = console.nextFloat();

        System.out.println("Você ganha por mês " + hora * mes);
    }
}