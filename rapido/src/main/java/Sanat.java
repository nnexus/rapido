  /*********************************************************
 *        Patrik Helminen 2.6.2015                         *
 *        Ohjelmoinnin harjoitustyö [kesä 2015]            *
 *        Helsingin yliopisto (Avoin yliopisto)            *
 *********************************************************/


public class Sanat {
    
    
    public static void lueTaulu(String[] varit)
    {
        for(int i = 0; i < varit.length; i++)
        System.out.print(varit[i] + " ");  
    }
    
    
    public static void main(String[] args) {
        
        String[] varit = {"amarillo", "keltainen", "rojo", "punainen"};
        
        lueTaulu(varit);



        //System.out.println(varit[i].charAt(0));
        
        
    }
    
}
