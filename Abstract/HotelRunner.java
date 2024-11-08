package com.xworkz.abstRunner;

import com.xworkz.abst.AshokaHotel;
import com.xworkz.abst.LeelaHotel;

public class HotelRunner {
    public static void main(String[] args) {
        AshokaHotel ashokaHotel=new AshokaHotel();
        ashokaHotel.service();
        ashokaHotel.advanceBooking();
        ashokaHotel.portableRoom();

        LeelaHotel leelaHotel=new LeelaHotel();
        leelaHotel.advanceBooking();
        leelaHotel.service();
        leelaHotel.portableRoom();
    }
}
