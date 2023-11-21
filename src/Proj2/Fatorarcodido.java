package Proj2;

import java.util.Scanner;

public class Fatorarcodido {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Double dinheiro, aposta;

    System.out.println("Digite o valor que você tem na conta:");
    dinheiro = sc.nextDouble();
    if (dinheiro <= 0) {
      System.out.println("Você tá liso. Deixe de arrumação");
      System.exit(0);
    }
    System.out.println("Você tem, R$" + dinheiro + " na conta.");

    if (dinheiro < 500) {
      System.out.print("Cuidado! Aposte com cuidado. \n");
    } else if (dinheiro < 1000) {
      System.out.print("Considere apostar com moderação. \n");
    } else {
      System.out.print("Você pode apostar à vontade. \n");
    }
    System.out.print("Quanto você quer apostar? ");
    aposta = sc.nextDouble();
    if (dinheiro - aposta < 0) {
      System.out.println(
        "Você não pode apostar mais do que tem. Deixe de ser doido"
      );
      System.exit(0);
    }
    System.out.printf("Você apostou R$%.2f%n", aposta);
    System.out.printf("Agora você tem R$%.2f na conta", dinheiro - aposta);
    sc.close();
  }
}
