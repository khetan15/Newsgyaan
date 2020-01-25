/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsgyan;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.Jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;




/**
 *
 * @author AAKANKSHA KHETAN
 */
public class Crawler {
    public static void main(String args[])
            {
        try {
           Document doc = Jsoup.connect("http://www.jsoup.org/").get();
            org.jsoup.select.Elements links= doc.select("a");
            for(Element e:links)
                {
                System.out.println(e.attr("abs:href"));
            }
                
        } catch (IOException ex) {
            Logger.getLogger(Crawler.class.getName()).log(Level.SEVERE, null, ex);
        } 
     
        

}
}

