public class Encrypter {
    public static String Encrypt(String text) {
        int letterInt = 0;
        char letter = ' ';
        String textEncripted = "";
        for (int i = 0; i < text.length(); i++) {
            letterInt = (int) text.charAt(i) + 1;
            letter = (char) letterInt;
            textEncripted += String.valueOf(letter);
        }
        return textEncripted;
    }

    public static String Decrypt(String text) {
        int letterInt = 0;
        char letter = ' ';
        String textDecripted = "";
        for (int i = 0; i < text.length(); i++) {
            letterInt = (int) text.charAt(i) - 1;
            letter = (char) letterInt;
            textDecripted += String.valueOf(letter);
        }
        return textDecripted;
    }
}
