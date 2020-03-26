package CountManager.service;

import CountManager.constants.MessageConstants;

import java.io.IOException;

import static CountManager.constants.MessageConstants.*;
import static CountManager.service.ConsoleService.readInteger;
import static CountManager.service.ConsoleService.writeMessage;

public class MessageService {

    public static void printMainMenuMessage() {
        writeMessage(MAIN_MENU_MSG);
        writeMessage("\n");
    }


    public static void printWelcomeMessage() {
        writeMessage(WELCOME_MSG);
        writeMessage("\n");
    }

    public static void printAuthPromptMessage() {
        writeMessage(AUTH_PROMPT_MSG);
        writeMessage("\n");
    }

    public static void printWrongInputMessage() {
        writeMessage(WRONG_INPUT_MSG);
        writeMessage("\n");
    }

    public static void printWrongOptionMessage() {
        writeMessage(WRONG_OPTION_MSG);
        writeMessage("\n");
    }

    private static void greetingScreen() throws IOException {

        printAuthPromptMessage();
        int answer = readInteger();

        switch (answer) {
            case 0: {
                break;
            }
            case 1: {
//               AuthService.login(new User()));
                writeMessage("Log in successful!");
                writeMessage("\n");
                break;
            }
            case 2: {
//               AuthService.signUp(User user)
                writeMessage("Sign up successful! Now log in using these credentials");
                writeMessage("\n");
                greetingScreen();
//               AuthService.login(new User());
                break;
            }
            default: {
                printWrongOptionMessage();
                greetingScreen();
            }
        }
    }

    private static void mainMenu() throws IOException {
        writeMessage(MAIN_MENU_MSG);

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
                printWrongOptionMessage();
                mainMenu();
            }
        }
    }

    //TODO: implement
    private static void workMenu(){}
}
