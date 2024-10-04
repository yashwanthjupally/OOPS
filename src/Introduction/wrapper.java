package Introduction;

public class wrapper {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        Integer num = 45;

        swap(a,b);
        System.out.println(a+ " " +b);// doesnt swap. java is pass by value

    }

    static void swap (int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
