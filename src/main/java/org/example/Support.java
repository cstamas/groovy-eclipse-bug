package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Support
{
    private final Logger logger = LoggerFactory.getLogger( getClass() );

    protected Logger getLogger()
    {
        return logger;
    }
}
