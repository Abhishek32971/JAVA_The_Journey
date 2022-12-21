public class GenericType<T,V> {
    T obj1;
    V obj2;
    GenericType(T obj,V Obj){
        obj1=obj;
        obj2=Obj;
    }

    T getObj1(){
        return obj1;
    }

    V getObj2(){

        return obj2;
    }

    public<H> T whatever(H element){
        System.out.println(element.getClass().getName());
        return obj1;
    }

    

    public static void main(String[] args) {
        GenericType<String,Integer> gen= new GenericType<>("whatever",8);
        int v=gen.getObj2();
        System.out.println(v);
        System.out.println(gen.obj1.getClass().getName());
        Boolean B=true;
        gen.whatever(B);
    }

}
