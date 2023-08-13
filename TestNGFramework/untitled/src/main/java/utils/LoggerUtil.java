package utils;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class LoggerUtil {

    private static final Logger logger = LogManager.getLogger(LoggerUtil.class);
    private static final ThreadLocal<StringBuilder> threadLocallog = new ThreadLocal<>();

    public static void logInfo(String message){
        logger.info(message);
        threadLocallog.get().append("[Info] ").append(message).append("\n");
    }


    public static void logWarning(String message){
        logger.warn(message);
        threadLocallog.get().append("[Warn] ").append(message).append("\n");
    }


    public static void logError(String message){
        logger.error(message);
        threadLocallog.get().append("[ERROR] ").append(message).append("\n");
    }

    public static String getThreadLocalLogs(){
        if(threadLocallog.get()!= null){
            return threadLocallog.get().toString();
        }
        return "";
    }

    public static void initThreadLocallogs(){
        threadLocallog.set(new StringBuilder());
    }

    public static void removeThreadLocalLogs(){
        threadLocallog.remove();
    }
}

