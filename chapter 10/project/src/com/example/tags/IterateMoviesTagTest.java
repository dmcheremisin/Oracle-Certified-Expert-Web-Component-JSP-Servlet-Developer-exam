package com.example.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by Dmitrii on 26.09.2018.
 */
public class IterateMoviesTagTest extends SimpleTagSupport {
    String[] movies = {"Kill Bill", "Matrix", "Skyscraper"};

    @Override
    public void doTag() throws JspException, IOException {
        for (String movie : movies) {
            getJspContext().setAttribute("movie", movie);
            getJspBody().invoke(null);
        }

    }
}
