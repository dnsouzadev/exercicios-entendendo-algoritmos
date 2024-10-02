package com.dnsouzadev;

import com.dnsouzadev.capitulo1.PesquisaBinaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] minhaLista = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9, 10};
        System.out.println(PesquisaBinaria.execute(minhaLista, 1));
        System.out.println(PesquisaBinaria.execute(minhaLista, -1));
    }
}