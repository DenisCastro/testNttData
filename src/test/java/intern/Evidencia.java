package intern;


//import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

import static intern.Plugin.pathCenario;

public class Evidencia {
    public static int idEvidencia = 0;
    private static boolean primeiraExecucao = true;
    private static String ultimoPathCenario = "";


    /*public static void diretorioEvidencias(String cenario) {
        try {
            if (primeiraExecucao) {
                primeiraExecucao = false;
                FileUtils.deleteDirectory("src/test/resources/relatorio");
                FileUtils.mkdir("src/test/resources/relatorio/anexos");
            }
            FileUtils.mkdir("src/test/resources/relatorio/evidencias/" + cenario);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }*/

    /*public static void print(WebDriver driver) {
        try {
            if (!ultimoPathCenario.equals(pathCenario)) {
                idEvidencia = 0;
            }
            ultimoPathCenario = pathCenario;
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            idEvidencia++;
            FileUtils.copyFile(screenshot, new File("src/test/resources/relatorio/evidencias/" + pathCenario + "/" + idEvidencia + ".png"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }*/
}
