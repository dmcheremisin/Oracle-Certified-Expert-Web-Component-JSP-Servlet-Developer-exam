package com.example.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu extends TagSupport {
    List<String> menuItems = new ArrayList<>();

    public void addMenuItem(String menuItem){
        menuItems.add(menuItem);
    }

    public int doStartTag() throws JspException {
        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doEndTag() throws JspException {
        try {
            pageContext.getOut().print("Menu items are: " + menuItems);
        } catch (IOException e) {
            throw new JspException("IOException- " + e.toString());
        }
        return EVAL_PAGE;
    }
}