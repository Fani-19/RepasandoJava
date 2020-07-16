package com.company;

import com.company.modelos.Alumno;

import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import java.util.Date;

public class Main {

    public static void main(String[] args) {
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = objSDF.parse("24-08-1985");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Alumno alumno = new Alumno("Iria ", "Vieiro Fernandez", fechaNacimiento, "32658461K");
        System.out.println(alumno.toString());
        System.out.println("La edad de " + alumno.getNombre() + "es: " +alumno.getEdad());
    }

    }
