import javax.swing.*;
public class PatternProject
{
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String RESET = "\u001B[0m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_PURPLE = "\u001B[95m";
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_GREEN = "\u001B[92m";



    void DecreasePattern()
    {   
       int n = 5;
       for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void invertedPattern(){
          int n = 5;
     for ( int i = 1; i <= 5 ; i++){
         for( int j = i; j<= 5 ; j++){
             System.out.print("* ");
         }
         System.out.println();
     }
   }
   void butterflyPattern(){
    int i,j,N=5;
    for( i = 1 ; i<=N+N-1 ; i++ ){
        for( j = 1 ; j<=N+N-1 ; j++){
            System.out.print((i<=N)?(j<=i || j>=(N+N-i))?"X":" ":(j<=(N-(i-N)) || j>=(N+(i-N)))?"X":" " );
        }
        System.out.println("");
    }
   }
    void singletriangle(){
        int n = 5;
    for ( int i = 1; i <= 5 ; i++){
        for( int j = 1 ; j<= i ; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
  }
  void HourglassPattern(){
        int i,j,n=5;
        for( i = 1 ; i<=n; i++){
         for ( j=1 ; j<=n;j++){
             System.out.print((j<i)?" ":"* ");
     }
         System.out.println("");
  }
      for(i = n - 2; i >= 0; i--){   
            for(j = 0; j < n; j++){
                System.out.print((j < i )? " " : "* ");
            }
            System.out.println();
        }
    }
    void swastikpattern(){
        int i,j,n=5;
        for (i = 1 ;i<= n+n-1; i++){
            for(j = 1; j<=n+n-1 ; j++){
                 System.out.print(((i==n || j == n)||(j>n && i==1)|| (i<n && j== 1)|| (i>n && j == n+n-1)||(i == 1 && j>n)||( i == n+n-1 && j<n)||( j == n/2+1 && i == n/2+1) ||( j == (n/2+1) && i == (n/2+n))||(j == (n/2+n) && i == (n/2+1)) || (j==(n/2+n) && i==(n/2+n)))?"X":" ");
            }
            System.out.println("");

        }
    }
    void boxpattern(){
        int i,j;
        for( i = 1; i<=5 ; i++){
            for( j = 1 ; j<= 5 ; j++){
                System.out.print(i==j|| (5-i+1)==j|| (i==1 || i==5|| j==1 || j==5)?"*":" ");

            }
            System.out.println();
        }
    }
    void holoSquare(){
    int n = 5;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
           System.out.print((i == 1 || i == n || j == 1 || j == n)?"*":" ");
        }
        System.out.println();
        }
    }
    void charpattern(){
        int i,j,N=5,A = 0, w = 0;
        for( i= 1 ; i<=N; i++){
            for( j = 1 ; j<= i ; j ++){
                if( i % 2 ==1){
                    System.out.print((++w) + " ");
                }
                else{
                    System.out.print((char)(64 + (++A)) + " ");
                }
            }
                System.out.println("");
        }
    }
    void HollowDiamond(){
        int n= 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
    void zigzagPattern(){
        int n = 9;

        for (int i = 1; i <= 3; i++) { 
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    void hashtrianglePattern(){
        int i = 1;
        String s = "";
        while( i <= 5){
            s = s + String.valueOf(i) + " ";
            System.out.println("#".repeat(5-i) + s + "\b" + "#".repeat(5-i));
            i++;
        }
    }



  public static void main(String args[])
    {
        PatternProject p = new PatternProject();
        boolean run = true;
        System.out.println("\n\t\t" + BRIGHT_BLUE + "****Pattern-Project****" + RESET + "\n");
         System.out.println(" \n " + BRIGHT_YELLOW+ "---Choose pattern--- (1 to 12):" + RESET + "\n");
        System.out.println("1.DecreaseStairPattern \t 2. Inverted half-pyramid\n3. butterflyPattern \t 4.SingletrianglePattern\n5.Hourglass pattrern\t 6.swastik patter0\n7.box pattern\t\t 8.holoSquarepattern\n9.charpattern\t\t10.Hollow Diamond pattern\n11.ZigZag pattern\t12.HashTrianglePattern\n");
         
        while(run){
         String s=JOptionPane.showInputDialog("Enter Pattern Number");
        System.out.println(s);
       if(s.equals("1")){
       System.out.println(GREEN + "\nDecreasedStair Pattern\n" + RESET);
            p.DecreasePattern();
            System.out.println("\n");
        }
        else if(s.equals("2")){
            System.out.println(RED + "\nDecreasedStair Pattern\n" + RESET);
            p.invertedPattern();
            System.out.println("\n");
        }
         else if(s.equals("3")){
            System.out.println( YELLOW + "\n\nDecreasedStair Pattern\n" + RESET);
            p.butterflyPattern();
            System.out.println("\n");
        }
        else if(s.equals("4")){
            System.out.println( BLUE + "\nDecreasedStair Pattern\n" + RESET);
            p.singletriangle();
            System.out.println("\n");
        }
        else if(s.equals("5")){
            System.out.println( PURPLE + "\nDecreasedStair Pattern\n" + RESET);
            p.HourglassPattern();
            System.out.println("\n");
        }
       else if(s.equals("6")){
        System.out.println( YELLOW + "\nDecreasedStair Pattern\n" + RESET);
            p. swastikpattern();
            System.out.println("\n");
        }
        else if(s.equals("7")){
            System.out.println( CYAN + "\nDecreasedStair Pattern\n" + RESET);
            p. boxpattern();
            System.out.println("\n");
        }
        else if(s.equals("8")){
              System.out.println(YELLOW + "\nDecreasedStair Pattern\n" + RESET);
            p. holoSquare();
            System.out.println("\n");
        }
        else if(s.equals("9")){
            System.out.println(BRIGHT_RED + "\nDecreasedStair Pattern\n" + RESET);
            p.charpattern();
            System.out.println("\n");
        }
         else if(s.equals("10")){
            System.out.println(BRIGHT_PURPLE + "\nDecreasedStair Pattern\n" + RESET);
            p.HollowDiamond();
            System.out.println("\n");
        }
        else if(s.equals("11")){
            System.out.println(BLUE + "\nDecreasedStair Pattern\n" + RESET);
            p.zigzagPattern();
            System.out.println("\n");
        }
         else if(s.equals("12")){
           System.out.println(BLUE + "\nDecreasedStair Pattern\n" + RESET);
             p.hashtrianglePattern();
             System.out.println("\n");
        }
        else {
            System.out.println("Invalid input! Please enter number between 1 to 12.");
        } 
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit?", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            System.out.println("\nExiting program. Thank you!");
            run = false;
        }

        }       
    }
}
