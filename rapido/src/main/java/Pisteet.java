  /*********************************************************
 *        Patrik Helminen 2.6.2015                         *
 *        Ohjelmoinnin harjoitustyö [kesä 2015]            *
 *        Helsingin yliopisto (Avoin yliopisto)            *
 *********************************************************/

import java.util.*;
public class Pisteet {
    
    /* EN SAA VIELÄ METODIA TOIMIMAAN
    public void lueMaksimipisteet(ArrayList[] maksimipisteet)
    {
        for (int i = 0; i < maksimipisteet.size(); i++) {
            System.out.println(maksimipisteet.get(i));
        }
        
      
    }
    
    public void  kirjoitaMaksimipisteet()
    {
        // 
        // kellonaikaa verrataan taulussa oleviin, pienin aika on ensimmäisenä
        // uusi aika sijoitetaan kirjoitetaan edellisen päälle
    }
    
    */
    
    // 10 alkioinen taulukko pelaajien top-10 pisteille 
    // käyttäjän nimi ja kellonaika
    public static void main(String[] args) {
        
        ArrayList<String> maksimipisteet = new ArrayList<>();

        maksimipisteet.add("1 min ja 5 sek");
        
        for (int i = 0; i < maksimipisteet.size(); i++) {
            System.out.println(maksimipisteet.get(i));
        }
        

    }  
}
 