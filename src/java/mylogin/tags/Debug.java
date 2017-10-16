/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylogin.tags;

import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.*;

/**
 *
 * @author 642202
 */
public class Debug extends TagSupport{
    
    @Override
    public int doStartTag() throws JspException {
        String url = pageContext.getRequest().getServerName();
        String debug = pageContext.getRequest().getParameter("debug");
        if (url != null && (url.equals("localhost") || url.contains("test"))){
            if (debug != null){
                return EVAL_BODY_INCLUDE;
            }
        }
        return SKIP_BODY;
    }
}
