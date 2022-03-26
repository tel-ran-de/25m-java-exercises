public class Person {

    private String personName;
    private Address address;

    public Person(String personName, Address address) {
        this.personName = personName;
        this.address = address;
    }

    public String getPersonName() {
        return personName;
    }

    public Address getAddress() {
        return address;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", address=" + address +
                '}';
    }
}
