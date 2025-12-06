public enum DBConfig {
    DRIVER("com.mysql.cj.jdbc.Driver"),
    URL("jdbc:mysql://localhost:3306/mydb01"),
    USER("root"),
    PASS("1515");

    private final String value ;
    DBConfig(String value ){
        this.value  = value;
    }

    public String getValue(){
        return value;
    }
}
