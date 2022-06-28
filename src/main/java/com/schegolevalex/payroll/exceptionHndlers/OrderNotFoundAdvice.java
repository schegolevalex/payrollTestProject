package com.schegolevalex.payroll.exceptionHndlers;

import com.schegolevalex.payroll.exceptions.OrderNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class OrderNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(OrderNotFoundException.class)
    @ResponseStatus(HttpStatus.OK)
    String employeeNotFoundHandler(OrderNotFoundException ex) {
        return ex.getMessage();
    }
}
