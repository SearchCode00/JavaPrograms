public class Person {
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void getFirstName(){
        return firstName;
    }

    public void getLastName(){
        return lastName;
    }
    
    public void sayHello() {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
