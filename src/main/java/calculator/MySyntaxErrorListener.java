package calculator;

import org.antlr.v4.runtime.*;

import java.util.Collections;
import java.util.List;

public class MySyntaxErrorListener extends BaseErrorListener {
    private boolean hasSyntaxError = false;

    private String message;

    public boolean hasSyntaxError() {
        return hasSyntaxError;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        hasSyntaxError = true;

        // Change the error message
        List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);

        message = "Syntax Error!\n" +
                "Token \"" + ((Token) offendingSymbol).getText() + "\" (line " + line +
                ", column " + (charPositionInLine + 1) + ") " + msg + "\n" +
                "Rule stack: " + stack;

    }
}
