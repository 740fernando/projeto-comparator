# Problema

- Suponha uma classe Product com os atributos name e price.
- Podemos implementar a comparação de produtos por meio da 
implementação da interface Comparable<Product>
- Entretanto, desta forma nossa classe não fica fechada para 
alteração: se o critério de comparação mudar, precisaremos 
alterar a classe Product.
- Podemos então usar o default method "sort" da interface List:
default void sort(Comparator<? super E> c)
