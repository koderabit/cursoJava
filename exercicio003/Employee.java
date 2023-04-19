package exercicio003;

public abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String first, String last, String ssn){
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    }

    public void setFirstName(String first){
        if(!first.isEmpty()){
            firstName= first;
        }
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String last){
        if(!last.isEmpty()){
            lastName= last;
        }
    }
    public String getlastName(){
        return lastName;
    }

    public void setSocialSecurityNumber(String ssn){
        if(!ssn.isEmpty()){
            socialSecurityNumber = ssn;
        }
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    @Override
    public String toString(){
        return String.format("%s %s\nSocial Security Number: %s", getFirstName(), getlastName(), getSocialSecurityNumber());
    }
}
