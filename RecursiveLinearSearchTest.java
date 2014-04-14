import java.util.Scanner;

public class RecursiveLinearSearchTest {
        public static void main( String[] args) {
        
    Scanner input = new Scanner( System.in );
    
    int searchInt;
    int position;
    
    RecursiveLinearSearch searchArray = new RecursiveLinearSearch ( 10 );
    System.out.println( searchArray + "\n" );
    
    System.out.print( "Please enter an integer value (-1 to quit): " );
    searchInt = input.nextInt();
    
    while ( searchInt != -1 ) {
     position = searchArray.linearSearchRecursive (searchInt,searchInt);
     
     if ( position == -1 )
         System.out.println( "The integer " + searchInt + " was not found.\n" );
     else
         System.out.println( "The integer " + searchInt + " was found in position " + position + ".\n" );
     
     System.out.print( "Please enter an integer value (-1 to quit): " );
     searchInt = input.nextInt();
}
}
}
