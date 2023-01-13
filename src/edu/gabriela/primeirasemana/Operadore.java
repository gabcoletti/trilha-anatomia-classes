package edu.gabriela.primeirasemana;

public class Operadore { 
    public static void main (String [] args) {
        String concatenacao="?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        
        System.out.println(concatenacao);
        

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        //x repeticao

        numero = numero + 1;

        System.out.println(numero++);

        System.out.println(++numero);

        boolean variavel = true;

        System.out.println (!variavel);



    }
    
}
