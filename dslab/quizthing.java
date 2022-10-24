class quizthing{
    public static void main(String[] args) {
        int[] a={0,2,4,1,3};
        for(int i=0;i<a.length;i++){
            a[i]=a[(a[i]+3)% a.length];
        }
        System.out.println(a[1]);
        for(i=0;;i++);
    }
}

