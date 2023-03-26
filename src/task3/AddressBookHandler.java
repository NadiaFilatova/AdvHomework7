package task3;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class AddressBookHandler extends DefaultHandler {
    private static final String ADDRESSES = "addresses";
    private static final String ADDRESS = "address";
    private static final String CITY = "city";
    private static final String CITY_SIZE = "size";
    private static final String STREET = "street";
    private static final String HOUSE = "house";
    private AddressBook addressBook;
    private StringBuilder elementValue;
    private String citySize;

    @Override
    public void characters(char[] ch, int start, int length) {
        if (elementValue == null) {
            elementValue = new StringBuilder();
        } else {
            elementValue.append(ch, start, length);
        }
    }

    @Override
    public void startDocument() {
        this.addressBook = new AddressBook();
    }

    @Override
    public void startElement(String uri, String lName, String qName, Attributes attr) {
        switch (qName) {
            case ADDRESSES:
                this.addressBook.setAddresses(new ArrayList<>());
                break;
            case ADDRESS:
                this.addressBook.getAddresses().add(new Address());
                break;
            case CITY:
            case STREET:
            case HOUSE:
                elementValue = new StringBuilder();
                break;
        }
        this.citySize = attr.getValue(CITY_SIZE);
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        switch (qName) {
            case CITY:
                latestAddress().setCity(new Address.City(this.elementValue.toString(), this.citySize));
                break;
            case STREET:
                latestAddress().setStreet(this.elementValue.toString());
                break;
            case HOUSE:
                latestAddress().setHouse(this.elementValue.toString());
        }
        this.citySize = null;
    }

    private Address latestAddress() {
        List<Address> addresses = this.addressBook.getAddresses();
        int latestAddress = addresses.size() - 1;
        return addresses.get(latestAddress);
    }

    public AddressBook getAddressBook() {
        return this.addressBook;
    }
}
