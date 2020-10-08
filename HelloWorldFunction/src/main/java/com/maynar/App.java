package com.maynar;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handler for requests to Lambda function.
 */
public class App implements RequestHandler<String, String> {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    @Override
    public String handleRequest(String s, Context context) {
        LOGGER.info("Executed lambda! - input:" + s);
        return "Lambda successfully triggered! Input: " + s;
    }
}
