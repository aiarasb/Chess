/**
 * @(#) DebuggerLogger.java
 */
package Chess;

public class DebuggerLogger extends Logger{

    private Logger nextLogger;
    
    @Override
    public void log(String logText, String logType) {
        if(logType.equals("debug"))
        {
            System.out.println("Debug Log: " + logText);
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
