public class Student extends BHuman{

    private final int an;

    public Student(String nume, String prenume, String facultate, int varsta, int an) {
        super(nume,prenume,facultate,varsta);
        this.an=an;
    }

    public void greeting(){
        System.out.println("Student greeting\n");
    }
    public void doWork() {
        System.out.println("Student working\n");

    }

    @Override
    public String toString() {
        return "Studentul: "+this.nume+" "+this.prenume+", Din anul: "+this.an+", Facultatea "+this.facultate+
                ", Cu varsta: "+this.varsta;
    }

    public int compareTo(Student comp) {
        return this.varsta-comp.varsta;
    }
}
