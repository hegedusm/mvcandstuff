package com.zsirosd.mvcandstuff.view;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * test
 */
public class CustomViewResolver implements ViewResolver, Ordered {
    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {

        return "custom".equals(s) ? new CustomView() : null;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
