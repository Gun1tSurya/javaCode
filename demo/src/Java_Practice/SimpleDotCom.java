package Java_Practice;

public class SimpleDotCom {
    int numberOfHits = 0;
    int[] locationCells;
    String result;

    public void setLocation(int[] locations) {
        locationCells = locations;
    }

    public void checkYourself(String guessNo) {
        int guess = Integer.parseInt(guessNo);

        for(int cells:locationCells){
            if(cells == guess){
                result = "hit";
                numberOfHits++;
                break;
            }
            else {
                result = "miss";
            }
        }
        if(numberOfHits == locationCells.length){
            result = "kill";
            System.out.println(result);

        }
    }
}
