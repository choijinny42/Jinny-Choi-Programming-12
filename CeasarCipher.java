

public class CeasarCipher {
    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String plain, int shift) {
        plain = plain.toLowerCase();
        String encrypted = "";
        for(int i = 0; i < plain.length(); i++) {
            int mapping = alphabet.indexOf(plain.charAt(i));
            int encryptVal = (shift + mapping) % 26;
            char val = alphabet.charAt(encryptVal);
            encrypted = encrypted + val;

        }
        return encrypted;
    }

    public static String decrypt(String encrypted, int shift) {
        encrypted.toLowerCase();
        String plain = "";
        for(int i = 0; i < encrypted.length(); i++) {
            int mapping = alphabet.indexOf(encrypted.charAt(i));
            int decryptVal = (mapping - shift) % 26;
            if(decryptVal < 0) {
                decryptVal = alphabet.length() + decryptVal;
            }
            char val = alphabet.charAt(decryptVal);
            plain = plain + val;

        }
        return plain;
    }

    public static void main(String[] args) {
        System.out.println(encrypt("hello", 9));
        System.out.println(decrypt("qnuux", 9));
    }
}
