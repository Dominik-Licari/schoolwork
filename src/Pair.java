package DomTools;
public class Pair<X, Y>
{
    public final X x;
    public final Y y;
    public Pair(X x, Y y)
    {
	this.x = x;
	this.y = y;
    }
    public boolean equals(Pair<X, Y> other)
    {
    	return (this.x.equals(other.x) && this.y.equals(other)) || 
	    (this.x == other.x && this.y == other.y);
    }
    public Pair<Y, X> flip()
    {
	return new Pair<Y, X>(this.y, this.x);
    }
}
