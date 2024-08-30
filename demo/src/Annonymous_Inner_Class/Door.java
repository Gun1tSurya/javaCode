package Annonymous_Inner_Class;

/*
    Advantages of inner class:-
    Inner class could be used only by outer class.
    Inner object is easily available inside outer object.
 */

abstract class Lock{
    public abstract boolean isUnlocked(String key);
    public void test(){
        System.out.println("Inside test method");
    }
}

public class Door {
    Lock lock = new Lock() {
        @Override
        public boolean isUnlocked(String key) {
            if(key.equals("qwerty")){
                return true;
            }else{
                return false;
            }
        }
    };
    public Lock getLock(){
        return lock;
    }

}
