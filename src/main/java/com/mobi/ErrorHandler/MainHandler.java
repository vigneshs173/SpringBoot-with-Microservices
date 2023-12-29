package com.mobi.ErrorHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MainHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity <ResponseHandler> handleNoProductException(CustomerNotFoundException e)
    {
        ResponseHandler responseHandler = new ResponseHandler("101", e.getMessage());
        return new ResponseEntity<>(responseHandler, HttpStatus.NOT_FOUND);
    }

    /*@ExceptionHandler(CustomerAlreadyFoundException.class)
    public ResponseEntity handleProductAlreadyExists(CustomerAlreadyFoundException e)
    {
        ResponseHandler errorResponse=new ResponseHandler("201",e.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }*/
}
