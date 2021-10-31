public class JdbcManager {
    private String jdbcUrl ="", jdbcUserName="", jdbcPassword="";
    private Connection conn;


    public void getConn() {
        try {
            conn = DriverManager.getConnection(jdbcUrl, jdbcUserName, jdbcPassword);
        } catch (Exception e) {

        }
    }
    public void closeConn() {
        try {
            conn.close();
        } catch (Exception e){

        }
    }
}
