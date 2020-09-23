/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchstring;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    public void run(){
        System.out.println("--- Поиск в строке ---");
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Введите строку: ");
        String searchStr = scanner.nextLine();
        int i = str.indexOf(searchStr);
        StringBuilder sbStr = new StringBuilder(str);
        System.out.println("Искомая строка начинается на %d позиции%n, i");
        System.out.println("Задачи:");
        System.out.println("0. Выйти из программы");
        System.out.println("1. Удалить искомую строку из исходной строки");
        System.out.println("2. Заменить искомую строку на другую");
        System.out.println("3. Удалить все теги из html документа");
        System.out.println("4. Удалить конкретный тег из html документа");
        System.out.println("Выбеите задачу");
        String task = scanner.nextLine();
        switch (task) {
            case "0":
                    System.out.println("Выбрана задача 0");
                break;
            case "1":
                    System.out.println("Выбрана задача 1. Удалить искомую строку из исходной строки");
                //находим индех вхождения строки.
                int startIndex = str.indexOf(searchStr);
                // находим index окончания строки
                int endIndex = startIndex + searchStr.length();
                sbStr.delete(startIndex, endIndex);
                    System.out.println("Результат: ");
                    System.out.println(sbStr.toString());
                break;
            case "2":
                    System.out.println("Выбрана задача 2");
            case "3":
                    System.out.println("Выбрана задача 3");
            case "4":
                    System.out.println("Выбрана задача 4");
                    
                    break;
                    
                   
        }
        System.out.println("--- конец программы ---");
    }
    
}
