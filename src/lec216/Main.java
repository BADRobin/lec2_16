package lec216;

public class Main {

    public static void main(String[] args) {
        String s = "asdadsa";
        print(s);
        print(new Object());
        print(null);
    }
    static void print (String s){
        System.out.println("string");
    }
    static void print(Object o){
        System.out.println("object");
    }
}
