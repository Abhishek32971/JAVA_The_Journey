public class StringMethods {
    public static void main(String[] args) {
        String s2="sachin";
        String s1="tendulkar";
        String s3=s1.concat(s2);
        String s4=s3.concat(s3);
        String s5=s4.substring(0,6);
        // comparison equals() , compareTo() , ==
        System.out.println("when i compare s1 with s2 "+s1.compareTo(s2));//t-s
        System.out.println(s1.equals(s2));
        System.out.println("s1:"+s1+" s2: "+s2+" s3: "+s3+" s4: "+s4+" s5: "+s5);
        System.out.println(s1.charAt(5));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println("   s   ".trim());
        
    }
}
