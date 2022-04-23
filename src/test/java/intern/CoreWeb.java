package intern;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;

import java.util.Calendar;

import static intern.Chrome.createChrome;
import static intern.Chrome.driver;
import static intern.Log.*;
import static intern.Plugin.pathCenario;

public class CoreWeb {

    //protected static final String pathEvidencias = "src/test/resources/relatorio/evidencias/" + pathCenario + "/";

    protected DBConfig dbConfig = new DBConfig();
    protected static long tempoMaximoEsperaBackUp = 30000;
    protected static long tempoMaximoEspera = 30000;
    protected static Throwable throwable = null;
    private static String resultado = "";
    private static boolean existe = false;
    private static boolean ativo = false;


    public static void abrirChrome(String url) {
        String logAbrirChrome = "Criando chrome na url " + url;
        createChrome();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        System.out.println(/*logAzul*/(logAbrirChrome));
        //print(driver);
        //Relatorio.relatorioHTML(logAbrirChrome, pathEvidencias + idEvidencia);
    }

    public static void esperar(int milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void esperarAparecer(String element) {
        tempoMaximoEspera = tempoMaximoEsperaBackUp;
        while (!existe(element) && tempoMaximoEspera >= 0) {
            long tempoInicial = Calendar.getInstance().getTimeInMillis();
            esperar(500);
            long tempoFinal = Calendar.getInstance().getTimeInMillis();
            long tempoGasto = (tempoFinal - tempoInicial);
            tempoMaximoEspera = (tempoMaximoEspera - tempoGasto);
        }
        if (tempoMaximoEspera <= 0 && !existe(element)) {
            String logElementoNaoExibido = "O elemento '" + nomeLogMap.get(element) + "' não foi exibido no tempo maximo de espera";
            System.out.println(logVermelho(logElementoNaoExibido));
            throwable = new NoSuchElementException(element);
            //print(driver);
            //Relatorio.relatorioHTML(logElementoNaoExibido, pathEvidencias + idEvidencia);
            throw new NoSuchElementException(element);
        }
    }

    protected static boolean existe(String elements) {
        long tempoInicial;
        long tempoFinal;
        long tempoGasto;
        while (tempoMaximoEspera >= 0) {
            tempoInicial = Calendar.getInstance().getTimeInMillis();
            try {
                existe = false;
                driver.findElement(By.xpath(elements)).isDisplayed();
                existe = true;
                break;
            } catch (NoSuchElementException e) {
                existe = false;
            }
            tempoFinal = Calendar.getInstance().getTimeInMillis();
            tempoGasto = (tempoFinal - tempoInicial);
            tempoMaximoEspera = (tempoMaximoEspera - tempoGasto);
        }
        return existe;
    }

    protected boolean ativo(String elements) {
        try {
            ativo = driver.findElement(By.xpath(elements)).isEnabled();
            return ativo;
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
            return ativo = false;
        }
    }


    protected void click(String elements) {
        esperarAparecer(elements);
        while (!ativo(elements) && tempoMaximoEspera >= 0) {
            long tempoInicial = Calendar.getInstance().getTimeInMillis();
            esperar(100);
            long tempoFinal = Calendar.getInstance().getTimeInMillis();
            long tempoGasto = (tempoFinal - tempoInicial);
            tempoMaximoEspera = (tempoMaximoEspera - tempoGasto);
        }
        if (ativo(elements) && tempoMaximoEspera >= 0) {
            long tempoInicial = Calendar.getInstance().getTimeInMillis();
            String logClick = "AÇÃO: Clicando no elemento " + nomeLogMap.get(elements);
            try {
                System.out.println(logAzul(logClick));
                driver.findElement(By.xpath(elements)).click();
                //print(driver);
                //Relatorio.relatorioHTML(logClick, pathEvidencias + idEvidencia);
                tempoMaximoEspera = tempoMaximoEsperaBackUp;
            } catch (NoSuchElementException exception) {
                throwable = exception;
                //print(driver);
                //Relatorio.relatorioHTML(logClick, pathEvidencias + idEvidencia);
                System.out.println(logVermelho(exception.getMessage()));
                throw new NoSuchElementException(elements);
            }
            long tempoFinal = Calendar.getInstance().getTimeInMillis();
            long tempoGasto = (tempoFinal - tempoInicial);
            tempoMaximoEspera = (tempoMaximoEspera - tempoGasto);
        } else {
            String logFalhaClick = "AÇÃO: Não foi possivel clicar no elemento " + nomeLogMap.get(elements);
            //print(driver);
            throwable = new ElementNotInteractableException(elements);
            //Relatorio.relatorioHTML(logFalhaClick, pathEvidencias + idEvidencia);
            System.out.println(logVermelho(logFalhaClick));
            throw new ElementNotInteractableException(elements);
        }

    }

    protected void digitar(String elements, String value) {
        esperarAparecer(elements);
        while (!ativo(elements) && tempoMaximoEspera >= 0) {
            long tempoInicial = Calendar.getInstance().getTimeInMillis();
            esperar(100);
            long tempoFinal = Calendar.getInstance().getTimeInMillis();
            long tempoGasto = (tempoFinal - tempoInicial);
            tempoMaximoEspera = (tempoMaximoEspera - tempoGasto);
        }
        if (ativo(elements) && tempoMaximoEspera >= 0) {
            try {
                driver.findElement(By.xpath(elements)).sendKeys(value);
                String logDigitar = "AÇÃO: Enviando o texto '" + value + "' para o campo " + nomeLogMap.get(elements);
                System.out.println(logAzul(logDigitar));
                //print(driver);
                //Relatorio.relatorioHTML(logDigitar, pathEvidencias + idEvidencia);
                tempoMaximoEspera = tempoMaximoEsperaBackUp;
            } catch (NoSuchElementException e) {
                String logErroDigitar = "FALHA: Não foi possivel enviar o texto '" + value + "' para o campo " + nomeLogMap.get(elements);
                throwable = new ElementNotInteractableException(elements);
                System.out.println(e.getMessage());
                //print(driver);
                //Relatorio.relatorioHTML(logErroDigitar, pathEvidencias + idEvidencia);
                throw new NoSuchElementException(elements);
            }
        } else {
            String logErroDigitar = "FALHA: Não foi possivel enviar o texto '" + value + "' para o campo " + nomeLogMap.get(elements);
            //print(driver);
            //Relatorio.relatorioHTML(logErroDigitar, pathEvidencias + idEvidencia);
            throw new ElementNotInteractableException(elements);
        }
    }


    protected String getValue(String elements) {
        tempoMaximoEspera = tempoMaximoEsperaBackUp;
        while (!existe(elements) && tempoMaximoEspera >= 0) {
            long tempoInicial = Calendar.getInstance().getTimeInMillis();
            esperar(500);
            long tempoFinal = Calendar.getInstance().getTimeInMillis();
            long tempoGasto = (tempoFinal - tempoInicial);
            tempoMaximoEspera = Math.toIntExact((tempoMaximoEspera - tempoGasto));
        }
        resultado = driver.findElement(By.xpath(elements)).getAttribute("value");
        return resultado;
    }

    protected String getAttribute(String elements, String attribute) {
        tempoMaximoEspera = tempoMaximoEsperaBackUp;
        while (!existe(elements) && tempoMaximoEspera >= 0) {
            long tempoInicial = Calendar.getInstance().getTimeInMillis();
            esperar(500);
            long tempoFinal = Calendar.getInstance().getTimeInMillis();
            long tempoGasto = (tempoFinal - tempoInicial);
            tempoMaximoEspera = Math.toIntExact((tempoMaximoEspera - tempoGasto));
        }
        resultado = driver.findElement(By.xpath(elements)).getAttribute(attribute);
        return resultado;
    }


    protected String getText(String elements) {
        tempoMaximoEspera = tempoMaximoEsperaBackUp;
        try {
            while (!existe(elements) && tempoMaximoEspera >= 0) {
                long tempoInicial = Calendar.getInstance().getTimeInMillis();
                esperar(500);
                long tempoFinal = Calendar.getInstance().getTimeInMillis();
                long tempoGasto = (tempoFinal - tempoInicial);
                tempoMaximoEspera = Math.toIntExact((tempoMaximoEspera - tempoGasto));
            }
            resultado = driver.findElement(By.xpath(elements)).getText();
        } catch (NoSuchElementException e) {
            String logErroPegarTexto = "FALHA: Não foi possivel pegar o texto do elemento '" + nomeLogMap.get(elements) + "'";
            System.out.println(logErroPegarTexto);
            throwable = new NoSuchElementException(elements);
            //print(driver);
            //Relatorio.relatorioHTML(logErroPegarTexto, pathEvidencias + idEvidencia);
            throw new NoSuchElementException(elements);
        }
        return resultado;
    }

    protected boolean assertEquals(String arg0, String arg1) {
        if (arg0.equals(arg1)) {
            String logTextosIguais = "O texto " + arg0 + " era igual ao texto " + arg1;
            System.out.println(logAzul(logTextosIguais));
            return true;
        } else {
            String logTextosDiferentes = "O texto " + arg0 + " não era igual ao texto " + arg1;
            System.out.println(logVermelho(logTextosDiferentes));
            throwable = new AssertionError(logTextosDiferentes);
            throw new AssertionError();
        }
    }

    protected boolean assertEquals(float arg0, float arg1) {
        if (arg0 == arg1 ) {
            String logTextosIguais = "O valor " + arg0 + " era igual ao valor " + arg1;
            System.out.println(logAzul(logTextosIguais));
            return true;
        } else {
            String logTextosDiferentes = "O valor " + arg0 + " não era igual ao valor " + arg1;
            System.out.println(logVermelho(logTextosDiferentes));
            throwable = new AssertionError(logTextosDiferentes);
            throw new AssertionError();

        }
    }

    protected boolean validarTextoDentroDeTexto(String arg0, String arg1) {
        return arg0.contains(arg1);
    }

    public void setComboboxByText(String element, String value) {
        String logCombobox = "AÇÃO: Selecionando opção '" + value + "' para " + nomeLogMap.get(element);
        try {
            click(element);
            click("//*[text()=\"" + value + "\"]");
            System.out.println(logAzul(logCombobox));
            //Relatorio.relatorioHTML(logCombobox, pathEvidencias + idEvidencia);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //Relatorio.relatorioHTML(logCombobox, pathEvidencias + idEvidencia);
        }
    }

    public void setComboboxByIndex(String element, int index) {
        if (ativo(element)) {
            try {
                click(element);
                String opcaoCombobox = getText("(//mat-option)[" + index + "]");
                click("(//mat-option[" + index + "]");
                String logCombobox = "AÇÃO: Selecionando opção '" + opcaoCombobox + "' para " + nomeLogMap.get(element);
                System.out.println(logAzul(logCombobox));
                //Relatorio.relatorioHTML(logCombobox, pathEvidencias + idEvidencia);
            } catch (Exception e) {
                System.out.println("Exception setComboboxByIndex");
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("else elemento ativo");
        }
    }

    /*public void capture(String logCapture) {
        print(driver);
        System.out.println(logCapture);
        Relatorio.relatorioHTML(logCapture, pathEvidencias + idEvidencia);
    }*/

    public long setMaxTempoEspera(int milis) {
        return tempoMaximoEspera = milis;
    }

    public long setDefaultMaxTempoEspera() {
        return tempoMaximoEspera = tempoMaximoEsperaBackUp;
    }

    public void errorFail(String logFail) {
        throwable = new NullPointerException();
        //print(driver);
        //Relatorio.relatorioHTML(logFail, pathEvidencias + idEvidencia);
        throw new NullPointerException();
    }

}
