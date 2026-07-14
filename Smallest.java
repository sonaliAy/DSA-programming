public class Smallest {
    public static void main(String[] args){
        int a = 12 , b = 13 , c = 4;
        if(a <= b && a <= c){
            System.out.println(a);
        }
        else if(b <= a && b <= c){
            System.out.println(b);
        }
        else
            System.out.println(c);
    }
    
}
