/**
 * @(#) ErrorLogger.java
 */
package Chess;

public class ErrorLogger extends Logger{

    private Logger nextLogger;
    
    @Override
    public void log(String logText, String logType) {
        if(logType.equals("error"))
        {
            System.out.println("Error Log: " + logText);
        }
        else if(nextLogger != null)
        {
            this.nextLogger.log(logText, logType);
        }
        else
        {
            System.out.println("Yra tik trys loginimo tipai: debug, warning ir error.");
        }
            
    }

    @Override
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
    
}
