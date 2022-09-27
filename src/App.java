
public class App {
    public static void main(String[] args) throws Exception {

    // Draw patterns given 
int n = 4 ;

for (int i = 1; i <= n; i++) {
   
    for (int j = 1; j <= n-i; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j < 2*i;j++ ){
       
            System.out.print("*");
 
    }
    System.out.println("");

}

for (int i = n-1; i >= 1; i--) {
   
    for (int j = 1; j <= n-i; j++) {
        System.out.print(" ");
    }
    int end = (2*i)-1;
    for (int j = 1; j <= end ; j++ ){
       
            System.out.print("*");
 
    }
    System.out.println("");

}




    }
}
