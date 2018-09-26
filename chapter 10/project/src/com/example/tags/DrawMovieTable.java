package com.example.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.List;

/**
 * Created by Dmitrii on 26.09.2018.
 */
public class DrawMovieTable extends SimpleTagSupport {
    List<String> movieList;

    public void setMovieList(List<String> movieList) {
        this.movieList = movieList;
    }

    @Override
    public void doTag() throws JspException, IOException {
        for (String movie : movieList) {
            getJspContext().setAttribute("movie", movie);
            getJspBody().invoke(null);
        }

    }
}
