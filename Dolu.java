class Dolu {
    double a= 2.5;
    int b;
    Dolu(int n){
        //LOI
        b=n;
        System.out.println("hi from Constructor");
    }
    {
        System.out.println("hello");
    }
    public void view(){
        System.out.println("hi from view");
    }
    {
        System.out.println("bye");
    }
    public static void main(String[] args) {
        Dolu d1 = new Dolu(10);
        System.out.println(d1.a);
        System.out.println(d1.b);
        d1.view();
    }
}
