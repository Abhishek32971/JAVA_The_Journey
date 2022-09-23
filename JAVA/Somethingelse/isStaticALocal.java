

public class isStaticALocal {
    static int yo=100;
    static void fetch(){
        int yo=100;
    }
    public static void main(String[] args) {
        isStaticALocal A=new isStaticALocal();
        System.out.println(A.yo);
    }
    
}
