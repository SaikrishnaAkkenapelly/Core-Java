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

	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Cricketer))
			throw new IllegalArgumentException("Can not compare these two objects..");
		
		int points = 0 ;
		boolean areEqual = false;
		Cricketer cricketer = (Cricketer) obj;
		points = ( cricketer.batAvg > this.batAvg ) ? ++points : ( cricketer.batAvg == this.batAvg ? points : --points );
		points = ( cricketer.bowAvg < this.bowAvg ) ? ++points : ( cricketer.bowAvg == this.bowAvg ? points : --points );
		points = ( cricketer.matchesPlayed > this.matchesPlayed ) ? ++points : ( cricketer.matchesPlayed == this.matchesPlayed ? points : --points );
		
		if(points > 0)
		{
			System.out.println(cricketer.getName() + " is better cricketer than " + this.getName());
		}
		else if(points < 0)
		{
			System.out.println(this.getName() + " is better cricketer than " + cricketer.getName());
		}
		else if(points == 0)
		{
			System.out.println(this.getName() + " is same as cricketer " + cricketer.getName());
			areEqual = true;
		}
		
		return areEqual;
	}

	public String getName()
	{
		return name;
	}
}
