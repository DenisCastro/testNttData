package intern;

import cucumber.api.PickleStepTestStep;
import cucumber.api.event.*;



import static intern.Chrome.driver;
import static intern.Log.logAzul;

public class Plugin implements ConcurrentEventListener{
    protected static String testCaseName = "Teste Escrita Log Scenario";
    //protected static String testCaseName ="";
    protected static String testStepName = "";
    protected static String testStepResult = "";
    protected static String pathCenario = "";
    protected static int teste = 0;

    static String cenario = "";
    static String cenario2 = "";
    static String autor = "";
    static int indexAutor;


    private final EventHandler<TestStepStarted> testStepStartedEventHandler = new EventHandler<TestStepStarted>() {
        @Override
        public void receive(TestStepStarted testStepStarted) {
            //PickleStepTestStep testStep = (PickleStepTestStep) testStepStarted.testStep;
            testStepName = ((PickleStepTestStep) testStepStarted.testStep).getStepText();
            String logTestStep = "BDD> " + testStepName;
            System.out.println(logAzul(logTestStep));
        }
    };

    /*private final EventHandler<TestStepFinished> testStepFinishedEventHandler = new EventHandler<TestStepFinished>() {
        @Override
        public void receive(TestStepFinished testStepFinished) {
            testStepResult = testStepFinished.result.getStatus().toString();
            if (primeiroTeste) {
                primeiroTeste = false;
                extent = new ExtentReports();
                spark = new ExtentSparkReporter("src/test/resources/relatorio/anexos/Relatorio.html");
                //spark.config().setTheme(Theme.DARK);
                extent.attachReporter(spark);
            }
            if (nomeCenario.isEmpty() || !nomeCenario.equals(testCaseName)) {
                nomeCenario = testCaseName;
                nomeCenario = nomeCenario.replace(nomeCenario.substring(indexAutor), "");
                testCaseName = nomeCenario;
                if (indexAutor <= 0) {
                    throw new IllegalArgumentException("Autor cenário teste não definido");
                }
                primeiroCenario = false;
                extentNomeCenario = extent.createTest((cenario));
                exTentNomeCenario2 = extent.createTest((cenario));
                extent.removeTest(cenario);
                extentNomeCenario.assignAuthor(autor);
            }
            if (testNodeName.isEmpty() || !testNodeName.equals(testStepName)) {
                testNodeName = testStepName;
                bdd = exTentNomeCenario2.createNode(testNodeName);
                extent.flush();

            }
            stepStatus = throwable == null ? "sucesso" : "falha";
            extent.flush();
            switch (stepStatus) {
                case "sucesso":
                    bdd.pass(testStepName);
                    break;
                case "falha":
                    bdd.fail(throwable);
                    extentNomeCenario.fail(throwable);
                    throwable = null;
                    break;
            }
            extent.flush();
        }
    };*/

    private final EventHandler<TestCaseStarted> testCaseStartedEventHandler = new EventHandler<TestCaseStarted>() {
        @Override
        public void receive(TestCaseStarted testCaseStarted) {
            testCaseName = testCaseStarted.testCase.getName();
            System.out.println(logAzul(" ===== INICIANDO CASO DE TESTE: " + testCaseName));
            /*indexAutor = testCaseName.indexOf(", Autor: ");
            autor = testCaseName.substring(indexAutor + 8);
            try {
                cenario = testCaseName.replace(testCaseName.substring(indexAutor), "");
            } catch (StringIndexOutOfBoundsException exception) {
                System.out.println(logVermelho("**** O AUTOR DO CASO DE TESTE NÃO FOI DEFINIDO, POR FAVOR DEFINA ANTES DE CONSEGUIR PROSSEGUIR ****"));
                throw new StringIndexOutOfBoundsException();
            }
            cenario = removerAcentos(cenario);
            cenario = cenario.replace(testCaseName.substring(indexAutor), "");
            pathCenario = cenario.replace(" ", "_").replace(",", "").replace(":", "").toLowerCase();
            diretorioEvidencias(pathCenario);*/
        }
    };

    private final EventHandler<TestCaseFinished> testCaseFinishedEventHandler = new EventHandler<TestCaseFinished>() {
        @Override
        public void receive(TestCaseFinished testCaseFinished) {
            if (driver != null) {
                driver.quit();
            }
        }
    };
    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {
        eventPublisher.registerHandlerFor(TestStepStarted.class, testStepStartedEventHandler);
        eventPublisher.registerHandlerFor(TestCaseStarted.class, testCaseStartedEventHandler);
        eventPublisher.registerHandlerFor(TestCaseFinished.class, testCaseFinishedEventHandler);
    }

}
