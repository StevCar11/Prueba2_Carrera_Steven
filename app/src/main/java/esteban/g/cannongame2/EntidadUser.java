package esteban.g.cannongame2;

public class EntidadUser {
    private String  name;
    private String  password;

    public EntidadUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public EntidadUser(){
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }






}
