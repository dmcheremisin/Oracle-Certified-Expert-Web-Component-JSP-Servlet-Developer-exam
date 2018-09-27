package com.example.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class ClassicTagEmptyBody extends TagSupport {
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            out.println("in the start tag <br />");
        } catch (IOException e) {
            throw new JspException("IOException- " + e.toString());
        }
        return SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try{
            out.println("in end tag");
        } catch (IOException e) {
            throw new JspException("IOException- " + e.toString());
        }
        return EVAL_PAGE;
    }
}