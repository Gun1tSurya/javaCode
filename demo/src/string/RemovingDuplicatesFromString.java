package string;

public class RemovingDuplicatesFromString {
    public static void main(String[] args) {
        String str = "W3cre sourceq";
        removeDuplicate(str);
        System.out.println("Original String " + str);
        System.out.println("Removing Duplicates from original String " + removeDuplicate(str));

    }

    private static String removeDuplicate(String str) {
        char[] ch =  str.toCharArray();
        String target = "";

        for(char value:ch){
            if(target.indexOf(value) == -1){
                target += value;
            }
        }
        return target;
    }
}
