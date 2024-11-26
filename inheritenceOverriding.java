class parent{
    parent(){
        System.out.println("Parent class constructor is called first");
    }
    void show(){
        System.out.println("Parent class");
    }
}
class child extends parent{
    void show(){
        System.out.println("Child class");
    }
}
// child ovverrides the parent's void show() method
public class inheritenceOverriding {

    public static void main(String[] args) {
        child ob = new child();
        ob.show();
    }
}
