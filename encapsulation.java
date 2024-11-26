 class encap{
    private String name = "Hasan";
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        encap ob = new encap();
        ob.setName("Siam");
        System.out.println(ob.getName());
    }
}
