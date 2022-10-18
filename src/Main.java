import java.util.ArrayList;
import java.util.Comparator;

import Laden.Produkt;
public class Main {

    public static void printList(ArrayList<Produkt> lista)
    {
        for(Produkt p: lista)
        {
            System.out.println(p.getDate());
            System.out.println(p.getName());
            System.out.println(p.getPreis());
        }
    }
    public static void update(ArrayList<Produkt> lista){
        for (Produkt produkt : lista) {
            if (produkt.getDate() > 10)
                produkt.setDate(produkt.getDate() - produkt.getDate() / 10);
            if (produkt.getDate() > 20)
                produkt.setPreis(produkt.getPreis() - produkt.getPreis() * 2 / 10);
        }
    }
    public static ArrayList<Produkt> teuer(ArrayList<Produkt> lista){
        ArrayList<Produkt> teuereProdukte = new ArrayList<>();
        for(Produkt produkt : lista)
        {
            if(produkt.getPreis() >100) {

                teuereProdukte.add(produkt);
            }
        }
        return teuereProdukte;
    }

    public static ArrayList<Produkt> sortare(ArrayList<Produkt> lista){
        update(lista);
        lista.sort(Comparator.comparing(Produkt::getPreis));
        return lista;
    }

    public static Produkt teuerste(ArrayList<Produkt> lista)
    {
        float max=0;
        Produkt aux = new Produkt("a",0 ,0);
        for(Produkt produkt : lista){
            if(produkt.getPreis() >max) {
                max = produkt.getPreis();
                aux=produkt;
            }
        }
        return aux;
    }
    public static Produkt fresh(ArrayList<Produkt> lista)
    {
        int min=9999;
        Produkt aux = new Produkt("a",0 ,0);
        for(Produkt produkt : lista){
            if(produkt.getDate() <min) {
                min = produkt.getDate();
                aux=produkt;
            }
        }
        return aux;
    }
    public static void printProduct(Produkt p)
    {
        System.out.println(p.getName());
        System.out.println(p.getDate());
        System.out.println(p.getPreis());
    }

    public static void main(String[] args) {
        ArrayList<Produkt> a=new ArrayList<>();
        a.add(new Produkt("Salami",13,70));
        a.add(new Produkt("ranzxa",3,70));
        a.add(new Produkt("Tomato",23,700));
        printList(sortare(a));
        printProduct(fresh(a));
        printProduct(teuerste(a));


    }
}