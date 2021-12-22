package session05;

public class Array2D {
    public static void main(String[] args) {
        String[][] framework = { { "java", "kotlin" }, { "React", "Reactnative" }, { "Php", "Laravel" } };

        for (int i = 0; i < framework.length; i++) {
            System.out.println("bahasa : " + framework[i][0]);
            System.out.println("framework : " + framework[i][1]);
            System.out.println("--------------------------------");
        }
    }
}
