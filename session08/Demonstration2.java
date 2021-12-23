package session08;

//PRIVATE & PUBLIC
class Sample {
    // Public field
    public int pubInt = 1;

    // Public method
    public void showPublicMethod() {
        System.out.println("The showPublicMethod() is a public method.");
    }

    // Private field
    private int priInt = 2;

    public int getPriInt() {
        return priInt;
    }

    // Private method
    private void showPrivateMethod() {
        System.out.println("The showPrivateMethod() is a private method.");
    }
}

class Demonstration2 {
    public static void main(String[] args) {
        System.out.println("***Demonstration-2. Introducing access control using private and public modifiers.***\n");
        Sample sampleOb = new Sample();
        System.out.println("The pubInt=" + sampleOb.pubInt);// 1
        sampleOb.showPublicMethod();
        // Compile-time error
        System.out.println(" The priInt=" + sampleOb.getPriInt());
        // Compile-time error
        // sampleOb.showPrivateMethod() ;
    }
}