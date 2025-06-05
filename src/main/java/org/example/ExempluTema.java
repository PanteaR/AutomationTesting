package org.example;
import configuration.EdgeDriverConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class ExempluTema {
    public static void main(String[] args) {
        EdgeDriverConfiguration edgeDriverConfiguration = new EdgeDriverConfiguration();
        WebDriver webDriver = edgeDriverConfiguration.getWebDriver();
        webDriver.navigate().to("https://www.anm.ro/");
        WebElement closeNotice = webDriver.findElement(By.id("cn-close-notice"));
        closeNotice.click();
        WebElement medicamenteUzUman = webDriver.findElement(By.linkText("MEDICAMENTE DE UZ UMAN"));
        medicamenteUzUman.click();
        WebElement raporteazaReactieAdversa = webDriver.findElement(By.linkText("Raportează o reacție adversă"));
        raporteazaReactieAdversa.click();
        List<WebElement> intrebariFrecvente = webDriver.findElements(By.cssSelector("span[class='ac_title_class']"));
        for(WebElement intrebari: intrebariFrecvente){
// System.out.println(intrebari.getText());
            for(int i=0; i<intrebariFrecvente.size(); i++){
                if(intrebari.getText().contentEquals("2. Ce este reacţia adversă asociată unui medicament de uz uman?")){
                    System.out.println(intrebari.getText());
                    intrebari.click();
                    break;
                }
            }
        }
        WebElement raporteaza = webDriver.findElement(By.cssSelector("span[class='aligncenter']"));
        List<WebElement> deRaportat = raporteaza.findElements(By.tagName("a"));
        for(WebElement raporteazaOnline:deRaportat){
            if(raporteazaOnline.getDomAttribute("href").equals("https://adr.anm.ro/")){
                raporteazaOnline.click();
                List<WebElement> despreRaportare = webDriver.findElements(By.id("nav"));
// aici noul click(). pagina noua.
                break;
            }
            System.out.println("nu avem acest buton");
        }
        webDriver.getCurrentUrl();
    }
/*List<WebElement> linkuriImagine = webDriver.findElements(By.tagName("img"));
System.out.println(linkuriImagine.size());
for(int i=0; i<linkuriImagine.size(); i++){
try
String nextHref = linkuriImagine.get(i).getDomAttribute("scr");
URL url = new URL(nextHref);
HttpURLConnection connection = (HttpURLConnection) url.openConnection();
connection.setRequestMethod("GET");
connection.connect();
int code = connection.getResponseCode();
if (code == 200){
System.out.println("imagine valida" + nextHref);
linkuriImagine.get(i).click();
}
else{
System.out.println("Imagine invalida" + nextHref);
}
} catch (Exception e) {
System.out.println(e.getMessage());
}
} webDriver.quit();*/
}
