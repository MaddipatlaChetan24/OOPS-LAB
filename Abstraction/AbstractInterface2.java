interface Logger {
    void logMessage(String message);
}

class FileLogger implements Logger {

    public void logMessage(String message) {
        System.out.println("Logging message to file: " + message);
    }
}

class ConsoleLogger implements Logger {
   
    public void logMessage(String message) {
        System.out.println("Logging message to console: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Logger fileLogger = new FileLogger();
        Logger consoleLogger = new ConsoleLogger();

        fileLogger.logMessage("File log: User logged in.");
        consoleLogger.logMessage("Console log: User logged in.");
    }
}

