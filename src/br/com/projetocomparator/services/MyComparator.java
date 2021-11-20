package br.com.projetocomparator.services;

import br.com.projetocomparator.entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
/*
    compare retorna positivo  se o primeiro for maior que o segundo
            retorna negativo se o segundo for maior que o primeiro
            retorna 0 se os números forem iguais
 */
