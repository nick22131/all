package spring_boot_ex7_jpa_shreyansh.spring_boot_ex7_jpa_shreyansh.model;

public class User {
    private int userId;
    private String userName;
    private int age;

    // Getters and Setters
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
