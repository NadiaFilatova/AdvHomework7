package task3;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "address")
public class Address {
    @XmlElementRef(name = "city")
    private City city;
    private String street;
    private String house;

    public Address() {
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    @XmlElement(name = "street")
    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    @XmlElement(name = "house")
    public void setHouse(String house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                '}';
    }

    @XmlRootElement(name = "city")
    public static class City {
        @XmlValue
        private String name;

        @XmlAttribute(name = "size")
        private String size;

        public City() {
        }

        public City(String name, String size) {
            this.name = name;
            this.size = size;
        }

        @Override
        public String toString() {
            return "City{" +
                    "name='" + name + '\'' +
                    ", size='" + size + '\'' +
                    '}';
        }
    }
}
