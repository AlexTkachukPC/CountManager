package CountManager;

import CountManager.service.ConsoleService;

import java.io.IOException;

import static CountManager.constants.MessageConstants.*;
import static CountManager.service.ConsoleService.readInteger;
import static CountManager.service.ConsoleService.writeMessage;
import static CountManager.service.MessageService.*;

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
        // вот тут смотри, это бесконечный цикл тут просто когда будет выбран exit, просто пишем прощание и  делаем break и все программа закончилась.
        // Если exit когда пользователь выходит из аккаунта, то просто выходим опять в меню signUp и LogIn
        while (true) {


        }
    }
}
