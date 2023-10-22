package com.ucp;

public class Estadio {
    String name;
    String ciudad;
    String pais;

        public Estadio(String name, String ciudad, String pais) {
        this.name = name;
        this.ciudad = ciudad;
        this.pais = pais;
        }

        public String getCiudad() {
            return ciudad;
        }
        public String getName() {
            return name;
        }
        public String getPais() {
            return pais;
        }

        public String toString(){
           return getName() +", "+ getCiudad()+" ("+getPais()+")";
        }




}
