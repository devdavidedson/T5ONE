package br.com.bytebank.teste;

public class TesteString {
    public static void main(String[] args) {

        int a =3;
        String nome = "Project Tonny";
        //String outro = new String("Projeto Tonny");

        nome.replace("P", "p");
        String outro = nome.toLowerCase();
        System.out.println(outro);
    }
}
