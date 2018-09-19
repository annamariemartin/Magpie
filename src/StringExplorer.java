
public class StringExplorer
{
	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
				
		//  Try other methods here:
		String upperCase = sample.toUpperCase();
		System.out.println ("sample.toUpperCase() = " + upperCase);
		System.out.println ("After toUpperCase(), sample = " + sample);
		
		System.out.println(sample.charAt(25));
		int notFoundPsn = sample.indexOf("slow"); 
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
		
		// Experiment with compare to 
		String example1 = "!";
		String example2 = "?";
		System.out.println(example1.compareTo(example2));
		
		// experiment with substring
		String starter = "start middle end";
		int psn1 = starter.indexOf("middle");
		System.out.println(starter.substring(psn1, psn1+6));
		

	}
}