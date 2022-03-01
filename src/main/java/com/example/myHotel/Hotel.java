package com.example.myHotel;

//import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private int hotelId;
        private String hotelName;
        private String address;

        public int getHotelId() {
                return hotelId;
        }

        public void setHotelId(int hotelId) {
                this.hotelId = hotelId;
        }

        public String getHotelName() {
                return hotelName;
        }

        public void setHotelName(String hotelName) {
                this.hotelName = hotelName;
        }

        public String getHotelAddress() { return address; }

        public void setHotelAddress(String address) {
                this.address = address;
        }
}
