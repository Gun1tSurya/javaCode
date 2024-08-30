package interfacecode;

public class OnePlus implements phone {
    @Override
    public String Processor() {
        return "64bit processor";
    }

    @Override
    public String OS() {
        return "Android";
    }

    @Override
    public int SpaceInGB() {
        return 128;
    }
}
