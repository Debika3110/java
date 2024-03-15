public class scrchstring {
    public static void main(String[] args) {
        String name = "Debika";
        char target = 'b';
        System.out.print(search(name, target));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}






