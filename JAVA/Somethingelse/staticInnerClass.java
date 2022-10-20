public  class staticInnerClass{
    static class B{
        public void msg(){
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
        B b=new B();
        b.msg();
    }
}