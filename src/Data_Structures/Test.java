package Data_Structures;

public class Test {

    static void function1(){
        function2();
    }

    static void function2(){
        function3();
    }

    static void function3(){
        System.out.print("Hello");
    }

    public static void main(String[] args) {
        function1();
        System.out.print("Hi");
    }
}
