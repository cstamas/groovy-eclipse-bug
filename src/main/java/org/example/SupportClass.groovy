package org.example

import groovy.transform.CompileStatic

@CompileStatic
abstract class SupportClass<T>
{
    private T data

    void setData(T data)
    {
        this.data = data
    }

    T getData()
    {
        return data
    }
}
