import java.util.Arrays;

public class Aha {
	private String title;
	private int ISBN;
	private Integer[] values;
	
	public Aha(String title, int iSBN, Integer[] values)
	{
		super();
		this.title = title;
		ISBN = iSBN;
		this.values = values;
	}

	
	@Override
	public String toString() {
		return "Aha [title=" + title + ", ISBN=" + ISBN + ", values=" + Arrays.toString(values) + "]";
	}


	public static void main(String[] args) 
	{
		String title = "Things they don't write about in books about Java";
		int ISBN = 2334;
		Integer[] values = {1, 2, 4};
		Aha aha = new Aha(title, ISBN, values);

		System.out.println(aha.toString());
	}

}
