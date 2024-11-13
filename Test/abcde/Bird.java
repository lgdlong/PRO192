package abcde;

public class Bird {
    protected static int referenceCount = 0;

    public Bird() {
        referenceCount++;
    }

    protected void fly() {
        // Flap wings, etc.
    }

    static int getRefCount() {
        return referenceCount;
    }
}
