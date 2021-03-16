import java.util.HashMap;
import java.util.Random;

public class nationalElectoralHeadquaters {
    private static int countNpp;
    private static int countNdc;
    private static int countCpp;
    private int NPP;
    private int NDC;
    private int CPP;
   
    public nationalElectoralHeadquaters() {
        this.setNPP(0);
        this.setNDC(0);
        this.setCPP(0);
    }
    /**
     * @return CPP
     */
    public int getCPP() {
        return CPP;
    }
    /**
     * @param cPP
     */
    public void setCPP(int CPP) {
        this.CPP = CPP;
    }
    /**
     * @return NDC
     */
    public int getNDC() {
        return NDC;
    }
    /**
     * @param nDC
     */
    public void setNDC(int nDC) {
        this.NDC = nDC;
    }
    /**
     * @return NPP
     */
    public int getNPP() {
        return NPP;
    }
    /**
     * @param nPP
     */
    public void setNPP(int NPP) {
        this.NPP = NPP;
    }
     /**
      * @param nPP
      * @param nDC
      * @param cPP
      */
    public nationalElectoralHeadquaters(int nPP, int nDC, int cPP) {
        NPP = nPP;
        setNDC(nDC);
        setCPP(cPP);
    }
    public static int countNPP(){
        return ++countNpp;
    }
    public static int countNdc(){
        return ++countNdc;
    }
    public static int countCpp(){
        return ++countCpp;
    }
    public String toString(){
        return " NPP: "+ getNPP()+" NDC: "+getNDC()+"CPP: "+getCPP();
    }
    public void hashMap(){
        HashMap<String, Integer> party=new HashMap<String, Integer>();
        party.put("NPP",getNPP());
        party.put("NDC",getNDC());
        party.put("CPP",getCPP());
        
        for (String i: party.keySet()){
            System.out.println("key: "+i+"value: "+party.get(i));
        }
    }
    
    
}
