package TorBrowserDzen;


import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class rename {

            static void operator( String url)  throws IOException {
                Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\Tor Browser\\Browser\\firefox.exe");
                System.setProperty("webdriver.gecko.driver", "C:\\Utility\\BrowserDrivers\\geckodriver.exe");
                FirefoxOptions options = new FirefoxOptions();
                options.setBinary("C:\\Users\\user\\Desktop\\Tor Browser\\Browser\\firefox.exe");
                FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\user\\Desktop\\Tor Browser\\Browser\\TorBrowser\\Data\\Browser\\profile.default"));
                profile.setPreference("network.proxy.type", 1);
                profile.setPreference("network.proxy.socks", "127.0.0.1");
                profile.setPreference("network.proxy.socks_port", 9050);
                profile.setPreference("network.proxy.socks_remote_dns", "False");
                options.setProfile(profile);
                WebDriver driver = new FirefoxDriver(options);
                driver.get(url);
            }






            public static void main(String[] args) throws IOException {
            int a = 1;
            String url = "https://zen.yandex.ru/media/id/5ee11af1947433623f5e212c/rynki-obescaiut-burnyi-rost-na-nedele-5ee84a3ec64be97c15fe95df";
            while(a == 1){operator(url);}
        }





            /*String pathToTor = "C:\\Users\\user\\Desktop\\Tor Browser\\Browser\\firefox.exe"; //путь к браузеру
            String link = "http:\\stackoverflow.com\\"; //ссылка
            String request = String.format("%s %s", pathToTor, link);
            Runtime runtime = Runtime.getRuntime();
            runtime.exec(request);*/
        }





