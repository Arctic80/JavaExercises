import java.util.*;


public class Main {

    public static void main(String[] args) {
        char[] nomArray = {'D', 'a', 'v', 'i', 'd'};

        List<Character> nom = convertNameToList(nomArray);
        System.out.println(iteraNomList(nom));
        System.out.println(loadMap(nom));

        List<Character> apellido = new ArrayList<>(Arrays.asList('P', 'a', 'r', 'd', 'o'));

        System.out.println(joinFullName(nom, apellido));

    }

    private static List<Character> convertNameToList(char[] nombre) {
        List<Character> nomList = new ArrayList<>();

        for (char c : nombre) {
            nomList.add(c);
            System.out.print(c);
        }

        System.out.print("\n");

        return nomList;
    }

    private static String iteraNomList(List<Character> nombre) {
        StringBuilder strBuilder = new StringBuilder();

        List<Character> vocales = new ArrayList<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));

        for (Character c : nombre) {
            if (Character.isDigit(c)) {
                strBuilder.append("Els noms de persones no contenen números, ERROR \n");
                break;
            } else if (Character.isAlphabetic(c)) {
                if (vocales.contains(c)) strBuilder.append("VOCAL \n");
                else strBuilder.append("CONSONANT \n");
            } else {
                strBuilder.append("El nom conté un caràcter no vàlid, ERROR \n");
                break;
            }
        }

        return strBuilder.toString();
    }

    private static HashMap<Character, Integer> loadMap(List<Character> nomArray) {
        HashMap<Character, Integer> letrasMap = new HashMap<>();

        for (Character c : nomArray) {
            if (letrasMap.get(c) != null) letrasMap.put(c, letrasMap.get(c) + 1);
            else letrasMap.put(c, 1);
        }

        return letrasMap;
    }

    private static ArrayList<Character> joinFullName(List<Character> nombre, List<Character> apellido) {
        ArrayList<Character> fullname = new ArrayList<>();
        fullname.addAll(nombre);
        fullname.add(' ');
        fullname.addAll(apellido);

        return fullname;
    }
}