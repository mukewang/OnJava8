package housekeeping;

// Constructors have arguments

class Rock2 {
    Rock2(int i) { // This is the constructor
        System.out.print("Rock " + i + " ");
    }
}
public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++)
            new Rock2(i);
    }
}
