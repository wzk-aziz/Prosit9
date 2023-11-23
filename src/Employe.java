import java.util.Objects;
public class Employe implements Comparable<Employe>  {
    int id ;
    String nom;
    String prenom;
    int grade;

    public Employe(){
    }

    public Employe(int id, String nom, String prenom, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe employe)) return false;
        return id == employe.id && Objects.equals(nom, employe.nom);
    }

    @Override
    public String toString() {
        return "Employes{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", grade=" + grade +
                '}';
    }

    public void add(Employe employe) {
    }
    @Override
    public int compareTo(Employe autreEmploye) {
        // Comparaison par id
        return Integer.compare(this.id, autreEmploye.id);
    }
}
