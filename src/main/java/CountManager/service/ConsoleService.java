package CountManager.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleService {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return READER.readLine();
    }

    public static Integer readInteger() throws IOException {
        return Integer.parseInt(READER.readLine());
    }
}
