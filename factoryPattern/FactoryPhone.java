package main.factoryPattern;

public class FactoryPhone {

    public Mobile makePhone(String phone) {

        Mobile mobile=null;
        switch(phone) {
        case Mobile.IPHONE :   mobile= new Iphone();break;
        case Mobile.SAMSUNG :  mobile= new Samsung();break;
        case Mobile.NOKIA : mobile= new Nokia();break;

        }

        return mobile;

    }
}
