package personal.repository;

import java.util.List;
import personal.entity.Mahasiswa;

/**
 *
 * @author agus
 */
public interface MahasiswaRepository {

    void insert(Mahasiswa mahasiswa);

    void delete(int id);

    Mahasiswa cariMahasiswa(int id);

    List<Mahasiswa> dataMahasiswa();

    List<Mahasiswa> cariMahasiswa(String nrp);

}
