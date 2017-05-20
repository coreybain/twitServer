package com.twitServer.aop;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.springframework.aop.interceptor.CustomizableTraceInterceptor;

/**
 * Created by Corey Baines on 17/05/2017.
 */
public class TraceInterceptor extends CustomizableTraceInterceptor {

    private static final long serialVersionUID = 287162721460370957L;
    protected static Logger logger4J = org.apache.log4j.Logger.getLogger("aop");

    @Override
    protected void writeToLog(Log logger, String message, Throwable ex) {
        if (ex != null) {
            logger4J.debug(message, ex);
        } else {
            logger4J.debug(message);
        }
    }

    @Override
    protected boolean isInterceptorEnabled(MethodInvocation invocation, Log logger) {
        return true;
    }
}