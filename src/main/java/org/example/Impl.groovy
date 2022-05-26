package org.example

import groovy.transform.CompileStatic
import groovy.transform.ToString
import org.apache.groovy.util.Maps

@CompileStatic
class Impl extends AppSupport<Inner>
{
    Impl()
    {
        data = new Inner( Maps.of('prop', 'value') )
    }

    void someMethod()
    {
        println data.prop
    }

    @ToString
    static class Inner extends DataSupport {
        String prop

        Inner(Map<String, String> data) {
            prop = someMethod( data['prop'] )
        }
    }
}