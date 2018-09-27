package com.example.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MenuItem extends TagSupport {
    String itemValue;

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

    public int doStartTag() throws JspException {
        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doEndTag() throws JspException {
        Menu parent = (Menu) getParent();
        parent.addMenuItem(itemValue);
        return EVAL_PAGE;
    }
}