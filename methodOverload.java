class test {
    // overloading out methodOverload class with different parameters:
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    void add() {
        System.out.println("No parameter");
    }
}

public class methodOverload {
   // overloading in methodOverload class with different parameters:
    
        void main() {
            System.out.println("Inner Main class");
        }

        int main(int a) {
            return a;
        }

        int main(int a, int b) {
            return a + b;
        }

        String main(String a, String b) {
            return a + b;
        }
    

    public static void main(String[] args) {
        test ob = new test();
        ob.add(10, 20);
        ob.add(10.5, 20.5);
        ob.add();

        System.out.println("Inner Main Overloading: \n");

        methodOverload ob2 = new methodOverload();
        ob2.main();
        System.out.println(ob2.main(10));
        System.out.println(ob2.main(10, 20));
        System.out.println(ob2.main("Hello", " World"));
       
    }

}
