package CountManager.constants;

public interface MessageConstants {
    String WELCOME_MSG = "***Welcome to CountingManager v2.0!***\n" +
                         "Please type according digits for navigation";

    String AUTH_PROMPT_MSG = "Do you already have an account?\n" +
                             "1.Yes, login me in\n" +
                             "2.No, sign me up\n" +
                             "0.Exit";

    String MAIN_MENU_MSG = "*** Main Menu ***\n" +
                           "1.Add New Work\n" +
                           "2.See Recorded Work\n" +
                           "3.Payment Details Setup\n" +
                           "4.Calculate Revenue\n" +
                           "0.Log out";

    String WRONG_INPUT_MSG = "Incorrect input. Please, use digits to navigate";
    String WRONG_OPTION_MSG = "Invalid Option. Please, try again";
}
