package src.test;

/**
 * @author hly
 * @Description: TODO
 * @create 2021-10-12 15:50
 */
public class User {
    private String username;

    private String gender;

    public void setUsername(String name){
        username = name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getUsername(){
        return username;
    }

    public String getGender(){
        return gender;
    }
}
