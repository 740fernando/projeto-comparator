package br.com.projetocomparator.application;

import br.com.projetocomparator.entities.Product;
import br.com.projetocomparator.services.MyComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static  void main(String[]args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",900.00));
        list.add(new Product("Notebok",1200.00));
        list.add(new Product("Tablet", 450.00));

        list.sort(new MyComparator());

        for( Product p : list){
            System.out.println(p);
        }
    }
}
/*
    1- utilizar a sintaxe de classe anonima :

    Comparator <Product> comp = new Comparator<Product>(){
        @Override
        public int compare(Product p1 , Product p2){
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    };

    2- utilizar expressoes lambdas

    Comparator<Product> comp = (p1,p2)-> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
    3- Comparator expressao lambda "direto no argumeto"
    list.sort((p1,p2)-> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
 */