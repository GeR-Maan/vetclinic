package com.clinic;

public class Doctors extends Options {


    public static String getDoctors() { //вывод докторов
        if (doctors.isEmpty()) { //проверка на пустоту таблицы
            System.out.println("Таблица пуста, добавьте данные");
        } else {
            for (String doctor : doctors) {
                System.out.print(" ФИО: " + doctor + "\n");
            }
        }
        return("Конец списка");
    }

    public static void addDoctors() { //добавление докторов
        System.out.print("Напишите ФИО врача для добавления: ");
        String name = in.nextLine();
        doctors.add(name);
        System.out.println("Доктор добавлен");
    }


    public static void removeDoctors() { //удаление докторов
        boolean isNameRight = false;
        if (doctors.isEmpty()) { //проверка на пустоту таблицы
            System.out.println("Таблица пуста, добавьте данные");
        } else {
            getDoctors();
            System.out.print("Напишите фио доктора, которого хотите удалить: ");
            String name = in.nextLine();
            for (String doctor : doctors) {   //решил удалять по полному имени, если не делать id докторов
                if (name.equals(doctor)){
                    isNameRight = true;
                }
            }

            if(!isNameRight){
                System.out.println("Вы ввели неправильное ФИО");
            } else {
                doctors.remove(name);
                System.out.println("Вы удалили доктора ");
            }
        }
    }

}
