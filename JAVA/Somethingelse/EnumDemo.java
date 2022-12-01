enum Season{
    WINTER,SPRING,SUMMER,RAINY
}
public class EnumDemo {
    public static void main(String[] args) {
        Season ap;
        ap=Season.RAINY;
        //ouput an enum value
        System.out.println("value of ap is "+ap);
        System.out.println();
        ap=Season.WINTER;
        if(ap==Season.WINTER)
            System.out.println("ap is WINTER\n");
        switch(ap){
            case WINTER:System.out.println("its winter\n");
            break;
            case SPRING:System.out.println("its Sprint\n");
            break;
            case SUMMER:System.out.println("its summer");
            break;
            case RAINY:System.out.println("its Rainy\n");
            break;
        }
    }
}
