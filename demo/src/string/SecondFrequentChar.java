package string;

public class SecondFrequentChar {

    static final int NOOFCHAR = 118;
    public static void main(String[] args) {

        String str = "Successes";
        char res = getSeccondChar(str);
        if(res != '\0')
            System.out.println("Second most frequent char in string is " + res);
        else
            System.out.println("No most second char was found");
    }

    static char getSeccondChar(String str) {
    int[] ctr = new int[NOOFCHAR];
    for(int i=0;i<str.length();i++)
        ctr[(str.charAt(i))] ++;
    int ctr_first = 0, ctr_second = 0;
    for(int i=0;i<NOOFCHAR;i++){
        if(ctr[i]>ctr_first){
            ctr_second = ctr_first;
            ctr_first = i;
        }else if(ctr[i]>ctr_second && ctr[i] != ctr_first){
            ctr_second = i;
        }
    }

    return (char) ctr_second;
    }
}
