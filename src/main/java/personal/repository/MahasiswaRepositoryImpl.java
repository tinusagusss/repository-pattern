package personal.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import personal.controller.ConnectionManager;
import personal.entity.Mahasiswa;

/**
 *
 * @author agus
 */
public class MahasiswaRepositoryImpl implements MahasiswaRepository {

    ConnectionManager connectionManager = new ConnectionManager();

    @Override
    public void insert(Mahasiswa mahasiswa) {
        try ( Connection connection = connectionManager.getConnection();) {

            String query = "INSERT INTO Mahasiswa(nrp, nama) VALUES(?,?)";
            try ( PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
                statement.setString(1, mahasiswa.getNrp());
                statement.setString(2, mahasiswa.getNama());
                statement.executeUpdate();

                try ( ResultSet resultSet = statement.getGeneratedKeys()) {
                    if (resultSet.next()) {
                        mahasiswa.setId(resultSet.getInt(1));
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void update(Mahasiswa mahasiswa) {
        try ( Connection connection = connectionManager.getConnection();) {

            String query = "UPDATE Mahasiswa SET nrp = ?, nama = ? WHERE ID = ?";
            try ( PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, mahasiswa.getNrp());
                statement.setString(2, mahasiswa.getNama());
                statement.setInt(3, mahasiswa.getId());
                statement.executeUpdate();

            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public List<Mahasiswa> dataMahasiswa() {
        try ( Connection connection = connectionManager.getConnection()) {

            String query = "SELECT * FROM Mahasiswa";
            try ( Statement statement = connection.createStatement()) {

                try ( ResultSet resultSet = statement.executeQuery(query)) {
                    List<Mahasiswa> mahasiswas = new ArrayList<>();

                    while (resultSet.next()) {
                        mahasiswas.add(new Mahasiswa(
                                resultSet.getInt("id"),
                                resultSet.getString("nrp"),
                                resultSet.getString("nama")));
                    }
                    return mahasiswas;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Mahasiswa cariMahasiswa(int id) {
        try ( Connection connection = connectionManager.getConnection()) {

            String query = "SELECT * FROM Mahasiswa WHERE id = ?";
            try ( PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id);

                try ( ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return new Mahasiswa(
                                resultSet.getInt("id"),
                                resultSet.getString("nrp"),
                                resultSet.getString("nama"));
                    } else {
                        return null;
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Mahasiswa> cariMahasiswa(String nrp) {
        try ( Connection connection = connectionManager.getConnection()) {
            String query = "SELECT * FROM Mahasiswa WHERE nrp = ?";

            try ( PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, nrp);

                try ( ResultSet resultSet = statement.executeQuery()) {
                    List<Mahasiswa> mahasiswas = new ArrayList<>();

                    while (resultSet.next()) {
                        mahasiswas.add(new Mahasiswa(
                                resultSet.getInt("id"),
                                resultSet.getString("nrp"),
                                resultSet.getString("nama")));
                    }
                    return mahasiswas;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try ( Connection connection = connectionManager.getConnection()) {
            String query = "DELETE FROM Mahasiswa WHERE id = ?";

            try ( PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
