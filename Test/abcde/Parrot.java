// File: Parrot.java
package abcde;

class Parrot extends Bird {
    @Override
    public void fly() {
        // Parrot-specific flight code.
    }

    static int getRefCount() {
        return referenceCount;
    }
}