package com.example.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class ClassicTagEmptyBody extends TagSupport {
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            out.println("classic tag output");
        } catch (IOException ex) {
            throw new JspException("IOException- " + ex.toString());
        }
        return SKIP_BODY;
    }
}