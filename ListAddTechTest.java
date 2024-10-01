import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * Class to define the technical test for adding a filtered Array to a List
 * @author Pedro Mayorga
 * @version 1.0
 */
class ListAddTechTest {

    /**
     * Main method to run the application
     * @param args
     */
    public static void main(String[] args) {

        // Define and print List and Array for test
        List<Object> listTest = new ArrayList<>(List.of("test", "aaa", 4, "err", "temp", 6, "xyz"));
        Object[] arrayTest = new Object[]{9,2,3,"acb",3,5,"acb",2,7,"empty","empty",8,8,2,"acb",1,1,1};
        System.out.println("Parameter List: " + Arrays.toString(listTest.toArray()));
        System.out.println("Parameter Array: " + Arrays.toString(arrayTest));

        // Operate the adding and show the result
        List<Object> result = addToList(listTest, arrayTest);
        System.out.println("Result List: " + Arrays.toString(result.toArray()));
    }
    
    /**
     * Method for adding an Array to a List, It filters the Array before adding it
     * @param listToAdd List of objects that will be added
     * @param objectsArray Un-filtered Array of objects to be added
     * @return Sum of a List and a filtered Array of objects
     */
    public static List<Object> addToList(List<Object> listToAdd, Object[] objectsArray) {
        
        // If List or Array are null
        if (listToAdd == null || objectsArray == null) {
            // I throw the excepcion here instead of using a try-catch block, because it's
            // a controlled situation with a predictable data validation
            throw new IllegalArgumentException("List or Array can't be null");
        }

        // Filter the Array
        Object[] filteredArray = filterArrayDuplicates(objectsArray);
        
        // Add the filtered elements to the List
        for (int i = 0; i < filteredArray.length; i++) {
            listToAdd.add(filteredArray[i]);
        }        
          
        return listToAdd;      
    }

    /**
     * Method for filtering an objects Array, wiping the duplicate items
     * @param duplicatesArray Raw array without filters
     * @return Filtered Array of objects with no duplicate elements
     */
    public static Object[] filterArrayDuplicates(Object[] duplicatesArray) {

        // Create Arraylist for the new filtered array
        ArrayList<Object> uniqueObjects = new ArrayList<Object>();
        
        // Find duplicates and add just 1 time to the Arraylist       
        for (Object item : duplicatesArray) {
            if (!uniqueObjects.contains(item)) {
                uniqueObjects.add(item);
            }
        }
    
        // Convert Arraylist to array
        Object[] filteredArray = uniqueObjects.toArray(new Object[uniqueObjects.size()]);       
        
        return filteredArray;
    }
}