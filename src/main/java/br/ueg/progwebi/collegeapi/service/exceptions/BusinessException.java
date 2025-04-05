package br.ueg.progwebi.collegeapi.service.exceptions;

public class BusinessException extends RuntimeException {
    public BusinessException(String message, Throwable e) {
        super (message, e);

    }
}
