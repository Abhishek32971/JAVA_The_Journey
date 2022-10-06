//public class blank {
    //public static void main(String[] args) {
        public class blank {
            public static void main(String[] args) {
               int n=6;
               for(int i=1;i<=n;i++){
                for (int j=1;j<=i;j++){
                    if(j==1||j==i){
                        System.out.print("*");
                   }
                   else{
                    System.out.print(" ");
                   }
                    
                }
                int t=2*(n-i);
                for(int j=1;j<=t;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    if(j==1||j==i){
                        System.out.print("*");
                   }
                   else{
                    System.out.print(" ");
                   }
                }
                System.out.println();
               } 
        
               for(int i=n;i>=1;i--){
                for (int j=1;j<=i;j++){
                    if(j==1||j==i){
                        System.out.print("*");
                   }
                   else{
                    System.out.print(" ");
                   }
                    
                }
                int spaces=2*(n-i);
                for(int j=1;j<=spaces;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    if(j==1||j==i){
                        System.out.print("*");
                   }
                   else{
                    System.out.print(" ");
                   }
                }
                System.out.println();
               } 
        
        
                
         
            }
        }
//    }
//}
