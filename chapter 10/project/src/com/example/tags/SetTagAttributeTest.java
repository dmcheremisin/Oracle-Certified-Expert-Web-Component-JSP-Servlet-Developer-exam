package com.example.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by Dmitrii on 26.09.2018.
 */
public class SetTagAttributeTest extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().setAttribute("message", "Wear sunscreen");
        getJspBody().invoke(null);
    }
}
