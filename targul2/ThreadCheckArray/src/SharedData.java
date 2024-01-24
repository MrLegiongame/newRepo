import java.util.ArrayList;

public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * @param array ArrayList with numbers of type Integers.
	 * @param b Indicates the required sum of two numbers in array.
	 * <br>Initializing the SharedData object with the given array and b values.
	 */
	public SharedData(ArrayList<Integer> array, int b) 
	{	
		this.array = array;
		this.b = b;
	}

	/**
	 * @return Returns the winArray of the class.
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray Updating the class winArray to the given winArray.
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return Returns array of the class.
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return Returns b of the class.
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return Returns the class flag value.
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag Updating the class flag to the given flag.
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
