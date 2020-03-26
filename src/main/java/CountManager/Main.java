package CountManager;

import CountManager.domain.User;
import CountManager.service.AuthService;
import CountManager.service.ConsoleService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static CountManager.constants.MessageConstants.*;
import static CountManager.service.ConsoleService.readInteger;

/* В будущем можно добавить возможность переключения между модами:
   1. Видеть данные за последнюю неделю/месяц
   2. Видеть данные за последнюю рабочую неделю/месяц (начиная с воскресенья/1-го числа)
*/

/* Каждый день в календаре должен быть объектом, хранящим з/п, часы, надбавки
   Эти параметры нужно применять автоматически к разным типам дней (e.g.будний/выходной)
   или вручную (навигация по календарю с возможностью ручной замены параметров)
 */

//   Написать класс со статическими методами визуального оформления (может даже псевдографика)

/**
 * Assumes AuthService.login and AuthService.setUp are implemented correctly
*/
public class Main {
    private static boolean endOfProgram = false;


    // Нужно сделать статическое поле answer (или же использовать @endOfProgram для этого),
    // но я пока не могу придумать как сравнивать его с 0 на протяжении программы (кроме тупой проверки)
    // +нужно додуматься как его использовать в while

    public static void main(String[] args) {
        try {
//          AuthService.login(new User());        // еще не разобрался почему signUp и login имеют именно такие сигнатуры
            System.out.println(WELCOME_MSG);
            greetingScreen();
            if (!endOfProgram) mainMenu();

        } catch (Exception e) { System.out.println(WRONG_INPUT_MSG); }
    }

    private static void greetingScreen() throws IOException {

        System.out.println(AUTH_PROMPT_MSG);
        int answer = readInteger();

        switch (answer) {
             case 0: {
                 exitMain();
                 break;
             }
             case 1: {
//               AuthService.login(new User()));
                 System.out.println("Log in successful!");
                 System.out.println();
                 break;
             }
             case 2: {
//               AuthService.signUp(User user)
                 System.out.println("Sign up successful! Now log in using these credentials");
                 System.out.println();
                 greetingScreen();
//               AuthService.login(new User());
                 break;
             }
             default: {
                 System.out.println(WRONG_OPTION_MSG);
                 greetingScreen();
             }
        }
    }

    private static void mainMenu() throws IOException {
        System.out.println(MAIN_MENU_MSG);

        switch (readInteger()) {

            case 0: {
                greetingScreen();
                break;
            }
            case 1: {
                // Calendarная хрень @workMenu()
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
            default: {
                System.out.println(WRONG_OPTION_MSG);
                mainMenu();
            }
        }
    }

    //TODO: implement
    private static void workMenu(){}


//    Дает флаг о закрытии программы
    private static void exitMain(){
        endOfProgram = true;
    }
}
