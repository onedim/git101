
public class Test {

	public static void main(String[] args) {
		Niz(new int[]{1, 2, 3, 4, 2});
		
		
		
		
	}
/**
 * pravljenje obrnutog niza iz prethodno definisanog niza
 * @param prva
 */
	private static void Niz(int[] prva) {
		
		for (int i=0;i<prva.length;i++){
			System.out.println(prva[i]);
		}
		int [] druga = null;//mora biti izvan for petlje
		for (int i=0;i<prva.length;i++){
			druga = new int[prva.length];
			druga [i]=prva[prva.length-i-1];//mora imati dodatno -1
			System.out.println(druga[i]);
		}
		int i=0;
		do  {
			if(prva[i]==druga[i]);
			System.out.println("Broj je simetrican");
			i++;
			else (prva[i]!=druga[i]);{
				System.out.println("Nije simetrican");
			}
		
			
		}

}
	
	
	

