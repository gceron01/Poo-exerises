package org.unicomfacauca.poo.perro;

public class principal {
    public static void main(String[] args) {

        Perro perro_uno = new Perro (2,"Pastor",20);
        System.out.println(perro_uno.raza);
        Perro perro_dos = new Perro (265,"Doberman",100000);
        System.out.println(perro_dos.raza);
        Perro perro_tres = new Perro();
        System.out.println(perro_tres.raza);
        perro_uno.correr();
        perro_dos.correr();
        perro_tres.correr();


    }
}
