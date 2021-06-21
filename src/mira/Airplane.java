package mira;

public class Airplane 
{
    private String make;
    private int model;
    private int capacity;
    private String pilot;
    
    public Airplane(String mk, int mdl, int cp, String pl)
    {
        make = mk;
        model = mdl;
        capacity = cp;
        pilot = pl;
    }          
    
    public  String getMake()
    {
        return make;
    }
    
    public int getModel()
    {
        return model;
    }
    
    public int capacity()
    {
        return capacity;
    }
    
    public void assignPilot(String name)
    {
        pilot = name;
    }
    
    public String toString()
    {
        String result = "";
        
        result += "Airplane Information: \n"+"\t\tAircraft : "+make+" "+model+"\n\t\tCapacity: "+capacity+" seats"+"\n\t\tPilot: "+pilot;
        
        return result;
    }
    
}