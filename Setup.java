import bridges.base.ElementVisualizer;
import bridges.connect.Bridges;
import bridges.base.Array;
import bridges.base.Element;

public class Setup {
	public static void main(String[] args) throws Exception {

	    /* Initialize a Bridges connection with your credentials */
	    /* TODO: plug your own BRIDGES credentials */
	    Bridges bridges = new Bridges(0, "copinf", "[api key]");

	    /* Set an assignment title */
	    bridges.setTitle("Array Example");

	    /* Set up the array dimensions, allocate an Array of Elements */
	    /* TODO: Make an array of size 10 */
	    int arraySize = 10;
	    Array<Integer> arr = new Array<Integer> (arraySize);
	    
	    /* Populate the array with integers */
	    /* TODO: Make the array store square numbers*/
		for(int i = 0; i < 10; i++) {
			arr.getElement(i).setValue(0);
			arr.getElement(i).getVisualizer().setColor(i%2==0?"red":"yellow");
			/* set the value as a Label */
			arr.getElement(i).setLabel(String.valueOf(i*i));
		}
	    /* Tell BRIDGES which data structure to visualize */
	    bridges.setDataStructure(arr);

	    /* Visualize the Array */
	    bridges.visualize();
	}
}
