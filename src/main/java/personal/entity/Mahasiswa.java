package personal.entity;

/**
 *
 * @author agus
 */
public class Mahasiswa {

    private int id;
    private String nrp;
    private String nama;

    public Mahasiswa() {
    }

    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public Mahasiswa(int id, String nrp, String nama) {
        this.id = id;
        this.nrp = nrp;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}
