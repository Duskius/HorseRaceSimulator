
/**
 * Write a description of class Horse here.
 * 
 * @author Dylan Joe Cummins 
 * @version (a version number or a date)
 */
public class Horse
{
    //Fields of class Horse
    
    String name;
    char symbol;
    double confidence;
    int distanceTravelled;
    boolean hasFallen;

    
      
    //Constructor of class Horse
    /**
     * Constructor for objects of class Horse
     */
    public Horse(char horseSymbol, String horseName, double horseConfidence)
    {
        this.symbol = horseSymbol;
        this.name = horseName;
        this.distanceTravelled = 0;
        this.hasFallen = false;
        this.confidence = validateConfidence(horseConfidence);
        
    }
    
    
    
    //Other methods of class Horse
    public void fall()
    {
        this.hasFallen = true;
    }
    
    public double getConfidence()
    {
        return this.confidence;
    }
    
    public int getDistanceTravelled()
    {
        return this.distanceTravelled;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public char getSymbol()
    {
        return this.symbol;
    }
    
    public void goBackToStart()
    {
        this.distanceTravelled = 0;
        this.hasFallen = false;
    }
    
    public boolean hasFallen()
    {
        return this.hasFallen;
    }

    public void moveForward()
    {
        this.distanceTravelled++;
    }

    public void setConfidence(double newConfidence)
    {
        this.confidence = validateConfidence(newConfidence);
    }
    
    public void setSymbol(char newSymbol)
    {
        this.symbol = newSymbol;
    }
    
    //New method for confidence validation
    private double validateConfidence(double newConfidence) {
        if (newConfidence < 0 || newConfidence > 1) {
            throw new IllegalArgumentException("Confidence rating must be between 0 and 1.");
        }
        return newConfidence;
    }
}
