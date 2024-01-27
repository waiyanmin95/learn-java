package random.CaecerCipher;

public class simpleEncrypt {
    public static String ccEncrypt(String s, int shift) {
        StringBuilder es = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = (char) (s.charAt(i) + shift);
            es.append(c);
        }
        return es.toString();
    }

    public static void main(String[] args) {
        System.out.println(ccEncrypt("Hello World", 10));
    }
}
