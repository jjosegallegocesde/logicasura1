package org.example;

public class Main {
    public static void main(String[] args) {

        //Implicito
        int numeroEntero=10;
        double numeroDecimal=numeroEntero;

        //Explicito
        double numeroDecimalDos=10.5;
        int numeroEnteroDos=(int)numeroDecimalDos;

        long numeroLargo=1000000;
        short numeroPequeño=(short)numeroLargo;

        //Casting entre palabras y números
        char letra='☺';
        int codigo=(int)letra;

        long numero=16960;
        char caracter=(char)numero;

        System.out.println(numeroDecimal);
        System.out.println(numeroEnteroDos);
        System.out.println(numeroPequeño);
        System.out.println(codigo);;
        System.out.println(caracter);


    }
}