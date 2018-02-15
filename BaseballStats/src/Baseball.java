import java.util.Scanner;

public class Baseball {
	
	static Scanner input = new Scanner( System.in );

	public static void main(String[] args) {
		
		System.out.println( "Quiz 1: Baseball Stats\n" );
		
		System.out.println( "Player Name:" );
		String name = input.nextLine();
		//name = ( !name.isEmpty() ) ? name : "Babe Ruth";
		
		int abs = QueryAssign( "At Bats (ABS):", 8399 );
		int hts = QueryAssign( "Hits (HTS):", 2873 );
		int dbl = QueryAssign( "Doubles (DBL):", 506 );
		int trp = QueryAssign( "Triples (TRP):", 136 );
		int hmr = QueryAssign( "Homeruns (HMR):", 714 );
		int rns = QueryAssign( "Runs (RNS):", 2174 );
		int wlk = QueryAssign( "Walks (BB):", 2062 );
		int hbp = QueryAssign( "Hits by Pitch (HBP):", 43 );
		int scf = QueryAssign( "Sacrificial Flies (SCF):", 1 );
		
		Stats player = new Stats( name, abs, hts, dbl, trp, hmr, rns, wlk, hbp, scf );
		player.PrintStats();
		

	}
	
	private static int QueryAssign( String query, int def ) {
		
		System.out.println( query );
		int foo = ( input.hasNextInt() ) ? input.nextInt() : def;
		
		// Makes sure the next item gets checked too rather than defaulting all of them
		if ( foo == def ) {
			input.next();
		}
		
		return foo;
		
	}

}
