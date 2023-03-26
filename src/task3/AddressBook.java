package task3;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "addresses")
public class AddressBook {
    private List<Address> addresses;

    public AddressBook() {
        this.addresses = new ArrayList<>();
    }

    @XmlElement(name = "address")
    public List<Address> getAddresses() {
        return this.addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "addresses=" + addresses +
                '}';
    }
}
