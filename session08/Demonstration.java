package session08;

class ClassEx3 {
    public int i;

    public ClassEx3(int i) {
        this.i = i;
    }
}

class Demonstration3 {
    public static void main(String[] args) {
        System.out.println("***Demonstration-3.A class demo with 2 objects***");
        ClassEx3 obA = new ClassEx3(10);
        ClassEx3 obB = new ClassEx3(20);
        System.out.println("obA.i =" + obA.i);
        System.out.println("obB.i =" + obB.i);
    }
}