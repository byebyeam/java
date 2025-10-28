package com.sibsutis.devices;
public class PersonalComputer() extends Devices {
    public PersonalComputer(int id, int price) {
        super(id, price, null);
    }
    public PersonalComputer(int id, int price, String ip) {
        super(id, price, ip);
    }
    
    public String getDeviceType() {
        return "Personal Computer";
    }
}

