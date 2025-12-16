package forJunitInTesting.utils;
import java.util.logging.*;

public class ColoredConsoleFormatter extends Formatter {

    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";

    @Override
    public String format(LogRecord record) {
        String color = switch (record.getLevel().getName()) {
            case "SEVERE" -> RED;
            case "WARNING" -> YELLOW;
            case "INFO" -> GREEN;
            case "CONFIG", "FINE", "FINER", "FINEST" -> BLUE;
            default -> RESET;
        };

        return color + "[" + record.getLevel() + "] "
                + record.getMessage() + RESET + "\n";
    }
}
