package com.clinic;

import java.util.ArrayList;
import java.util.Scanner;

public class Options {

    protected static final ArrayList<String> patients = new ArrayList<>();
    protected static final ArrayList<String> doctors = new ArrayList<>();

    protected static Scanner in = new Scanner(System.in);

    public Options(){

        System.out.println("Вызовите меню с помощью команды 'menu' и введите вариант меню.");

        chooseOptions();

    }

    public void chooseOptions(){


        System.out.println("Опция меню: ");
        String option = in.nextLine();
        switch (option){

            case ("menu") -> {
                menu() ;
                chooseOptions();
            }
            case ("1") -> {
                 Doctors.getDoctors();
                chooseOptions();
            }
            case ("2") -> {
                Doctors.addDoctors();
                chooseOptions();
            }
            case ("3") -> {
                Doctors.removeDoctors();
                chooseOptions();
            }
            case ("4") -> {
                Patients.getPatients();
                chooseOptions();
            }
            case ("5") -> {
                Patients.addPatients();
                chooseOptions();
            }
            case ("6") -> {
                Patients.removePatients();
                chooseOptions();
            }

            case ("7")-> {
                Appointments.getAppointments();
                chooseOptions();
            }
            case ("8")-> {

                Appointments.setAppointments();
                chooseOptions();
            }
            case ("9")-> {
                Appointments.changeAppointments();
                chooseOptions();
            }
            case ("10")-> {
                Appointments.removeAppointments();
                chooseOptions();
            }
            case ("exit") -> {
                System.out.println("Выход из программы...");
                System.exit(0);
            }
            default -> {
                System.out.println("Неверный пункт меню!");
                chooseOptions();
            }
        }


    }

    public void menu(){

        System.out.println("""
                Для просмотра списка докторов введите 1
                Для добавления доктора введите 2
                Для удаления доктора введите 3
                ----------------------------------------
                Для просмотра списка пациентов введите 4
                Для добавления пациента введите 5
                Для удаления пациента введите 6
                -----------------------------------------
                Для обзора всех приёмов введите 7
                Для добавления приёма введите 8
                Для изменения статуса приёма введите 9
                Для удаления приёма введите 10
                Для выхода введите 'exit'""");

    }

}
