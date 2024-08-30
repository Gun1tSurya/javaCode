package hacker_rank;

public class SingletonPrb1 {

    public String str;
    private static SingletonPrb1 obj;
    SingletonPrb1(){

    }

  public static SingletonPrb1 getSingleInstance(){
      if (obj == null) {
          obj = new SingletonPrb1();
      }
      return obj;
    }


}
