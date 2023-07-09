public class Main {
    public static void main(String[] args) {

        String newText = Encrypter.Encrypt("Hello");
        System.out.printf("Text encrypted: %1$s" + "\r\n", newText);
        String TextDescripted = Encrypter.Decrypt(newText);
        System.out.printf("Text Decrypted: %1$s" + "\r\n", TextDescripted);

    }

}
