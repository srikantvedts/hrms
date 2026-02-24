package com.vts.hrms.exception;

import java.util.List;

public class ExcelValidationException extends RuntimeException {

    private final List<String> errors;

    public ExcelValidationException(List<String> errors) {
        super("Excel validation failed");
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }
}

