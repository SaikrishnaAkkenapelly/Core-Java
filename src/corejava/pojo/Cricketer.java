package corejava.pojo;

public class Cricketer {

	public static Long BATSMAN = 1L;
	public static Long BOWLER = 2L;
	public static Long ALL_ROUNDER = 2L;
	
	private String name;
	private double batAvg;
	private double bowAvg;
	private long matchesPlayed;
	private long type;
	
	public Cricketer(String name,long type,double batAvg,double bowAvg,long matchesPlayed)
	{
		if(type != BATSMAN && type != BOWLER && type != ALL_ROUNDER)
		{
			throw new IllegalArgumentException("Please select from options provided");
		}
		else
		{
			this.type = (type == BATSMAN ? BATSMAN :(type == BOWLER ? BOWLER : ALL_ROUNDER)); 
		}
		
		this.name = name;
		this.batAvg = batAvg;
		this.bowAvg = bowAvg;
		this.matchesPlayed = matchesPlayed;
	}

	// equal method of object class should be overridden to compare objects
	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Cricketer))
			throw new IllegalArgumentException("Can not compare these two objects..");
		
		Cricketer cricketer = (Cricketer) obj;
		int comparitiveScore = this.getComparitiveScore(cricketer);
		if(comparitiveScore == 0)
			return true;
			
		return false;
	}

	public String getName()
	{
		return name;
	}
	
	// compares 2 cricketer objects and returns better cricketer of them
	public Cricketer compareWith(Cricketer cricketer)
	{
		int comparitiveScore = this.getComparitiveScore(cricketer);

		if(comparitiveScore > 0)
		{
			return cricketer;
		}
		else
		{
			return this;
		}
	}
	
	private int getComparitiveScore(Cricketer cricketer)
	{
		int comparitiveScore = 0 ;
		comparitiveScore = ( cricketer.batAvg > this.batAvg ) ? ++comparitiveScore : ( cricketer.batAvg == this.batAvg ? comparitiveScore : --comparitiveScore );
		comparitiveScore = ( cricketer.bowAvg < this.bowAvg ) ? ++comparitiveScore : ( cricketer.bowAvg == this.bowAvg ? comparitiveScore : --comparitiveScore );
		comparitiveScore = ( cricketer.matchesPlayed > this.matchesPlayed ) ? ++comparitiveScore : ( cricketer.matchesPlayed == this.matchesPlayed ? comparitiveScore : --comparitiveScore );
		return comparitiveScore;
	}
}
