public class Professor {
    private String firstName;
    private String lastName;
    private String email;
    private String field;
    public Professor(String firstName,String lastName,String email,String field){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.field=field;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setField(String field){
        this.field=field;
    }
    public String getField(){
        return field;
    }
}