package collection.set;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesUsing2Hashset {
    public static void main(String[] args) {

        String names[] = {
            new String("Shweta"),
            new String("Dada"),
            new String("bhu"),
            new String("Dada"),
                new String("Tai"),
                new String("bhu")
        };

        Set unique = new HashSet();
        Set dups = new HashSet();

        for(int i=0;i<names.length;i++)
            if(!unique.add(names[i]))
                dups.add(names[i]);



            unique.removeAll(dups);
        System.out.println("Unique words" + unique);
        System.out.println("Duplicates words "+dups);

    }
}
