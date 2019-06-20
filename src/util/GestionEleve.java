package util;

import bo.Eleve;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GestionEleve {

    public static List<Eleve> mockupEleve(){
        List<Eleve> eleves = new ArrayList<>();
        eleves.add(new Eleve("Robin",new ArrayList<Integer>()));
        eleves.add(new Eleve("Rene",new ArrayList<Integer>()));
        eleves.add(new Eleve("Thierry",new ArrayList<Integer>()));
        eleves.add(new Eleve("Jean",new ArrayList<Integer>()));
        eleves.add(new Eleve("Adrien",new ArrayList<Integer>()));
        eleves.add(new Eleve("Arthur",new ArrayList<Integer>()));
        eleves.add(new Eleve("Pierre",new ArrayList<Integer>()));


        return eleves;
    }

    public static void fillNotes(List<Eleve> eleves){
        for(Eleve eleve : eleves){
            for (int i =0; i<10;i++){
                Random rNote = new Random();
                eleve.addNote(rNote.nextInt(20-2)+3);
            }
        }
    }
}
