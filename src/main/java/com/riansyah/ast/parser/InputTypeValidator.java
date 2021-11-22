package com.riansyah.ast.parser;

import com.riansyah.ast.parser.inputParserStrategy.InputInterface;
import com.riansyah.ast.parser.inputParserStrategy.InputManual;

public class InputTypeValidator implements IParameterValidator {
    public static final String InputTypes4Help = "manual";

    public InputTypeValidator() {
    }

    public void validate(String parameter, String value) throws ParameterException {
        if (!InputTypeValidator.InputTypes.contains(value)) {
            throw new ParameterException("The input " + value + " doesn't exist among the input types. These are the possibilities:" + InputTypeValidator.InputTypes.possibilities());
        }
    }

    public static enum InputTypes {
        MANUAL("manual", new InputManual());

        private final String value;
        private final InputInterface inputType;

        private InputTypes(String value, InputInterface inputManual) {
            this.value = value;
            this.inputType = inputManual;
        }

        public static boolean contains(String value) {
            InputTypeValidator.InputTypes[] var4;
            int var3 = (var4 = values()).length;

            for(int var2 = 0; var2 < var3; ++var2) {
                InputTypeValidator.InputTypes entry = var4[var2];
                if (entry.getValue().equals(value)) {
                    return true;
                }
            }

            return false;
        }

        public static String possibilities() {
            String result = new String();
            InputTypeValidator.InputTypes[] var4;
            int var3 = (var4 = values()).length;

            for(int var2 = 0; var2 < var3; ++var2) {
                InputTypeValidator.InputTypes entry = var4[var2];
                result = result + " " + entry.getValue();
            }

            return result;
        }

        private String getValue() {
            return this.value;
        }

        public static InputInterface getInputType(String value) throws ParameterException {
            InputTypeValidator.InputTypes[] var4;
            int var3 = (var4 = values()).length;

            for(int var2 = 0; var2 < var3; ++var2) {
                InputTypeValidator.InputTypes entry = var4[var2];
                if (entry.getValue().equals(value)) {
                    return entry.inputType;
                }
            }

            throw new ParameterException("Something goes wrong...");
        }
    }
}
