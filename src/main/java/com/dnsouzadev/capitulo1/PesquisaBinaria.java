package com.dnsouzadev.capitulo1;

public class PesquisaBinaria {
    public static String execute(int[] lista, int item) {
        int baixo = 0;
        int alto = lista.length - 1;
        int tentativas = 0;

        // int[] minhaLista = {1, 3, 5, 7, 9};
        // {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9, 10}

        while (baixo <= alto) {
            tentativas += 1;
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];

            if (chute == item) {
                return "O item " + item + " foi encontrado na posição " + meio + " após " + tentativas + " tentativas";
            }

            if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }

        return "O item " + item + " não foi encontrado";
    }
}
