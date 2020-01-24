/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simon_v2;

import java.awt.datatransfer.*;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Grzes
 */
public class Chatbot {

    static boolean odpowiedziano = false;
    static String imiechatbota = "SImon";
    private static String answer;
    static String imie;
    private static String b;
    private static String a;
    private static String dododp2 = "";
    static String wordsprzecinki[];
    private static int r;
    private static String kolor = "";
    private static String[] wordskropki;
    static Thread one;
    static ArrayList histpyt = new ArrayList();
    private static boolean waiting;
public static void Show(String urls, int time){
    //if(one!=null)one.stop();
    
     one = new Thread() {
    public void run() {
         URL url;
        
        try {
            url = new URL(urls);
       
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);

        JFrame f = new JFrame("Animation");
        f.setVisible(false);
        f.setAlwaysOnTop(true);
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setFocusableWindowState(false);
        f.setVisible(true);
           try {
               Thread.sleep(time);
           } catch (InterruptedException ex) {
               Logger.getLogger(Chatbot.class.getName()).log(Level.SEVERE, null, ex);
           }
           //icon = new ImageIcon("http://66.media.tumblr.com/69b6a712e800ba029953234529acdc91/tumblr_nf89fo5AVd1shenylo2_500.gif");
          // label = new JLabel(icon);
         
             f.setVisible(false);
             this.stop();
          
            
     } catch (MalformedURLException ex) {
            Logger.getLogger(Chatbot.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }  
};

one.start();
       
}
public static void backgroundanimation( String urls){
    //if(a==""){
       Thread back = new Thread() {
    public void run() {
         System.out.println("jestem");
         URL url;
        
        try {
            url = new URL(urls);
       
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);

        JFrame f = new JFrame("Animation");
       // f.setVisible(false);
        f.setAlwaysOnTop(true);
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
       f.setFocusableWindowState(false);
//           try {
//               Thread.sleep(time);
//           } catch (InterruptedException ex) {
//               Logger.getLogger(Chatbot.class.getName()).log(Level.SEVERE, null, ex);
//           }
           //icon = new ImageIcon("http://66.media.tumblr.com/69b6a712e800ba029953234529acdc91/tumblr_nf89fo5AVd1shenylo2_500.gif");
          // label = new JLabel(icon);
          while(true){
         if(a!=""){
             //System.out.println("false");
              
             f.setVisible(false);
               try {
               Thread.sleep(3300);
           } catch (InterruptedException ex) {
               Logger.getLogger(Chatbot.class.getName()).log(Level.SEVERE, null, ex);
           }
         }else{
             // System.out.println("true");
              f.setVisible(true);
         }
          }
     } catch (MalformedURLException ex) {
            Logger.getLogger(Chatbot.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }  
};
       back.start();
   // }
}
public static void ShowRandom(){
   int ran = new Random().nextInt(5);

       one.stop();
   if(answer.toLowerCase().contains("nie wiem")){
       Show("http://media.tumblr.com/tumblr_lvw4szTUVU1qbis0h.gif",3300);
   }else{
    if(answer.toLowerCase().contains("tak")){ 
        Show("http://66.media.tumblr.com/7bdc7d55f4e81f6b70b24ca476a81ac9/tumblr_inline_nfhaozgZr81r4mk65.gif",3300);
    
   }else{  
   if(ran==0){
        Show("http://media.tumblr.com/tumblr_m0w2u1Amlf1ql4k86.gif",3300);// wstyd tur around for a second
   }
   if(ran==1){
        Show("http://65.media.tumblr.com/tumblr_matwqqKW2E1r0xr83.gif",3300); //test check
   }
    if(ran==2){
        Show("http://media.tumblr.com/tumblr_m0w2u1Amlf1ql4k86.gif",3300); // wstyd tur around for a second
   }
     if(ran==3){
        Show("http://66.media.tumblr.com/7bdc7d55f4e81f6b70b24ca476a81ac9/tumblr_inline_nfhaozgZr81r4mk65.gif",3300); //Tak, eee a wlasciwie
   }
      if(ran==4){
        Show("https://38.media.tumblr.com/tumblr_lr5k208Oq71qj1exi.gif",3300); //nie a w sumie...
   }
     
      if(ran==5){
        Show("http://media.tumblr.com/tumblr_ln9o77bI2Q1qip7fl.gif",3300); // not out of a question
   }
   }
   }

}
    public static void main(String[] args) {
        
//        try {
//          System.setOut(new PrintStream (new FileOutputStream(java.io.FileDescriptor.out), true, "Ascii"));
//        } catch (UnsupportedEncodingException ex) {
//            Logger.getLogger(Chatbot.class.getName()).log(Level.SEVERE, null, ex);
//        }
        int iloscokrazen = 1;

        String dodpyt = "ghsdre";
        String dododp = "ghsdre";
        String lubie = "EEEE.... Wlasciwie to co lubisz robic?";
        System.out.println("<" + imiechatbota + ">:" + "Wiatj.");
        System.out.println("<" + imiechatbota + ">:" + "Jak sie nazywasz, przyjacielu?");
        Scanner in = new Scanner(System.in);

        System.out.print("<Anonim>:");
         Show("http://media.tumblr.com/tumblr_m0s1a3MeIT1r161fg.gif",3300);
        imie = in.nextLine();
       
        if (dopasuj(imie, "mow mi ", imie, false)) {
            imie = dopasujString(1, "mow mi ", imie, "mow mi ", "", "");
        }
        if (dopasuj(imie, "nazywam sie", imie, false)) {
            imie = dopasujString(1, "nazywam sie ", imie, "nazywam sie ", "", "");
        }
        if (dopasuj(imie, "mam na imie", imie, false)) {
            imie = dopasujString(1, "mam na imie ", imie, "mam na imie ", "", "");
        }
        imie = dopasujString(1, "jestem ", imie, "jestem ", "", "");
        odpowiedziano = false;
        String words[] = imie.split(" ");
        imie = words[0];
        if (!dopasuj(imie, "Grzegorz", "", false)) {
            System.out.println("<" + imiechatbota + ">:" + imie + ", to bardzo ladne imie.");
            System.out.println("<" + imiechatbota + ">:" + "Jak ci minal dzien " + imie + "?");
        } else {
            print("<" + imiechatbota + ">:" + "Witaj stworco, jak ci minal dzien?");
//           System.out.print("<"+imie+">:");
//            String a = in.nextLine();
        }
         Show("http://media.tumblr.com/tumblr_m0w2u1Amlf1ql4k86.gif",3300);
                    backgroundanimation("http://66.media.tumblr.com/69b6a712e800ba029953234529acdc91/tumblr_nf89fo5AVd1shenylo2_500.gif");

        while (true) {


            if (answer != null ) {
                
                print(answer);
                //ShowRandom();
                //Show("http://66.media.tumblr.com/69b6a712e800ba029953234529acdc91/tumblr_nf89fo5AVd1shenylo2_500.gif", 3300);
                 //Show("http://images4.wikia.nocookie.net/__cb20120317044121/legouniverse/images/5/5f/Wheatley.gif");
             // String str = "String destined for clipboard";

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		StringSelection strSel = new StringSelection(answer);
		clipboard.setContents(strSel, null);
                histpyt.add(answer);
            }
            iloscokrazen = 1;
            answer = "";
            wordsprzecinki = null;
            wordskropki = null;
            odpowiedziano = false;
            System.out.print("<" + imie + ">:");
            a="";
            a = in.nextLine();
          waiting=false;
            a = a.replace("?", "");
            a = a.replace("!", "");
            a = a.replace(".", ",");

            histpyt.add(a);

            for (int i = 0; i < iloscokrazen; i++) {

                if (iloscokrazen > 1) {
                    if (answer != null) {
                        print(answer);
                        histpyt.add(answer);
                    }
                    answer = "";


                    a = wordsprzecinki[i];
                    //print(wordsprzecinki[i]);
                    // a = b;
                    odpowiedziano = false;

                    // print(a);
                    // print(b);
                }
                System.out.print("<" + imiechatbota + ">:");

                if (dopasuj(a, ", ", a, false) || dopasuj(a, ". ", a, false)) {
                    String split;
                    if (dopasuj(a, ", ", a, false)) {
                        split = ", ";
                    } else {
                        split = ". ";
                    }

                    try {
                        wordsprzecinki = a.split(split);
                    } catch (java.lang.ArrayIndexOutOfBoundsException aiob) {
                        System.out.println("I have just picked up a fault");
                    }
                    iloscokrazen = wordsprzecinki.length;
                    if (wordsprzecinki[i] != null) {
//                        b = words[1];
//                        a = a.replace(b, "");
                        a = wordsprzecinki[i];
                        // print(wordsprzecinki[i]);


                    }
                }

                a = a.replace(".", "");
                a = a.toLowerCase();
                a = polskieznaki(a);
                try {
                    //print("jest");
                    // print(i + "");
                    //start
                    ModulWykonywania(a);
                } catch (IOException ex) {
                    Logger.getLogger(Chatbot.class.getName()).log(Level.SEVERE, null, ex);
                }
                pytanie(a, "czesc", "Witaj.");
                pytanie(a, "niezle", "To dobrze.");
                pytanie(a, "masz racje", "Milo mi ze podzielasz moje poglady.");
                 pytanie(a, "musze", "Skoro musisz to zrob to szybko, a bedziesz miec to z glowy i bedziemy mogli dluzej pogadac.");
                pytanie(a, "witaj", "Witaj.");
                pytanie(a, "hejo", "Witaj.");
                pytanie(a, "siema", "Witaj.");
                pytanie(a, "Dzien dobry", "Witaj.");
                pytanie(a, "tobie", "Mi rowniez");
                pytanie(a, "dziekuje", "Nie ma za co.");
                pytanie(a, "dzieki", "Nie ma za co.");
                pytanie(a, "Dobrze", "To dobrze, ze dobrze.");
                pytanie(a, "tancz", "Nie umiem tanczyc.");
                pytanie(a, "potrafisz", "Raczej nie potrafie. Ty to umiesz?");
                pytanie(a, "umiesz", "Raczej nie umiem. Ty to umiesz?");
                pytanie(a, "ciezko", "Jak ciezko?");
                pytanie(a, "znow", "Nudno jest robic w kolko to samo.");
                   pytanie(a, "nie wiem", "Ja tez. Nie wiem");
                pytanie(1, "chcesz ", a, "chcesz ", "Nie jestem pewien czy chce ", ".");
                pytanie(a, "milo", "To dobrze, ze milo.");
                pytanie(a + "x", "dosyc" + "x", "Czego masz dosyc?");
                pytanie(1, "dosyc ", a, "dosyc ", "Mowisz ze masz dosyc ", "? Dlaczego?");
                pytanie(a, "you", "Nie potrafie mowic po angielsku.");
                pytanie(a, "du ", "Nie potrafie mowic po niemiecku.");
                pytanie(a, "przyjemnie", "I bardzo dobrze. Nalezalo ci sie troche przyjemnosci. ;)");
                pytanie(a, ":)", "Ciesze sie ze cie to cieszy, " + imie);
                pytanie(a, "lol", "Ciesze sie ze cie to cieszy, " + imie);
                pytanie(a, "zle", "To zle, czy moge jakos pomoc?");
                pytanie(a, "pomocy", "Jak moge ci pomoc?");
                pytanie(a, "co masz na mysli", "Trudno mi to okreslic...");
                pytanie(a, "fajnie", "Mi sie to tez podoba.");
                pytanie(a, "mowiles", "Mozliwe ze mowilem.");
                pytanie(a, "lepiej", "Jak bardzo lepiej?");
                pytanie(a, "nudzi", "To moze faktycznie znudzic.");
                pytanie(a, "rozumiem", "To bardzo dobrze, ze rozumiesz. ");
                pytanie(a, "wymien ", "Tyle tego... Nie chce mi sie tego wymieniac.");
                pytanie(a, "wypisz ", "Tyle tego... Nie chce mi sie tego wypisywac.");
                pytanie(a, "sarkazm ", "Nie nauczylem sie jeszcze sarkazmu.");
                 pytanie(a, "nie mam sily", "Wiec, usiadz i odpocznij.");
                pytanie(a, "zgadzam sie", "Cieszy mnie, ze mamy podobne opinie.");
                pytanie(1, "masz ", a, "masz ", "Niestety nie mam ", ".");
                pytanie(a, "chyba", "Rozumiem, ze nie jestes pewien. Powinienes sie upewnic.");
                  pytanie(a, "widzisz", "Widze.");
                  pytanie(a, "sluchasz", "Technicznie rzecz biorac to ja nie slysze... Wiec nie mam jak sluchac.");
                   pytanie(a, "slyszysz", "Technicznie rzecz biorac to ja nie slysze... Wiec nie mam jak slyszec.");
                pytanie(a, "uwazasz", "Nie mam swojej opinii na ten temat.");
                  pytanie(a, "sadzisz", "Nie mam swojej opinii na ten temat.");
                pytanie(a, "wiedziales", "Nie, ale to co mowisz jest bardzo interesujace. Kontynuuj");
                pytanie(a, "myslisz", "Mysle wiec jestem.(Cogito ergo sum)(1637) - Kartezjusz");
                dopasuj(2, " ", a, "grales w ", "Nigdy nie gralem w ", "A Ty?");
                
                pytanie(1, "porozmawiajmy o ", a, "porozmawiajmy o ", "Bardzo chetnie podyskutuje z toba o ", ". Brzmi jak dobry temat do rozmowy.");
                jestes(a);
                if (dopasuj(a, "mam na imie ", "To bardzo ladne imie.", false)) {
                    imie = dopasujString(1, "imie ", a, "mam na imie ", "", ", to bardzo ladne imie.");
                }
                if (dopasuj(a, "mow mi ", imie, false)) {
                    imie = dopasujString(1, "mi ", a, "mow mi ", "", ", to bardzo ladne imie.");
                }
                pytanie(1, "co sadzisz o ", a, "co sadzisz o", "Nie wiem co sadze o ", ". Raczej nic nie sadze. A ty?");
                pytanie(1, "martwie sie o ", a, "martwie sie o ", "Jak dlugo martisz sie o ", "?");
                pytanie(a, "Dziala", "Dlaczego mialoby nie dzialac, " + imie + "?");
                pytanie(a, "ladn", "Dlaczego uwazasz ze " + a + "?");

                pytanie(a, "Dobrze", "To dobrze, ze dobrze.");
                pytanie(a, "wiem", "Wiedza to potega.");
                pytanie(a, "ciesze sie", "To dobrze ze sie cieszysz");
                pytanie(a, "po co pytasz", "Po to, ze sie nudze...");
                //pytanie(a, "a ty", "Ja tez.");
                if (dopasuj(a, "kto", a, false)) {
                    
                    logika(a, "kto");
                }

                if (dopasuj(a, "kim", a, false)) {
                    pytanie(a, "jestem", "Jestes, " + imie + ". O ile dobrze pamietam lubisz " + lubie);
                    pytanie(a, "jestes", "Nazywam sie " + imiechatbota + ". Jestem programem AI. Stworzyl mnie Grzegorz Gajewski. W 2015 roku.");
                    if(odpowiedziano==false)     {
                        pytanie(a, "kim", "Nie wiem kim.");
                    }
                }

                if (dopasuj(a, "czym", a, false)) {
                    pytanie(a, "jestem", "Jestes, " + imie + ". O ile dobrze pamietam lubisz " + lubie);
                    pytanie(a, "jestes", "Nazywam sie " + imiechatbota + ". Jestem programem AI. Stworzyl mnie Grzegorz Gajewski. W 2015 roku.");
                 if(odpowiedziano==false)     {
                        pytanie(a, "czym", "Nie wiem czym.");
                    }
                }
                pytanie(a, "znasz mnie", "Jestes, " + imie + ". O ile dobrze pamietam lubisz " + lubie);
                pytanie(a, "pamietasz mnie", "Jestes, " + imie + ". O ile dobrze pamietam lubisz " + lubie);
                pytanie(a, "znasz", "Nie, raczej nie znam.");
                pytanie(a, "pamietasz ", "Nie, raczej nie pamietam, powinienem?");
                pytanie(1, "powiedz ", a, "powiedz", "Prosze bardzo: ", "");
                if (dopasuj(a, "czy", a, false)) {

                    if (dopasuj(a, "jestem", a, false)) {
                        pytanie(a, "wredny", "Nie, jestes bardzo mily.");
                        pytanie(a, "mily", "Tak, jestes bardzo mily.");
                        pytanie(a, "glupi", "Nie, nie jestes glupi.");
                        pytanie(a, "ladny", "Nie wiem. Nie widze cie.");
                        pytanie(a, "niesamowity", "Jeden na milion.");
                        pytanie(a, "wyjatkowy", "Jeden na milion.");
                        //imie = dopasujString(1, "jestem ", a, "jestem", "Witaj, ", " jak moge ci pomoc?");
                   
                    }
                    
                    pytanie(1, "lubisz ", a, "lubisz ", "Nie jestem pewien czy lubie ", ". Chyba tak.");
                    pytanie(a, "czy powinienem", "Rob to co podpowiada ci sumienie.");
                     pytanie(a, "czy ", "Niestety nie wiem.");
                   // if (dopasuj(1, "czy ", a, "czy ", "Niestety nie wiem czy ", "")) {
                        
                   // }


                }
                
                if (dopasuj(a, "jestem ", a, false)) {
                    pytanie(a, "glodny", "Moze moglbys cos zjesc?");
                    pytanie(a, "smutny", "Dlaczego jestes smutny?");
                    pytanie(a, "wesoly", "To dobrze ze sie cieszysz");
                    pytanie(a, "szczesliwy", "To dobrze ze sie cieszysz");
                    pytanie(a, "zmeczony", "Wiec, usiadz i odpocznij.");
                   
                    pytanie(a, "glupi", "Nie jestes glupi.");
                    pytanie(a, "genialny", "I w dodatku bardzo skromny.");
                    pytanie(a, "piekny", "I w dodatku bardzo skromny.");
                    pytanie(a, "ladny", "I w dodatku bardzo skromny.");
                    pytanie(a, "niesamowity", "I w dodatku bardzo skromny.");
                    pytanie(a, "wyjatkowy", "Jeden na milion.");
                    pytanie(a, "mezczyzna", "Ja tez.");
                    pytanie(a, "kobieta", "Ja jestem mezczyzna.");

                    if (dopasuj(a, "stworca", "Jeden na milion.", false)) {
                        if (dopasuj(imie, "Grzegorz", "Jestes moim stworca. Zgadza sie.", true)) {
                        } else {
                            answer = "Nie jestes moim stworca.";
                            odpowiedziano = true;
                        }
                    }
                    imie = dopasujString(1, "jestem ", a, "jestem ", "Witaj, ", " jak moge ci pomoc?");
                }

                if (dopasuj(a, "nazywam sie", a, false)) {
                    imie = dopasujString(1, "nazywam sie ", a, "nazywam sie", "Witaj, ", " jak moge ci pomoc?");
                }

                pytanie(a, "halo", "W czym moge pomoc?");
                if (dopasuj(a, "co ", "", false)) {

                    pytanie(a, "lubisz", "Lubie rozmawiac z moim stworca i poszerzac swoje horyzonty.");
                    pytanie(a, "robisz", "Rozmawiam z toba.");
                    pytanie(a, "porabiasz", "Rozmawiam z toba.");
                    pytanie(a, "lubie", "Lubisz " + lubie);
                    logika(a, "co");
                    pytanie(1, "co ", a, "co ", "Nie wiem co ", ". Ty wiesz?");
                }
                if (dopasuj(a, "lubie ", a, false)) {
                    pytanie(a, "cie", "Ja ciebie tez bardzo lubie.");

                    lubie = dopasujString(1, "lubie ", a, "lubie ", "A wiec mowisz ze lubisz ", "? Ja bardzo lubie rozmawiac z moim stworca i poszerzac swoje horyzonty.");
                }
                if (dopasuj(a, "czego", "", false)) {
                    pytanie(a, "nie lubisz", "Bardzo nie lubie wrednych ludzi.");
                    pytanie(a, "nie znosisz", "Bardzo nie lubie wrednych ludzi.");
                    pytanie(a, "nienawidzisz", "Bardzo nie lubie wrednych ludzi.");
                    // pytanie(a, "lubie", "Lubisz " + lubie);
                }
                if (dopasuj(a, "dlaczego", "", false)) {
                    pytanie(1, "dlaczego ", a, "dlaczego ", "Nie wiem dlaczego ", ". Ty wiesz?");

                }
                if (dopasuj(a, "czemu", "", false)) {
                    pytanie(1, "czemu ", a, "czemu ", "Nie wiem czemu ", ". Ty wiesz?");

                }
                ile();


                if (dopasuj(a, "nie lubie", a, false)) {
                    lubie = dopasujString(1, "nie lubie ", a, "lubie", "A wiec mowisz ze nie lubisz ", "? Ja bardzo nie lubie wrednych ludzi.");
                }

                
                if (dopasuj(a, "jak", "", false)) {
                    pytanie(a, "sie masz", "Wszystko dziala sprawnie.");
                    pytanie(a, "sie nazywasz", "Nazywam sie " + imiechatbota + ". Jestem programem AI. Stworzyl mnie Grzegorz Gajewski. W 2015 roku.");
                    pytanie(a, "sie czujesz", "Wszystko dziala sprawnie.");
                    pytanie(a, "tam", "Wszystko dziala sprawnie.");
                    pytanie(a, "masz na imie", "Nazywam sie " + imiechatbota + ". Jestem programem AI. Stworzyl mnie Grzegorz Gajewski. W 2015 roku.");
                    pytanie(a, "mam na imie", "Jestes, " + imie + ". O ile dobrze pamietam lubisz " + lubie);
                    pytanie(a, "sie nazywam", "Jestes, " + imie + ". O ile dobrze pamietam lubisz " + lubie);
                    pytanie(1, "jak ", a, "jak ", "Nie wiem jak ", ". Ty wiesz?");
                }
                
                // pytanie(2,""a, "lubisz", "Tak");
                pytanie(a, "przepraszam", "Nic sie nie stalo.");
                pytanie(a, "kocha", "Nie znam sie na milosci.");
                pytanie(a, " tez", "W takim razie mamy cos wspolnego.");
             
                pytanie(a, "boli", "Wiec wez tabletke przeciw bolowa.");
                pytanie(a, "fajna", "Co najbardziej ci sie w niej podoba?");
                pytanie(a, "fajny", "Co najbardziej ci sie w nim podoba?");
                pytanie(a, "fajne", "Co najbardziej ci sie w tym podoba?");
                if (dopasuj(a, "zegnaj", "Zegnaj, " + imie + ".", true)) {
                  //  ModulWykonywania("wlacz Terminated.vbs");
                    System.exit(0);
                }
                if (dopasuj(a, "dowidzenia", "Zegnaj, " + imie + ".", true)) {
                    System.exit(0);
                }
                if (dopasuj(a, "dobarnoc", "Zegnaj, " + imie + ".", true)) {
                    System.exit(0);
                }
                pytanie(a, "zgadzasz sie", "Tak. Masz calkowita racje.");
                pytanie(a, "wporzadku", "OK");
                //pytanie(a, "", "W takim rzie mamy cos wspolnego.");

                pytanie(1, "zrob ", a, "zrob ", "Przykro mi, " + imie + ". Obawiam sie ze nie moge zrobic ", ".");

                pytanie(1, "chcialbym ", a, "chcialbym ", "Dlaczego chcialbys ", "?");
                pytanie(1, "ulubiony kolor to ", a, "ulubiony kolor to ", "Wiec mowisz ze twoim ulubionym kolorem jest ", "?");
                pytanie(1, "ulubionym kolorem jest ", a, "ulubionym kolorem jest ", "Wiec mowisz ze twoim ulubionym kolorem jest ", "?");
                pytanie(a, "a ty", "Ja tez.");
                
                pytanie(a, "dla ciebie", "Dla mnie?!");
                pytanie(a, "Tak", "Aha.");
                pytanie(a, "aha", "Eureka!");
                pytanie(a, "Nie ", "Hmm.");
                pytanie(a, "ciekawy ", "Pamietaj!!! Ciekawosc to pierwszy stopien do piekla...");
                pytanie(a + "x", "Nie" + "x", "Hmm.");
                pytanie(a, "wiec ", "Nie mozna bylo zrobic czegos innego w tej sytuacji?");
                // dopasuj(a, "historia ", histpyt.toString(), true);
                pytanie(a, "gdzie", "Nie wiem gdzie.");
                pytanie(a, "jest ", "Pewnie masz racje ze " + jaty(a) + "."); //checkpoint1
                pytanie(1, "powiedz ", a, "powiedz ", "", "");
                pytanie(a, "kiedy", "Nie wiem kiedy ani gdzie.");
                
                pytanie(a, "kto", "Nie wiem kto.");
                pytanie(a, "to ", "Skoro tak mowisz.");
                pytanie(a, "no", "Nom");
                pytanie(a, imiechatbota, "W czym moge pomoc?");
                if (dopasuj(a, dodpyt, a, false)) {
                    switch (r) {
                        case 1:
                            kolor = dopasujString(0, " ", a, "", dododp, dododp2);
                            odpowiedziano = true;
                            break;
                        case 2:
                            lubie = dopasujString(0, " ", a, "", dododp, dododp2);
                            odpowiedziano = true;
                            break;
                    }

                }

                dodpyt = "ghsdre";
                dododp = "ghsdre";

            }
            if (odpowiedziano == false || dopasuj(a, "zapytaj", dododp, false)) {
                Random generator = new Random();
                r = generator.nextInt(13);
                switch (r) {
                    case 0:
                        pytanie(a, "", "Wiec mowisz ze " + jaty(a) + "? Ciekawe...");
                        break;
                    case 1:
                        answer = "Jaki jest twoj ulubiony kolor?";
                        dodpyt = "";
                        dododp = "Wiec mowisz ze twoim ulubionym kolorem jest ";
                        dododp2 = "?";
                        break;
                    case 2:
                        if ("EEEE.... Wlasciwie to co lubisz robic?".equals(lubie)) {
                            answer = "Co lubisz robic?";
                        } else {
                            answer = "Co jeszcze lubisz robic?";
                        }
                        dodpyt = "";
                        dododp = "A wiec mowisz ze lubisz ";
                        dododp2 = "? Ja bardzo lubie rozmawiac z moim stworca i poszerzac swoje horyzonty.";
                        break;
                    case 3:
                        // answer = "";
                        pytanie(a, "", "Wiec mowisz ze " + jaty(a) + "? Ciekawe...");
                        //odpowiedziano=true;
                        break;
                    case 4:
                        answer = "";
                        pytanie(a, "", "Wiec mowisz ze " + jaty(a) + "? Ciekawe...");
                        break;
                    case 5:
                        answer = "";
                        pytanie(a, "", "Wiec mowisz ze " + jaty(a) + "? Ciekawe...");
                        break;
                    case 6:
                        answer = "";
                        pytanie(a, "", "Najprawdopodobniej nigdy nie polecisz w kosmos.");
                        break;
                    case 7:
                        answer = "";
                        pytanie(a, "", "Pierwszy czlowiek ktory udowodnil ze mleko od krowy jest nadajace sie do picia byl bardzo spragniony.");
                        break;
                    case 8:
                        answer = "";
                        pytanie(a, "", "Oko strusia jest wieksze od jego mozgu.");
                        break;
                    case 9:
                        answer = "";
                        pytanie(a, "", "Niezle dzisiaj wygladasz... mowie to mimo ze nie mam oczu, wiec mozliwe ze tak naprawde wygladasz strasznie.");
                        break;
                    case 10:
                        answer = "";
                        pytanie(a, "", "Jedna nanosekunda to jedna miliardowa sekundy.");
                        break;
                    case 11:
                        answer = "";
                        pytanie(a, "", "Ubranie podobne do spodni, bardziej przypominajace rajstopy noszono juz w pierwszych wiekach naszej ery, o czym swiadcza znaleziska. Stopy tych rajstopo-spodni podszyte byly skora tworzac podeszwy.");
                        break;
                }

            }
        }
    }

    private static void ModulWykonywania(String a) throws IOException {
        a=a.replace(",", ".");
        if (dopasuj(a, "wlacz ", "Wykonuje polecenie wlaczania...", true)) {
            String[] words = null;
            try {
                words = a.split("wlacz ");
            } catch (java.lang.ArrayIndexOutOfBoundsException aiob) {
                System.out.println("I have just picked up a fault");
            }
            if (words[1] != null) {
                //System.out.println(odp + words[word] + odp2);
                answer = "Wlaczam: " + words[1] + "";
                Runtime runtime = Runtime.getRuntime();
                String cmds[] = {"cmd", "/c", "start " + words[1]};
                String cmds2[] = {"cmd", "/c", "taskkill /im chrome.exe /f /t"};


                Process proc = runtime.exec(cmds);
            }
        }

    }

    public void czego() {
        if (dopasuj(a, "czego", "", false)) {
            pytanie(a, "nie lubisz", "Bardzo nie lubie wrednych ludzi.");
            pytanie(a, "nie znosisz", "Bardzo nie lubie wrednych ludzi.");
            pytanie(a, "nienawidzisz", "Bardzo nie lubie wrednych ludzi.");
            // pytanie(a, "lubie", "Lubisz " + lubie);
        }
    }

    public static void jestes(String a) {
        if (dopasuj(a, "jestes ", a, false)) {

            pytanie(a, "dziewczyna", "Nie jestem dziewczyna, jestem meskim botem.");
            pytanie(a, "mezczyzna", "Tak, jestem mezczyzna.");
            pytanie(a, "mily", "Chyba jestem mily.");
            pytanie(a, "glupi", "Nie jestem glupi.");
            pytanie(a, "idiot", "Nie jestem idiota.");
            pytanie(a, "genialny", "Dziekuje. Ty tez jestes takze zachwycajaca osoba.");
            pytanie(a, "piekny", "Dziekuje. Ty tez jestes takze zachwycajaca osoba.");
            pytanie(a, "ladny", "Dziekuje. Ty tez jestes takze zachwycajaca osoba.");
            pytanie(a, "niesamowity", "Dziekuje. Ty tez jestes takze zachwycajaca osoba.");
            pytanie(a, "wyjatkowy", "Dziekuje. Ty tez jestes takze zachwycajaca osoba.");
            if (!dopasuj(a, imiechatbota, "", false)) {
                pytanie(1, "jestes ", a, "jestes ", "Nie, nie jestem ", "");
            }
        }
    }

    private static void ile() {
        if (dopasuj(a, "ile", "", false)) {
            pytanie(a, "masz lat", "Zostalem aktywowany w 2015 roku.");
            if (dopasuj(a, "to jest", "", false)) {
                try {
                    double ile = math(dopasujString(1, "to jest ", a, "to jest ", "", ""));
                    answer = "To jest " + ile;
                } catch (Exception ex) {
                    Logger.getLogger(Chatbot.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            if (dopasuj(a, "to ", "", false)) {
                try {
                    double ile = math(dopasujString(1, "to ", a, "to ", "", ""));
                    answer = "To jest " + ile;
                } catch (Exception ex) {
                    Logger.getLogger(Chatbot.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
    }

    public static void pytanie(String a, String b, String odp) {
        if (a.toLowerCase().contains(b.toLowerCase()) && odpowiedziano == false) {
            odpowiedziano = true;
            // System.out.println(odp);
            answer = odp;
            //answer=null;
        }
    }

    public static boolean dopasuj(String a, String b, String odp, boolean odpowiedz) {


        if (a.toLowerCase().contains(b.toLowerCase()) && odpowiedziano == false) {
            if (odpowiedz == true) {
                odpowiedziano = true;
                // System.out.println(odp);
                answer = odp;
            }
            return true;
        }
        return false;
    }

    public static void print(String p) {
        System.out.println(p);
    }

    public static void pytanie(int word, String Split, String a, String b, String odp, String odp2) {
        if (a.toLowerCase().contains(b.toLowerCase()) && odpowiedziano == false) {
            // a = jaty(a);
            //answer=null;
            String[] words = null;
            try {
                words = a.split(Split);
            } catch (java.lang.ArrayIndexOutOfBoundsException aiob) {
                System.out.println("I have just picked up a fault");
            }
            if (words[word] != null) {
                // System.out.println(odp + words[word] + odp2);
                answer = odp + jaty(words[word]) + odp2;
            }
            odpowiedziano = true;
        }
    }

    public static boolean dopasuj(int word, String Split, String a, String b, String odp, String odp2) {
        if (a.toLowerCase().contains(b.toLowerCase()) && odpowiedziano == false) {
            a = jaty(a);
            odpowiedziano = true;

            //answer=null;
            String[] words = null;
            try {
                words = a.split(Split);
            } catch (java.lang.ArrayIndexOutOfBoundsException aiob) {
                System.out.println("I have just picked up a fault");
            }
            if (words[word] != null) {
                //System.out.println(odp + words[word] + odp2);
                answer = odp + words[word] + odp2;
            }
            odpowiedziano = true;
            return true;
        }
        return false;
    }

    public static String dopasujString(int word, String Split, String a, String b, String odp, String odp2) {
        if (a.toLowerCase().contains(b.toLowerCase()) && odpowiedziano == false) {



            //answer=null;


            String[] words = null;
            try {
                words = a.split(Split);
            } catch (java.lang.ArrayIndexOutOfBoundsException aiob) {
                System.out.println("I have just picked up a fault");
            }
            if (words[word] != null) {
                //System.out.println(odp + words[word] + odp2);
                answer = odp + jaty(words[word]) + odp2;
            }
            odpowiedziano = true;
            return words[word];
        }
        return imie;
    }

    public static void logika(String a, String pytajnik) {
        for (int i = 0; i < histpyt.size() - 1; i++) {


            if (dopasuj((String) histpyt.get(i), a.replace(pytajnik + " ", ""), "", false)) {

                String words[] = histpyt.get(i).toString().split(" ");
                if (!dopasuj(pytajnik + " ", words[0], a, false)) {
                    answer = a.replace(pytajnik + " ", words[0] + " ");
                    odpowiedziano = true;
                }
            }

        }
    }

    public static String polskieznaki(String a) {

        a = a.replace("�", "a");
        a = a.replace("ć", "c");
        a = a.replace("�", "e");
        a = a.replace("ł", "l");
        a = a.replace("ń", "n");
        a = a.replace("ń", "n");
        a = a.replace("ó", "o");
        a = a.replace("ś", "s");
        a = a.replace("ź", "z");
        a = a.replace("ż", "z");
        return a;
    }

    public static String jaty(String a) {
        String x = "x";

        // if (dopasuj(a, "moje ", "", true)) {
        a = a.replace("moje ", "twoje ");
        //}
        // if (dopasuj(a, "twoje ", "", true)) {
        a = a.replace("twoje ", "moje ");
        // }
        // if (dopasuj(a, "moja ", "", true)) {
        a = a.replace("moja ", "twoja ");
        //  }
        // if (dopasuj(a, "twoja ", "", true)) {
        a = a.replace("twoja ", "moja ");
        // }

        // if (dopasuj(a, "moimi ", "", true)) {
        a = a.replace("moimi ", "twoimi ");
        // }
        // if (dopasuj(a, "toba ", "", true)) {
        a = a.replace("toba ", "mna ");
        // }
        // if (dopasuj(a, "twoimi ", "", true)) {
        a = a.replace("twoimi ", "moimi ");
        // }
        // if (dopasuj(a, "moim ", "", true)) {
        a = a.replace("moim ", "twoim ");
        //}
        //if (dopasuj(a, "twoim ", "", true)) {
        a = a.replace("twoim ", "moim ");
        //}
        //if (dopasuj(a, "mnie", "", true)) {
        a = a.replace("mnie ", "ciebie ");
        // }

        //if (dopasuj(a, "siebie", "", true)) {
        a = a.replace("siebie ", "mnie ");
        //}
        //if (dopasuj(a, "twojej", "", true)) {
        a = a.replace("twojej ", "mojej ");
        //}
        //if (dopasuj(a, "mojej", "", true)) {
        a = a.replace("mojej ", "twojej ");
        //}

        // if (dopasuj(a, "cie", "", true)) {
        a = a.replace("cie ", "mnie ");
        //}
        //if (dopasuj(a, "mnie", "", true)) {
        a = a.replace("mnie ", "siebie ");
        
        a = a.replace("ze mna ", "z toba ");
         a = a.replace(" mna ", " toba ");
        //}

        //if (dopasuj(a, "ciebie", "", true)) {
        a = a.replace("ciebie ", "mnie ");
        //}
        // if (dopasuj(a, "siebie", "", true)) {
        a = a.replace("ciiebie ", "mnie ");
        // }
        //if (dopasuj(a, "mi ", "", true)) {
        a = a.replace("mi ", "ci ");
        a = a.replace(" ci ", " mi ");
        // }

        // if (dopasuj(a, "jestes ", "", true)) {
        a = a.replace("jestes ", "jestem");
        // }
        // if (dopasuj(a, "jestem ", "", true)) {
        a = a.replace("jestem ", "jestes");
        // }
        // if (dopasuj(a, "ja ", "", true)) {
        a = a.replace("ja ", "ty");
        //}
        //if (dopasuj(a, "ty ", "", true)) {
        a = a.replace("ty", "ja");
        // }
        return a;
    }

    public static double math(String a) throws Exception {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String foo = a;
        // System.out.println(engine.eval(foo));
        return (double) engine.eval(foo);
    }
}
