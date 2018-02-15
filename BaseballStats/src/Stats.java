
public class Stats {
	
	// All capital variable names makes me think of Enums	
	private double ABS, HTS, SNG, DBL, TRP, HMR, RNS, WLK, HBP, SCF;
	
	private String playerName;
	
	// Java needs line terminators (;) unlike Lua
	public Stats( String name, int abs, int hts, int dbl, int trp, int hmr, int rns, int wlk, int hbp, int scf ) {
			
		// Defaulting will be in the query.
		this.playerName = name;
		
		// Without casting, the methods try to do integer maths
		this.ABS = (double) abs;
		this.HTS = (double) hts;
		this.DBL = (double) dbl;
		this.TRP = (double) trp;
		this.HMR = (double) hmr;
		this.RNS = (double) rns;
		this.WLK = (double) wlk;
		
		this.HBP = (double) hbp;
		this.SCF = (double) scf;
		
		this.SNG = hts - dbl - trp - hmr;
		
	}
	
	// Methods use 'this' instead of 'self'
	
	public double BA() {
		return ( this.HTS / this.ABS );
	}
	
	public double OBP() {
		return ( this.HTS + this.WLK + this.HBP) / ( this.ABS + this.WLK + this.HBP + this.SCF );
	}
	
	public double SLG() {
		return ( this.SNG + ( 2 * this.DBL ) + ( 3 * this.TRP ) + ( 4 * this.HMR ) ) / this.ABS;
	}
	
	public double OBS() {
		return ( this.OBP() + this.SLG() );
	}
	
	public double TB() {		
		return ( this.SNG + ( 2 * this.DBL ) + ( 3 * this.TRP ) + ( 4 * this.HMR ) );
	}
	
	public void PrintStats() {
		
		System.out.println( String.format( "%s's Stats", this.playerName ) );
		System.out.println( String.format( "- Batting Average (BA): %.3f", this.BA() ) );
		System.out.println( String.format( "- On Base Percentage (OBP): %.3f", this.OBP() ) );
		System.out.println( String.format( "- Slugging Percentage (SLG): %.3f", this.SLG() ) );
		System.out.println( String.format( "- On Base + Slugging (OBS): %.3f", this.OBS() ) );
		System.out.println( String.format( "- Total Bases (TB): %.3f", this.TB() ) );
		
	}

	
}
