/**
 * @(#) Logger.java
 */

package Chess;

public abstract class Logger {
    public abstract void log(String logText, String logType);
    public abstract void setNextLogger(Logger nextLogger);
}
