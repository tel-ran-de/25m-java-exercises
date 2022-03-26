import java.util.Arrays;

public class AddressGetter {

    private Person[]persons;

    public AddressGetter(Person[] persons) {
        this.persons = persons;
    }

    public Address[] getPersonsAddresses(){
        Address[]addresses=new Address[persons.length];

        for (int i=0;i<persons.length;i++){
            addresses[i]=persons[i].getAddress();
        }
        return addresses;
    }

    public Person[] getPersons() {
        return persons;
    }

    public String toString(){
        return Arrays.toString(getPersonsAddresses());
    }
}
