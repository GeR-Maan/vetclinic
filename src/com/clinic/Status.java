package com.clinic;

import java.util.ArrayList;
import java.util.Scanner;

public class Status extends Appointments{

    protected static Scanner s = new Scanner(System.in);
    private static final ArrayList<Integer> idStatus = new ArrayList<>();
    private static final ArrayList<String> typeStatus = new ArrayList<>();

    private static void setStatus() {
        typeStatus.add("Новый");
        typeStatus.add("В процессе");
        typeStatus.add("Отменён");
        typeStatus.add("Ожидает оплаты");
        typeStatus.add("Завершён");
        for(int i = 0; i < typeStatus.size(); i++){
            idStatus.add(i);
        }
    }


    private static String getStatus() {
        if(idStatus.isEmpty()) {
            setStatus();
            for (int i = 0; i < idStatus.size(); i++) {
                System.out.print("ID статуса: " + idStatus.get(i));
                System.out.println(" Тип статуса: " + typeStatus.get(i));
            }
        } else {
            for (int i = 0; i < idStatus.size(); i++) {
                System.out.print("ID статуса: " + idStatus.get(i));
                System.out.print(" Тип статуса: " + typeStatus.get(i) + "\n");
            }
        }
        return("Конец");
    }

    public static void choiceStatus() {
        getStatus();
        System.out.print("Введите Id статуса для выбора: ");
        int number = s.nextInt();
        if(number + 1 > typeStatus.size()){
            System.out.println("Id статуса не найден");
        } else {
            status.set(id, typeStatus.get(number));
        }
    }

}