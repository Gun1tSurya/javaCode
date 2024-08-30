package collection.list;

import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;




public class ListIteratorDemo {
    public static void main(String[] args) throws JAXBException, SAXException {
        List<Character> characterList = new ArrayList<>();
        characterList.add('N');
        characterList.add('I');
        characterList.add('E');
        characterList.add('R');
        characterList.add('N');

        characterList.subList(0,1).clear();
        ListIterator<Character> iterator = characterList.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
            iterator.set('3');
        }


        characterList.stream().forEach(s-> System.out.println(s));
    }
}
