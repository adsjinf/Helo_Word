package br.com.adsistemas;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double x = 10.35764;

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.00;

        String produto1 = "Computer";
        String produto2 = "office desk";
        int age =30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        Locale localeBR = new Locale("pt","BR");

        System.out.println(x);
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f%n",x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n",x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros %n", x);

        System.out.printf("%s Tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        Locale.setDefault(localeBR);
        System.out.printf("Products%n");
        System.out.printf("%s, which price is $ %.2f%n", produto1, price1);
        System.out.printf("%s, which price is %.2f%n%n", produto2, price2);
        System.out.printf("Record: %d year old, code %d and gender: %s%n%n",age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (theree decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);

    }
}
