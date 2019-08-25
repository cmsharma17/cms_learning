/*A method that using polymorphism to create a set from an array.*/

import java.util.Arrays;
import java.awt.Rectangle;
public class CreateSet {

	public static void main(String[] args) {
		String [] words ={"A","B","B","D","C","A"};
		System.out.println("original::"+Arrays.toString(words));
		System.out.println("As a set::"+Arrays.toString(makeSet(words)));
		
		Object[] mixed = {"A", "C", "A", "B", new Rectangle(),
                new Rectangle(), "A", new Rectangle(0, 1, 2, 3), "D"};
        System.out.println( "original: " + Arrays.toString(mixed));
        System.out.println( "as a set: " + Arrays.toString(makeSet(mixed)));

	}
	
	public static Object[] makeSet(Object[] data){
		assert data != null : "Failed precondition makeSet. parameter cannot be null";
		assert noNulls(data) : "Failed precondition makeSet. no elements of parameter can be null";
		Object[] result = new Object[data.length];
		int indexInResult;
		int numUnique = 0;
		boolean found;
		for(int i = 0; i<data.length; i++){
			indexInResult=0;
			found =false;
			while(!found && indexInResult < numUnique){
                found = data[i].equals(result[indexInResult]);
                indexInResult++;
            }
            if( ! found ){
                result[numUnique] = data[i];
                numUnique++;
            }
			
		}
		Object[] result2 = new Object[numUnique];
        System.arraycopy(result, 0, result2, 0, numUnique);
        return result2;
	}
	
	// pre: data != null
    // return true if all elements of data are non null,
    // false otherwise
	private static boolean noNulls(Object[] data){
		assert data!=null : "Failed precondition makeSet. parameter cannot be null";
		boolean good = true;
		int i = 0;
		while(good && i< data.length){
			good = data[i] != null;
			i++;
		}
		return good;
		
	}

}
