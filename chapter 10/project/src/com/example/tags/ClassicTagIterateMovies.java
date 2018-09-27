package com.example.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class ClassicTagIterateMovies extends TagSupport {
    String[] movies = {"Kill Bill", "Matrix", "Skyscraper"};
    int movieCounter = 0;

    public int doStartTag() throws JspException {
        pageContext.setAttribute("movie", movies[movieCounter]);
        movieCounter++;
        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doAfterBody() throws JspException {
        if(movieCounter < movies.length) {
            pageContext.setAttribute("movie", movies[movieCounter]);
            movieCounter++;
            return EVAL_BODY_AGAIN;
        } else {
            return SKIP_BODY;
        }

    }

    @Override
    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }
}