package CountManager;

import CountManager.domain.User;
import CountManager.service.AuthService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* В будущем можно добавить возможность переключения между модами:
   1. Видеть данные за последнюю неделю/месяц
   2. Видеть данные за последнюю рабочую неделю/месяц (начиная с воскресенья/1-го числа)
*/

/* Каждый день в календаре должен быть объектом, хранящим з/п, часы, надбавки
   Эти параметры нужно применять автоматически к разным типам дней (e.g.будний/выходной)
   или вручную (навигация по календарю с возможностью ручной замены параметров)
 */

/*
   Написать класс со статическими методами визуального оформления (может даже псевдографика)
 */


public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Нужно сделать статическое поле answer, но я пока не могу
    // придумать как сравнивать его с 0 на протяжении программы (кроме тупой проверки)
    // +нужно додуматься как его использовать в while

    public static void main(String[] args) {
        try {
//            AuthService.login();        // еще не разобрался почему signUp и login имеют именно такие сигнатуры
            greetingScreen();
            mainMenu();

        } catch (Exception e) {
                System.out.println("Incorrect input. Please, use digits to navigate");
        }
/*
        finally {
            try {
                Main.reader.close();
            } catch (IOException e) {}
        }
*/

    }

    private static void greetingScreen() throws IOException {

        System.out.println("***Welcome to CountingManager v2.0!***");
        System.out.println("Please type according digits for navigation");
        System.out.println();
        System.out.println("Do you already have an account?");
        System.out.println("1.Yes, login me in   2.No, sign me up   0.Exit");
        int answer = Integer.parseInt(reader.readLine());
        System.out.println();

           /*
                switch (answer) {
             case 1: {
                 AuthService.login(User user);
                 break;
             }
             case 2: {
                 AuthService.signUp(User user)
                 break;
             }
             case 0: exitMain();            // Останавливает приложение полностью (закрыть ридер)
             default: {
                 System.out.println("Incorrect Input. Please, try again");
             }
        }
        */

    }

    private static void mainMenu() throws IOException {
        System.out.println("*** Main Menu ***");
        System.out.println("1.Add New Work");
        System.out.println("2.See Recorded Work");
        System.out.println("3.Payment Details Setup");
        System.out.println("4.Calculate Revenue");
        System.out.println("0.Previous menu");

        switch (Integer.parseInt(reader.readLine())) {
            case 1: {
                // Calendarная хрень
                // Научиться хранить объекты (e.g. записывать их файлы и как удобнее это организовать)
                break;
            }
            case 2: {
                // Пользуясь коллекциями вывести данные из хранилища программы
                // workMenu();
                break;
            }
            case 3: {
                // Позволяет ввести расчётные константы (з/п, налог, доплата)
                // Константы должны быть общие для проекта (будут использованы в calc.IncomeCount)
                // Применить для: выходных/будних
                break;
            }
            case 4: {
                // Предлагает провести расчет для недели/месяца и тд.
                // Использует countIncome(); сорри за херовое название класса & метода
                break;
            }
//            case 0: greetingScreen();
            default: {
                System.out.println("Invalid Input.");
                mainMenu();
            }
        }
    }
    private static void workMenu(){}

}
