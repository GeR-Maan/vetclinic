package com.clinic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Patients extends Options {

    private static final ArrayList<Integer> idPatients = new ArrayList<>();
    private static final ArrayList<String> dateRegistration = new ArrayList<>();

    public static String getPatients() {

        if (patients.isEmpty()) { //проверка на пустоту таблицы
            System.out.println("Таблица пуста, добавьте данные");
        } else {
            for (int i = 0; i < idPatients.size(); i++) {
                System.out.print("Id: " + idPatients.get(i) + '\t'); // Id питомца
                System.out.print("Кличка: " + patients.get(i) + '\t'); // кличка питомца
                System.out.println("Дата регистрации: " + dateRegistration.get(i));
            }
        }
        return("Конец списка");
    }


    public static void addPatients() { //добавляем питомцы
        System.out.print("Введите кличку: ");
        String name = in.nextLine();
        getDate();
        patients.add(name);
        int id = patients.size();
        idPatients.add(id - 1);
        dateRegistration.add(getDate());
        System.out.println("Питомец добавлен");
    }


    public static void removePatients() {
        getPatients();
        System.out.print("Введите Id питомца: ");
        int number = in.nextInt();
        if(number + 1 > idPatients.size()) {
            System.out.println("Такого Id'а нет в списке");
        } else {
            System.out.println("Питомец удалён");
            idPatients.remove(number);
            patients.remove(number);
            dateRegistration.remove(number);
            for(int i = number; i < idPatients.size(); i++ ) {
                idPatients.set(i, idPatients.get(i) - 1);
            }
        }
    }


    public static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
