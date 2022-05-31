package Dan30_05;

public class InstagramUser {
    private String username;
    private String imePrezime;
    private String email;

    public InstagramUser() {
    }

    public InstagramUser(String username, String imePrezime, String email) {
        this.username = username;
        this.imePrezime = imePrezime;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void stampaj() {
        System.out.println("User: " + this.username + " Ime: " + this.imePrezime + " Email: " + this.email);

    }
}
