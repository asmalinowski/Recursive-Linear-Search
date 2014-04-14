import java.util.Random;
import java.util.Arrays;

public class RecursiveLinearSearch {

    private int[] data; 
    private static final Random generator = new Random();
    
    public RecursiveLinearSearch( int size ) {
        data = new int[ size ];
        for (int i = 0; i < size; i++ )
            data[ i ] = 10 + generator.nextInt( 90 );
    }

    public int linearSearchRecursive( int size, int searchKey )
    {
        for (int index = 0; index <data.length; index++)
        if (size != searchKey)
            return -1;
        
        else if (data[index] == searchKey)
            return index;
        
            return linearSearchRecursive(size +1, searchKey);
    }
    
    public String toString() {
        return Arrays.toString( data );
    }
    }
