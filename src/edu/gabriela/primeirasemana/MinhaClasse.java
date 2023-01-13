package edu.gabriela.primeirasemana;
public class MinhaClasse  {

    public static void main (String [] args) {

        String primeiroNome = "Gabriela";
        String segundoNome = "Coletti";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        }

    public static String nomeCompleto (String primerioNome, String segundoNome) {
        return "Resultado do método" + primeiroNome.concat (" ").concat(segundoNome);
    }
}