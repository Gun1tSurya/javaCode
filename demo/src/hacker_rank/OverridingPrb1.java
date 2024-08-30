package hacker_rank;

/*
Sample Input:-

Sample Output:-

Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class

 */


class Sports{

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports {

    int n = 11;
    @Override
    String getName() {
        return "Soccer Class";
    }

    void getNumberOfTeamMembers(){
        System.out.println("Each team has "+ n +" players in " + getName());
    }

}

public class OverridingPrb1 {
    public static void main(String[] args) {
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}
