package Laden;

import java.util.*;

import static java.lang.Math.floor;

public class Produkt {
    private int date;
    private float Preis;
    private String Name;


    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public float getPreis() {
        return Preis;
    }


    public void setPreis(float Preis) {
        if((Preis/0.05d) % 1 == 0) {
            this.Preis=Preis;
        }
        else
        {
            this.Preis = (float) ((floor(Preis/0.05d)+1)*0.05d);
        }

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Produkt(String Name, int date, float Preis){
        this.date=date;
        setPreis(Preis);
        this.Name=Name;
    }



}
