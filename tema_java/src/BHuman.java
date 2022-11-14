public class BHuman implements IHuman, Comparable<BHuman> {

    protected String nume;
    protected String prenume;
    protected String facultate;
    protected int varsta;

    public BHuman(String nume, String prenume, String facultate, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.facultate = facultate;
        this.varsta = varsta;
    }

    @Override
    public void greeting() {;}
    @Override
    public void doWork() {;}

    @Override
    public int compareTo(BHuman o) {
        return this.varsta-o.varsta;
    }
    @Override
    public String toString() {
        return "Nume "+this.nume+" "+this.prenume+", Fac. "+this.facultate+
                ", Varsta "+this.varsta;
    }
}
