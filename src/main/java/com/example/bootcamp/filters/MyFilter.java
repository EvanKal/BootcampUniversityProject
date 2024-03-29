/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bootcamp.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author Los_e
 */
@Component
@Order(1)
public class MyFilter implements Filter{

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        
        sr.setCharacterEncoding("UTF-8");
        sr1.setCharacterEncoding("UTF-8");
        
        HttpServletRequest httprequest = (HttpServletRequest) sr;
        HttpServletResponse httpresponse = (HttpServletResponse) sr1;
        System.out.println(httprequest.getRequestURI());
        httprequest.setAttribute("uri", httprequest.getRequestURI());
        fc.doFilter(sr, sr1);
    }
    
}
