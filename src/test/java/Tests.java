import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Tests {
    private static final String SELECTOR_H1 = ".title-pattern > h1";
    private WebDriver webdriver = null;
    private String title;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
    }

    @Test(priority=0)
    public void MainMenu() throws InterruptedException {
        webdriver.navigate().to("https://gbh.com.do/");
        //------------------------------ Main Menu -------------------------------------------
        webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webdriver.findElement(By.tagName("body")).click();
        //------------------------------Prueba inicio------------------------------------------
        webdriver.findElement(By.id("menu-item-21")).click();
        webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

        @Test (priority=1)
        public void Portafolio() throws InterruptedException {
            webdriver.navigate().to("https://gbh.com.do/");
            webdriver.findElement(By.id("menu-item-62")).click();
            title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
            Assert.assertEquals(title, "NUESTRO PORTAFOLIO");
        }
    @Test(priority=2)
    public void servicioAsesoria() throws InterruptedException {
        webdriver.navigate().to("https://gbh.com.do/");
        //ASESORÍA DE INTERFAZ Y EXPERIENCIA DE USUARIO (UI/UX)
        Actions action = new Actions(webdriver);
        WebElement we = webdriver.findElement(By.id("menu-item-209"));
        action.moveToElement(we).moveToElement(webdriver.findElement(By.cssSelector("#menu-item-2642 > a"))).click().build().perform();
        title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
        Assert.assertEquals(title, "ASESORÍA DE INTERFAZ Y EXPERIENCIA DE USUARIO (UI/UX)");
        webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
        @Test(priority=3)
        public void servicioDesarrollo() throws InterruptedException {
            //DESARROLLO DE SOFTWARE
            webdriver.navigate().to("https://gbh.com.do/");
            Actions action = new Actions(webdriver);
            WebElement we = webdriver.findElement(By.id("menu-item-209"));
            action.moveToElement(we).moveToElement(webdriver.findElement(By.cssSelector("#menu-item-2976 > a"))).click().build().perform();
            title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
            Assert.assertEquals(title, "DESARROLLO DE SOFTWARE");
            webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @Test(priority=4)
        public void servicioDiseno() throws InterruptedException {
        //DISEÑO DE PÁGINAS WEB
        webdriver.navigate().to("https://gbh.com.do/");
        Actions action = new Actions(webdriver);
        WebElement we = webdriver.findElement(By.id("menu-item-209"));
        action.moveToElement(we).moveToElement(webdriver.findElement(By.cssSelector("#menu-item-226 > a"))).click().build().perform();
        title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
        Assert.assertEquals(title,"DISEÑO DE PÁGINAS WEB");
    }

    @Test(priority=5)
    public void servicioManejo() throws InterruptedException {
        //MANEJO DE REDES SOCIALES PARA EMPRESAS
        webdriver.navigate().to("https://gbh.com.do/");
        Actions action = new Actions(webdriver);
        WebElement we = webdriver.findElement(By.id("menu-item-209"));
        action.moveToElement(we).moveToElement(webdriver.findElement(By.cssSelector("#menu-item-2895 > a"))).click().build().perform();
        title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
        webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(title,"MANEJO DE REDES SOCIALES PARA EMPRESAS");
    }

    @Test(priority=6)
    public void servicioConsultoria() throws InterruptedException {
        //¿QUÉ ES UNA ESTRATEGIA WEB?
        webdriver.navigate().to("https://gbh.com.do/");
        Actions action = new Actions(webdriver);
        WebElement we = webdriver.findElement(By.id("menu-item-209"));
        action.moveToElement(we).moveToElement(webdriver.findElement(By.cssSelector("#menu-item-1998 > a"))).click().build().perform();
        title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
        Assert.assertEquals(title,"¿QUÉ ES UNA ESTRATEGIA WEB?");
    }

    @Test(priority=7)
    public void servicioSeo() throws InterruptedException {
        //SEO (OPTIMIZACIÓN EN MOTORES DE BÚSQUEDA)
        webdriver.navigate().to("https://gbh.com.do/");
        Actions action = new Actions(webdriver);
        WebElement we = webdriver.findElement(By.id("menu-item-209"));
        action.moveToElement(we).moveToElement(webdriver.findElement(By.cssSelector("#menu-item-227 > a"))).click().build().perform();
        title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
        Assert.assertEquals(title,"SEO (OPTIMIZACIÓN EN MOTORES DE BÚSQUEDA)");
    }
    @Test(priority=8)
    public void servicioMantenimiento() throws InterruptedException {
        //MANTENIMIENTO PREVENTIVO  Y CORRECTIVO DE COMPUTADORAS EN REPÚBLICA DOMINICANA
        webdriver.navigate().to("https://gbh.com.do/");
        Actions action = new Actions(webdriver);
        WebElement we = webdriver.findElement(By.id("menu-item-209"));
        action.moveToElement(we).moveToElement(webdriver.findElement(By.cssSelector("#menu-item-361 > a"))).click().build().perform();
        title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
        Assert.assertEquals(title,"MANTENIMIENTO PREVENTIVO  Y CORRECTIVO DE COMPUTADORAS EN REPÚBLICA DOMINICANA");
    }
    @Test(priority=9)
    public void servicioEvaluacion() throws InterruptedException {
        //EVALUACIÓN DE INFRAESTRUCTURA (IT)
        webdriver.navigate().to("https://gbh.com.do/");
        Actions action = new Actions(webdriver);
        WebElement we = webdriver.findElement(By.id("menu-item-209"));
        action.moveToElement(we).moveToElement(webdriver.findElement(By.cssSelector("#menu-item-392 > a"))).click().build().perform();
        title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
        Assert.assertEquals(title,"EVALUACIÓN DE INFRAESTRUCTURA (IT)");
    }
    @Test(priority=10)
    public void servicioConfiguracion() throws InterruptedException {
        //CONFIGURACIÓN DE RESPALDO
        webdriver.navigate().to("https://gbh.com.do/");
        Actions action = new Actions(webdriver);
        WebElement we = webdriver.findElement(By.id("menu-item-209"));
        action.moveToElement(we).moveToElement(webdriver.findElement(By.cssSelector("#menu-item-360 > a"))).click().build().perform();
        title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
        Assert.assertEquals(title,"CONFIGURACIÓN DE RESPALDO");
    }
    @Test(priority=11)
    public void servicioInstalacion() throws InterruptedException {
        //INSTALACIÓN DE CABLEADO ESTRUCTURADO
        webdriver.navigate().to("https://gbh.com.do/");
        Actions action = new Actions(webdriver);
        WebElement we = webdriver.findElement(By.id("menu-item-209"));
        action.moveToElement(we).moveToElement(webdriver.findElement(By.cssSelector("#menu-item-357 > a"))).click().build().perform();
        title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
        Assert.assertEquals(title, "INSTALACIÓN DE CABLEADO ESTRUCTURADO");
    }
    @Test(priority=12)
    public void servicioInstaConf() throws InterruptedException {
        //INSTALACIÓN Y CONFIGURACIÓN DE REDES WI-FI
        webdriver.navigate().to("https://gbh.com.do/");
        Actions action = new Actions(webdriver);
        WebElement we = webdriver.findElement(By.id("menu-item-209"));
        action.moveToElement(we).moveToElement(webdriver.findElement(By.cssSelector("#menu-item-358 > a"))).click().build().perform();
        title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
        Assert.assertEquals(title,"INSTALACIÓN Y CONFIGURACIÓN DE REDES WI-FI");
    }
    @Test(priority=13)
    public void servicioCertificacion() throws InterruptedException {
        //CERTIFICACIÓN DE CABLEADO ESTRUCTURADO
        webdriver.navigate().to("https://gbh.com.do/");
        Actions action = new Actions(webdriver);
        WebElement we = webdriver.findElement(By.id("menu-item-209"));
        action.moveToElement(we).moveToElement(webdriver.findElement(By.cssSelector("#menu-item-356 > a"))).click().build().perform();
        title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
        Assert.assertEquals(title,"CERTIFICACIÓN DE CABLEADO ESTRUCTURADO");
    }
    @Test(priority=14)
    public void conocenos() throws InterruptedException {
        webdriver.navigate().to("https://gbh.com.do/");
        webdriver.findElement(By.id("menu-item-65")).click();
        title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
        Assert.assertEquals(title, "SOLUCIONES GBH");
    }
    @Test(priority=15)
    public void empleos() throws InterruptedException {
        webdriver.navigate().to("https://gbh.com.do/");
        webdriver.findElement(By.id("menu-item-126")).click();
        title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
        Assert.assertEquals(title, "¡ÚNETE AL EQUIPO!");
    }
    @Test(priority=16)
    public void blog() throws InterruptedException {
        webdriver.navigate().to("https://gbh.com.do/");
        webdriver.findElement(By.id("menu-item-20")).click();
        title = webdriver.findElement(By.cssSelector(SELECTOR_H1)).getText();
        Assert.assertEquals(title, "NOTICIAS DE TECNOLOGÍA");
    }


    @AfterClass
    public void Close() throws InterruptedException {
        {
            webdriver.close();
        }
    }

}
