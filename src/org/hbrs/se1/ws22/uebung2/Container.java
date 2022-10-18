package org.hbrs.se1.ws22.uebung2;

import java.util.ArrayList;

public class Container {

    //ArrayList als Datenstruktur
    private final ArrayList<Member> arrayList;


    //Konstruktor
    public Container() {
        this.arrayList = new ArrayList<>();
    }


    //Methode zum Hinzufügen eines Member Objektes
    public void addMember(Member member) {

    }


    //Methode zum Entfernen eines Member Objektes
    public String deleteMember(Integer id) {

        return "";
    }


    //Methode um alle abgespeicherten Member Objekte zu printen
    public void dump() {

    }


    //Methode gibt Anzahl der gespeicherten Member Objekte zurück
    public int size() {

        return -1;
    }

}
