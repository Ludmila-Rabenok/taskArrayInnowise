package by.rabenok.task1.validator.impl;

import by.rabenok.task1.validator.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NumericValidator implements Validator {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String NUMERIC_PUNCTUATION_SPACE_REGEX = "^[\\d\\s\\p{P}]+$";

    @Override
    public boolean isValidNumeric(String line) {
        boolean matches = line.matches(NUMERIC_PUNCTUATION_SPACE_REGEX);
        LOGGER.info("Line [" + line + "] isValid - " + matches);
        return matches;
    }
}