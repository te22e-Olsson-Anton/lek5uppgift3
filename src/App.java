import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner tb = new Scanner(System.in);

        String[] rum = 
        {
            "Du står framför ett övergivet hus, regnet öser ner. Tryck på ENTER för att gå in i huset.",
            "Du står i hallen. Ett kyligt drag sveper genom rummet. Tryck ENTER för att gå in i köket.",
            "Du är i köket. Skåpdörrarna skramlar och en kylig hand vidrör din axel. Tryck ENTER för att gå till sovrummet.",
            "Du är i sovrummet. En skugga rör sig i hörnet av ögat, och en kuslig sång ekar i ditt huvud. Tryck ENTER för att gå ner till källaren.",
            "Du är i källaren... Det står en man med ryggen vänt mot dig... Han vänder sig långsamt och avlossar ett skott"
        };

        int steg = 0;

        while (steg < rum.length)
        {
            System.out.println(rum[steg]);
            String text = tb.nextLine();
            System.out.println(text);
            steg++;

        }

        tb.close();

        System.out.println("RIP");
    }
}