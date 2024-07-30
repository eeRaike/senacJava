
package aula18_desafio.Util;

public class Users {
        private String name;
        private String userName;
        private String password;

    public Users() {
    }

    public Users(String name, String UserName, String password) {
        this.name = name;
        this.userName = UserName;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String UserName) {
        this.userName = UserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
        
}
