package task3;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

// Створіть клас, використовуючи SAXParser, де опишіть ієрархію XML файлу.
// Необхідно, щоб проект створював XML-файл і будував дерево (місто, назва вулиці, будинок).
// У місті використовуйте аттрибут (наприклад, <city size=”big>Kiev</city>).

public class Task3 {
    public static void main(String[] args) throws SAXException, ParserConfigurationException, IOException {
        File file = new File("/home/nadia/IdeaProjects/AdvHomework7/src/task3/addresses.xml");
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
        AddressBookHandler handler = new AddressBookHandler();
        parser.parse(file, handler);
        AddressBook addressBook = handler.getAddressBook();
        addressBook.getAddresses().forEach(System.out::println);
    }
}
