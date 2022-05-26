package org.example

import groovy.transform.CompileStatic
import groovy.transform.PackageScope
import groovy.transform.ToString

@CompileStatic
class Impl extends AppSupport<Inner>
{
    @PackageScope
    static final Object messages = new Object()

    Impl()
    {
        data = new Inner( Map.of('prop', 'value') )
        logger.info( "created: {}", messages )
    }

    void someMethod()
    {
        println data.prop
    }

    @ToString(includePackage = false, includeNames = true)
    static class Inner
            extends DataSupport {
        String prop

        Inner(Map<String, String> data) {
            prop = someMethod( data['prop'] )
        }
    }
}
