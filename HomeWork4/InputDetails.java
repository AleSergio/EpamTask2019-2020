package HomeWork4;

import HomeWork4.cargo.Cargo;
import HomeWork4.carrier.Carrier;
import HomeWork4.stroage.Storage;

public class InputDetails {

    public static void main(String[] args) {

        Cargo apple = new Cargo();
        apple.setName("apple");

        Cargo jeans = new Cargo();
        jeans.setName("jeans");

        Cargo tv = new Cargo();
        tv.setName("TV");

        Carrier company1 = new Carrier();
        company1.setName("company1");

        Carrier company2 = new Carrier();
        company2.setName("company2");

        Carrier company3 = new Carrier();
        company3.setName("company3");

        Storage.inputObject(apple);
        Storage.inputObject(jeans);
        Storage.inputObject(tv);
        Storage.inputObject(company1);
        Storage.inputObject(company2);
        Storage.inputObject(company3);

        Storage.outputCargo();
        Storage.outputCarrier();


    }
}