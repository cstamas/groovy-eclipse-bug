package org.example

import groovy.transform.CompileStatic
import groovy.transform.ToString

@CompileStatic
class ImplClass extends SupportClass<Inner>
{
    ImplClass()
    {
        data = new Inner()
    }

    void someMethod()
    {
        println data.prop
    }

    @ToString
    static class Inner extends DataSupport {
        String prop = 'foo'
    }
}
