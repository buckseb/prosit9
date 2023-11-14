import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    private  List<Employe> listeEmployes;

    public SocieteArrayList() {
        this.listeEmployes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : listeEmployes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return listeEmployes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : listeEmployes) {
            System.out.println(employe.toString());
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes); // Utilise la méthode compareTo de la classe Employe
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(listeEmployes, Comparator.comparing(Employe::getNomDepartement).thenComparing(Employe::getGrade).thenComparing(Employe::getNom));
    }

    @Override
    public List<Employe> getListeEmployes() {
        return listeEmployes;
    }
}
