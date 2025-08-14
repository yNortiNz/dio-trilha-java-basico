package org.yourcompany.yourproject;

public class Operadores {
    public static void main(String[] args) {
        int a,b;
        a = 6;
        b = 5;

        String resultado = a==b ? "verdadeiro" : "falso";//podemos usar essa forma mais resumida para verificar  true ou false

        System.out.println(resultado);

        String nomeUm = "Norton";
        String nomeDois = new String("Norton");

        System.out.println(nomeUm.equals(nomeDois));//usamos essa forma para comparar objetos

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){//podemos usar tambem essa forma condicional para verificar boolean true ou false
            System.out.println("Nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;//operador logico de negação

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;//operador logico maior que

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && condicao2){//operador logico E onde duas condições são atendidas
            System.out.println("as duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){//operador logico OU onde uma ou outra condição é atendida
            System.out.println("uma das condições é verdadeiras");
        }
    }
    
}
