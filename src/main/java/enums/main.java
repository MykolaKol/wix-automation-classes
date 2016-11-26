package enums;

import com.sun.tools.doclets.internal.toolkit.builders.EnumConstantBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nikolayk on 11/13/16
 */
public class main {
    public static void main(String[] args) {
        List<Beer> beerList = Arrays.asList(Beer.values());

        System.out.println("$beer" + " -> " + "$type");

        for (Beer beer : beerList){
            System.out.println(beer + " -> " + beer.type());
        }

        System.out.println();
        System.out.println("*************************----------------------------*************************");
        System.out.println();

        System.out.println("$beer" + " -> " + "$alcoContent");

        for (Beer beer : beerList){
            System.out.println(beer + " -> " + beer.alcoContent());
        }
    }
}
