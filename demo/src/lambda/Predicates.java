package lambda;

//Assignment target for lambda expression double predicate,long etc. it will return boolean value.


import java.util.function.IntPredicate;

public class Predicates {
    public static void main(String[] args) {
        /*IntPredicate lessthan18 = new IntPredicate() {
            @Override
            public boolean test(int value) {
                if(value < 18){
                    return true;
                }else {
                    return false;
                }
            }
        };*/

        IntPredicate lessthan18 = i -> i < 18;
        IntPredicate Morethan10 = i -> i > 10;
        //System.out.println(lessthan18.and(Morethan10).test(13)); // in-build method and(), or()
        new Predicates().demo(14, lessthan18, Morethan10);
    }

    public void demo(int x, IntPredicate lessthan18, IntPredicate Morethan10){
        if(lessthan18.and(Morethan10).test(x)){
            System.out.println("The input is less than 18 and greter than 10");
        }else{
            System.out.println("Invalid input");
        }
    }

}
