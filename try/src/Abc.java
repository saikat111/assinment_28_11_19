package Mypack;
class A {
    String name;

    A(String name ){
        this.name = name;
    }

    void print(){
        System.out.println("hello");

    }
}
class Abc{
    public static void main(String args []){
        A a = new A("Saikat");
        a.print();
    }
}
