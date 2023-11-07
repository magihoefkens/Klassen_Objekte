package org.example;

public class Auto {


        public String marke;
        public int baujahr;
        public String model;
        public String farbe;
        public int leistung;
        public int geschwindigkeit;

        public int getBaujahr() {
            return baujahr;
        }

        public Auto() {
        }

        public Auto(int geschwindigkeit) {
            this.geschwindigkeit=geschwindigkeit;
        }
        public int incrementGeschwindigkeit(int geschwindigkeit){
            return this.geschwindigkeit+=geschwindigkeit;

        }
    }

