public class Leapyear {
    public static void main(String[]args){
     boolean isprime = false;
        for(int i = 3; i <= 100; i++){
            for(int j = 2; j <= i-1; j++ ){
                if( i % j == 0){
        isprime = true;
                }
            }
                if(!isprime){
                    System.out.println(i+ " is  a prime no");
                }
isprime = false;
        }
    }
}

