public class Artist {
    private String firstName;
    private String lastName;
    private int id;

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getId() {return id;}

    public void setFirstName(String fn) {firstName = fn;}
    public void setLastName(String ln) {lastName = ln;}
    public void setId(int i) {id = i;}

    @Override
    public String toString() {
        return "Artist{artistId=%s, firstName=%s, lastName=%s}".formatted(id, firstName, lastName);
    }
}
