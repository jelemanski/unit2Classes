

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door
{
    private String name;
    private boolean state;
    
    public Door(String name, boolean state){
        this.name = name;
        this.state = state;
    }
    public void open(){
        this.state = true;
    }
    public void close(){
        this.state = false;
    }
    public void toggle(){
        this.state = !this.state;
    }
    public String getName(){
        return this.name;
    }
    public String getState(){
        if(this.state == true){
            return "open";
        } else{
            return "closed";
        }
    }
    public void setName(String name){
        this.name = name;
    }
    

}
