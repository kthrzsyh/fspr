package session08;

class ClassEx4 {
    int i;

    ClassEx4() {
        this.i = 5;
    }

    public ClassEx4(int i) { // overloading : nama sama (di timpa), yg beda method signature nya
        // overload harus di kelas yang sama
        // overide signature sama
        this.i = i;
    }
}

class Demonstration4 {
    public static void main(String[] args) {
        System.out.println("***Demonstration-4. A simple class with 2 different constructors ***");
        System.out.println("*** It is also an example of constructor overloading ***");
        ClassEx4 obA = new ClassEx4();
        ClassEx4 obB = new ClassEx4(75);
        System.out.println("obA.i =" + obA.i);
        System.out.println("obB.i =" + obB.i);
    }
}