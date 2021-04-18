package other;

// TRY AND DO THIS AGAIN BUT ROTE

class A{
    A(){
        System.out.println("parent class constructor invoked");
    }
}

class B3 extends A{
    B3(){
        super();
        System.out.println("child class constructor invoked");
    }

    B3(int a){
        super();
        System.out.println("child class constructor invoked "+a);
    }

    {System.out.println("instance initializer block is invoked");}

    public static void main(String args[]){
        B3 b1=new B3();
        System.out.println();
        B3 b2=new B3(10);
    }
}