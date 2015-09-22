

/**
 * Write a description of class vendingMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachine
{
    public int cansInMachine; 
    public int tokensInMachine;
    public int tokensInPocket;
   
    
    
    public void fillUp( int newCans )
    {
        cansInMachine += newCans ;
        
    }
    
    public void buyCan(int tokensPutIn)
    {
        tokensInPocket -= tokensPutIn;
        tokensInMachine += tokensPutIn;
    }
 
    public void getCanCount( cansInMachine) 
    
    
    
    
    
    
}
        
        
    
    
