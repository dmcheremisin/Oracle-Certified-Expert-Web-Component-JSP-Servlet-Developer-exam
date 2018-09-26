package com.example.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by Dmitrii on 26.09.2018.
 */
public class SecondTagTest extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        getJspBody().invoke(null);
    }
}
