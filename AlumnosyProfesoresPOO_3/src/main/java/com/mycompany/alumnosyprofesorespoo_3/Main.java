/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnosyprofesorespoo_3;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
        Aula aula = new Aula();

        if (aula.darClase()) {
            aula.notas();
        }
    }

}
