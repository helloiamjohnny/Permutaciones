public class Permutacion {

    public static void mostrarPermutacionesAsc(String s, StringBuffer aux) {
        if (s.length() < 3) {
            System.out.println(aux + "" + s.charAt(0) + "" + s.charAt(1));
            System.out.println(aux + "" + s.charAt(1) + "" + s.charAt(0));
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                aux.append(c);
                StringBuilder sb = new StringBuilder(s);
                sb.deleteCharAt(i);
                mostrarPermutacionesAsc(sb.toString(), aux);
                aux.deleteCharAt(aux.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        mostrarPermutacionesAsc("abcd", new StringBuffer(2));
    }
}