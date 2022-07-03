package com.clinic;


import java.util.ArrayList;

public class Appointments extends Options {

    protected static int id;
    private static final ArrayList<Integer> appointmentId = new ArrayList<>();
    private static final ArrayList<String> appointmentPatients = new ArrayList<>();
    private static final ArrayList<String> appointmentDoctors = new ArrayList<>();
    private static final ArrayList<String> time = new ArrayList<>();
    protected static final ArrayList<String> status = new ArrayList<>();

    public static void setAppointments() {
        System.out.println("Список питомцев: ");
        Patients.getPatients();
        System.out.print("Введите Id питомца: ");
        int number = in.nextInt();
        System.out.println("Список докторов: ");
        Doctors.getDoctors();
        System.out.print("Введите фио доктора: ");
        String name = in.nextLine();
        boolean isNameRight = false;
        for (String doctor : doctors) {
            if (name.equals(doctor)){
                isNameRight = true;
            }
        }
        System.out.print("Введите время приёма \"dd-MM HH:mm\": ");
        String timeDate = in.nextLine();
        timeDate = in.nextLine();
        if (number + 1 > patients.size()) {
            System.out.println("Такого питомца нет");
        } else if (!isNameRight) {
            System.out.println("Такого доктора нет");
        } else {
            appointmentPatients.add(Patients.patients.get(number));
            appointmentDoctors.add(Doctors.doctors.get(id));
            time.add(timeDate);
            status.add("Новый");
            int idAppointments = appointmentDoctors.size();
            appointmentId.add(idAppointments - 1);
            System.out.println("Приём добавлен");
        }
    }

    public static void changeAppointments() {
        getAppointments();
        System.out.print("Введите Id приёма: ");
        id = in.nextInt();
        if(id + 1 > appointmentId.size()){
            System.out.println("Id не найден");
        } else {
            System.out.println("Статус приёма: " + status.get(id));
            Status.choiceStatus();
        }
    }

    public static void removeAppointments() {
        getAppointments();
        System.out.print("Введите Id статуса: ");
        int number = in.nextInt();
        if (number + 1 > appointmentId.size()) {
            System.out.println("Id не найден");
        } else {
            System.out.println("Приём удалён");
            appointmentId.remove(number);
            appointmentPatients.remove(number);
            appointmentDoctors.remove(number);
            time.remove(number);
            status.remove(number);
            for (int i = number; i < appointmentId.size(); i++) {
                appointmentId.set(i, appointmentId.get(i) - 1);
            }
        }

    }

    public static String getAppointments() {
        if (appointmentDoctors.isEmpty()) {
            System.out.println("Таблица пуста, добавьте данные");
        } else {
            for (int i = 0; i < appointmentPatients.size(); i++) {
                System.out.print("ID приёма: " + appointmentId.get(i));
                System.out.print(" Питомец: " + appointmentPatients.get(i));
                System.out.print(" Доктор: " + appointmentDoctors.get(i));
                System.out.print(" Время приёма: " + time.get(i));
                System.out.println(" Статус: " + status.get(i));
            }
        }

        return("Конец");

    }


}
