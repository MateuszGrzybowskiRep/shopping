package com.websystique.springmvc.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.io.PrintWriter;
import java.io.StringWriter;

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
    @ExceptionHandler(ProductNotFoundException.class)
    public ModelAndView handlerProductNotFoundException(){
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("errorTitle","Product not available!");
        mv.addObject("errorDiscription","The product you are loking for is not aviable");
        mv.addObject("title","product is not aviable");
        return mv;
    }
    @ExceptionHandler(Exception.class)
    public ModelAndView handlerException(Exception ex){
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("errorTitle","Product not available!");


        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        mv.addObject("errorDiscription", ex.toString());

        mv.addObject("title","Error");
        return mv;
    }

}
