package sources;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;

    public Student() {
        super();

    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public void setAnStudii(Integer anStudii) {
        this.anStudii = anStudii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{Elev");
        sb.append(super.toString());
        sb.append("Facultate=").append(facultate);
        sb.append("An studii=").append(anStudii);
        sb.append("}");
        return sb.toString();
    }

}
