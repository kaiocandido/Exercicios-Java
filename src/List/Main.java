package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //adicionar itens na lista
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(23);

        //inserir novo elemente em alguma posicao
        list.add(1, 20);

        //ver tamanho da lista
        System.out.println(list.size());

        //removendo elemento da lista
        list.remove(1);

        //removendo da lista com predicado
        //list.removeIf(x -> x.charAt(0) == "M");


        //vendo a posicação de um elemente
        System.out.println("Index of: " + list.indexOf(111));
        //interando na lista com for each
        for (Integer i : list){
            System.out.println(i);

        }

        //deixando apenas quem tem o parametro na lista
        List<Integer> result = list.stream()
                .filter(x -> x == 1)
                .collect(Collectors.toList());
        for (Integer y : result){
            System.out.println("teste" + y);
        }

        //encontrando o primeiro elemento
        Integer num = list.stream().filter(x -> x == 1).findFirst().orElse(null);

        System.out.println("teste" + num);
    }
}
