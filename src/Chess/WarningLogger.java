/**
 * @(#) WarningLogger.java
 */
package Chess;

public class WarningLogger extends Logger{

    private Logger nextLogger;
    
    @Override
    public void log(String logText, String logType) {
        if(logType.equals("warning"))
        {
            System.out.println("Warning Log: " + logText);
        }
        else
        {
            this.nextLogger.log(logText, logType);
        }
    }

    @Override
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
    
}