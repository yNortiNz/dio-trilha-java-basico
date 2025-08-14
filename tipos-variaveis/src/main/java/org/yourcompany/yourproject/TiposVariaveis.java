package org.yourcompany.yourproject;

public class TiposVariaveis {

    public static void main(String[] args) {
        //tipos primitivos
        //estudar a classe String que representa texto na aplicação

        String meuNome = "Norton Cunha";
        

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //adicionado o cast como adaptação com consciencia de que se ocorrer algo inesperado estamos cientes, não é usado com frequencia.
        
        int numero = 5;

        numero = 10;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14; //determinação de uma constante onde seu valor não pode ser alterado. importante ser em CAIXA ALTA.

    }
}
