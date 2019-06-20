package bo;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Eleve {
    private String nom;
    private List<Integer> notes;

    public Eleve(String nom, List<Integer> notes) {
        this.nom = nom;
        this.notes = notes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Integer> getNotes() {
        return notes.stream()
                .sorted(Comparator.comparing(Integer::intValue))
                .collect(Collectors.toList());
    }

    public void addNote(int i) {
        this.notes.add(i);
    }

    public int getNoteMin(){
        IntSummaryStatistics stats =
                        notes.stream()
                        .mapToInt(x -> x)
                        .summaryStatistics();
        return stats.getMin();
    }
    public int getNoteMax(){
        IntSummaryStatistics stats =
                notes.stream()
                        .mapToInt(x -> x)
                        .summaryStatistics();
        return stats.getMax();
    }

    public double getMoyenne(){
        IntSummaryStatistics stats =
                notes.stream()
                        .mapToInt(x -> x)
                        .summaryStatistics();
        return stats.getAverage();
    }

    @Override
    public String toString() {
        return getNom()+"| note min : "+getNoteMin()+" | note max :"+getNoteMax()+" | moyenne : "+getMoyenne();
    }
}
