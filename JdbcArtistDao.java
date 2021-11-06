public class JdbcArtistDao implements ArtistDao {
    JdbcManager db;

    public JdbcArtistDao() {
        //In the body of the classes constructor instantiate a new JdbcManager object.
        db = new JdbcManager();
    }

    @Override
    add(Artist entity) {
        //using the JdbcManager variable, write an SQL statement to insert a new Artist record
    }

    @Override
    list() {
        //using the JdbcManager variable, write an SQL statement to select all artist rows
    }
    
    @Override
    find(Long key) {
        //using the JdbcManager variable, write an SQL statement to select an artist by artist_id
    }

    @Override
    update(Artist entity) {
        //using the JdbcManager variable, write an SQL statement to update an artist record
    }

    @Override
    remove(Long key) {
        //using the JdbcManager variable, write an SQL statement to remove an artist record
    }
}
