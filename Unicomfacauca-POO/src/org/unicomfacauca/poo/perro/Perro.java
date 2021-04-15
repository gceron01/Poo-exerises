package org.unicomfacauca.poo.perro;

public class Perro {
//Declaracion de atributos
    int id;
    String raza;
    int precio;

    //Metodo constructor

    public Perro (){
        id = 4;
        raza = "Pincher";
        precio = 200000;
    }

   public Perro (int id,String raza, int precio){
        this.id = id;
        this.raza = raza;
        this.precio = precio;
    }


//Crear un metodo
        public void correr() {

        System.out.println("perro corriendo...");


    }


}
