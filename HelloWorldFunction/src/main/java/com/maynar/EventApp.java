package com.maynar;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.maynar.model.BaseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handler for requests to Lambda function.
 */
public class EventApp implements RequestHandler<BaseMessage, String> {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventApp.class);

    @Override
    public String handleRequest(BaseMessage s, Context context) {
        LOGGER.info("Executed lambda! - input:" + s.toString());
        return "Lambda successfully triggered! Input: " + s.toString();
    }
}
