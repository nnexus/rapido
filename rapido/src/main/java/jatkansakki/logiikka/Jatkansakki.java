package jatkansakki.logiikka;

  /*********************************************************
 *        Patrik Helminen 20.5.2015                        *
 *        Ohjelmoinnin harjoitustyö [kesä 2015]            *
 *        Helsingin yliopisto (Avoin yliopisto)            *
 *********************************************************/


import java.util.Scanner;

public class Jatkansakki {

   private Kayttoliittyma kayttoliittyma; // ohjain näkee näkymän
   private Pelilauta pelilauta; // ohjain näkee mallin
   private Pelaaja pelaaja; 
    
    
    
   
   
  
    public static void main(String[] args) {
        
        char[][] pelitaulukko = new char[4][4];
        Pelilauta.alustaPelitaulukko(pelitaulukko);
        //Pelilauta.piirraPelitaulukko(pelitaulukko);
        Scanner syotteenLukija = new Scanner (System.in);

        char xmerkki = 'X';
        char omerkki = 'O';

    
     
    
            // PÄÄSILMUKKA int i = 8 -> 4x4 laudassa on 16 ruutua 
            for(int i = 0; i <=8; i++)
            {
                
            /*---- KONEEN PELIVUORO--------------------------------------------------   
                arvotaan ja validoidaan kordinaatit X -merkkille ja sijoitetaan tauluun
                piirretään taulu käyttäjälle
                tarkistetaan johtiko merkin sijoittaminen pelilaudalle voiton, mikäli kyllä, lopetaan peli
            ----------------------------------------------------------------------*/      
           
                //valikko();
                Pelilauta.arvoPelitaulukkoon(pelitaulukko);
                Kayttoliittyma.piirraPelitaulukko(pelitaulukko);
                
                if(Pelilauta.tarkistaVoitto(xmerkki, pelitaulukko))
                {    
                    System.out.println("Hävisit!");
                    i = 8;
                }

           
                
                // KÄYTTÄJÄN SYÖTTEEN vastaanottaminen ja validointi
                while(true)
                {
                    
                    System.out.print("Anna ruudun pystykoordinaatti, ylhäällä on 1: ");
                    int y = syotteenLukija.nextInt();
                    System.out.print("Anna ruudun vaakakoordinaatti, vasemmassa reunassa on 1: ");
                    int x = syotteenLukija.nextInt();
                    if (x >0 && x < 5 && y >0 && y < 5 && pelitaulukko[y-1][x-1] == ' ')
                    {
                        pelitaulukko[y-1][x-1] = 'O';
                        break;
                    }
                    System.out.println("Virheelliset koordinaatit tai ruutu on jo varattu, syötä uudestaan kordinaatit");
                }
                Kayttoliittyma.piirraPelitaulukko(pelitaulukko);
                if(Pelilauta.tarkistaVoitto(omerkki, pelitaulukko))
                {
                    System.out.println("Voitit!");
                    i = 8;
                }
            }
            Kayttoliittyma.piirraValikko();
        }

        
}

