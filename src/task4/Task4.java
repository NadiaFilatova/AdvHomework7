package task4;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import task3.AddressBook;

import java.io.File;

//Використовуючи JAXB, виконати завдання №3.
public class Task4 {
    public static void main(String[] args) throws JAXBException {
        File file = new File("/home/nadia/IdeaProjects/AdvHomework7/src/task3/addresses.xml");
        JAXBContext context = JAXBContext.newInstance(AddressBook.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        AddressBook addressBook = (AddressBook) unmarshaller.unmarshal(file);
        addressBook.getAddresses().forEach(System.out::println);
    }
}
