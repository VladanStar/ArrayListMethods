package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> list  = new ArrayList<String>();
        list.add("item1");
        list.add("item2");
        list.add(2,"item3");
        list.add("item4");
        System.out.println("Nasa lista sadrzi sledece elemente" + list);

        // proveravamo index elemenata
        int pos = list.indexOf("item2");
        System.out.println("Index elementa item2 je: " + pos);

        //proveravamo da li je prazna array list
        boolean check = list.isEmpty();
        System.out.println("Proverava da li je prazna lista:  " + check);

        // proveravamo velicinu liste
        int size = list.size();
        System.out.println("Veleicina liste je: " + size);

        // da li element postoji u listi
        boolean element = list.contains("item5");
        System.out.println("proverava da li element item5 postoji u listi:" + element);

        // uzimanje elemenata na poziciji
        String item = list.get(0);
        System.out.println("Element na poziciji 0 je: " + item);

        // ispisivanje svih elementa liste
        System.out.println("Svi elementi liste koristeci petlju su: ");
        for(int i =0;i<list.size();i++){
            System.out.println("Index: "+ i + " - vrednost: "+ list.get(i));
        }
        // koriscenje foreach petlje
        System.out.println("Koriscenje foreach petlje: ");
        for(String str:list){
            System.out.println("Element je: " + str);
        }

        // koriscenje iterator za stampanje
        System.out.println("Koriscenje iteratora za stampanje: ");
        for(Iterator<String> it =list.iterator();it.hasNext();){
            System.out.println("Vrednost elementa je: " + it.next());
        }
        //zamena elemenata u listi
        list.set(1,"NewItem");
        System.out.println("Lista nakon zamena je: "+ list);

        // brisanje elemenata u poziciji 0

        list.remove(0);

        // brisanje elementa sa vrednoscu item3
        list.remove("item3");
        System.out.println("krajnji rezultat liste je: "+ list);

        // pretvaranje Array liste u niz
        String[] simpleArray = list.toArray(new String[list.size()]);
        System.out.println("Nakon pretvaranja ArratListe u niz. Vrednost kreiranog niza je: " + Arrays.toString(simpleArray));
    }
}
