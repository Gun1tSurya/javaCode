package interfacecode;

public class Redmi implements phone {
    @Override
    public String Processor() {
        return "64-bit processor";
    }

    @Override
    public String OS() {
        return "Android";
    }

    @Override
    public int SpaceInGB() {
        return 64;
    }
}
