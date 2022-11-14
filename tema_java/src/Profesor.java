public class Profesor extends BHuman {

    private final String materie;

    public Profesor(String nume, String prenume, String facultate, int varsta, String materie) {
        super(nume,prenume,facultate,varsta);
        this.materie=materie;
    }

    public void greeting(){
        System.out.println("Profesor greeting");
    }
    public void doWork() {
        System.out.println("Profesor working");
    }

    @Override
    public String toString() {
        return "Profesorul "+this.nume+" "+this.prenume+", Facultatea "+this.facultate+
                ", cu varsta "+this.varsta+", de la Materia "+this.materie;
    }

    public int compareTo(Profesor comp) {
        return this.varsta-comp.varsta;
    }
}
