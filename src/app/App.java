package app;

import bo.Eleve;
import util.GestionEleve;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Eleve> eleves = GestionEleve.mockupEleve();
        GestionEleve.fillNotes(eleves);

        eleves.stream()
                .forEach(e-> System.out.println(e.getNotes()));

        eleves.stream()
                .forEach(System.out::println);


        DoubleSummaryStatistics moyenneClasse =
                eleves.stream()
                        .mapToDouble(e -> e.getMoyenne())
                        .summaryStatistics();

        IntSummaryStatistics minClasse =
                eleves.stream()
                        .mapToInt(e->e.getNoteMin())
                        .summaryStatistics();
        IntSummaryStatistics maxClasse =
                eleves.stream()
                        .mapToInt(e->e.getNoteMax())
                        .summaryStatistics();

        System.out.println("La moyenne de la classe : "+moyenneClasse.getAverage());
        System.out.println("La note min de la classe : "+minClasse.getMin());
        System.out.println("La note max de la classe : "+maxClasse.getMax());
    }
}
