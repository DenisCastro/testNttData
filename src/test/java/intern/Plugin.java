package intern;

import cucumber.api.event.*;


import static intern.Chrome.driver;

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
        eventPublisher.registerHandlerFor(TestCaseFinished.class, testCaseFinishedEventHandler);
    }

}
