package com.mobi.ErrorHandler;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseHandler {

    private String responseCode;
    private String responseMessage;


}
