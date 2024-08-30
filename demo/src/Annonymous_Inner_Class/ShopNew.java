package Annonymous_Inner_Class;

public class ShopNew {
    public static void main(String[] args) {
        Door door = new Door();
        if(door.getLock().isUnlocked(args[0])){
            System.out.println("Door is unlock now!!!You can enter");
        }else {
            System.out.println("Off!! Door is still lock");
        }
    }
}
