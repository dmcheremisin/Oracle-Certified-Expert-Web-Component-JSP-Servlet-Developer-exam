package com.example.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class ClassicTagWithBody extends TagSupport {
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            out.println("<p>Before dody</p>");
        } catch (IOException e) {
            throw new JspException("IOException- " + e.toString());
        }
        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doEndTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try{
            out.println("<p>After body</p>");
        } catch (IOException e) {
            throw new JspException("IOException- " + e.toString());
        }
        return EVAL_PAGE;
    }
}