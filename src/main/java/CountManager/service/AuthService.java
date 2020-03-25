package CountManager.service;

import CountManager.domain.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class AuthService {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static boolean login(User user) throws IOException {
        // TODO поставб сюда путь своей папки data(которую я создал).
        // слева нажми на файл правой кнопкой выбери копи путь и выбери абсолют, а потом просто вставь в строку!
        File file = new File("" + user.getUsername() + ".json");
        if(file.exists()) {
            User userFromFile = MAPPER.readValue(file, User.class);
            return user.equals(userFromFile);
        }
        return false;
    }

    public static boolean signUp(User user) throws IOException {
        // TODO поставб сюда путь своей папки data(которую я создал).
        // слева нажми на файл правой кнопкой выбери копи путь и выбери абсолют, а потом просто вставь в строку!
        File file = new File("" + user.getUsername() + ".json");
        if(file.createNewFile()) {
            MAPPER.writeValue(file, user);
            return true;
        }
        return false;
    }
}
