package com.websystique.springmvc.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(NoHandlerFoundException.class)
    public ModelAndView handlerNoHandlerFoundException(){

        ModelAndView mv = new ModelAndView("error");
        mv.addObject("errorTitle","the page is not conmstructed");
        mv.addObject("errorDiscription","The page you are loking for is not aviable now");
        mv.addObject("title","404 Error Page");

        return mv;
    }
}
