public class book {
    String EnrolID, FirstName, LastName;
    Integer Age;

    //contructor
    public book(){

    }
    public book(String enrolID, String firstName, String lastName, Integer age) {
        EnrolID = enrolID;
        FirstName = firstName;
        LastName = lastName;
        Age = age;
    }

    //getter & setter
    public String getEnrolID() {
        return EnrolID;
    }

    public void setEnrolID(String enrolID) {
        EnrolID = enrolID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

}
