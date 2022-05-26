package org.example;

public abstract class AppSupport<T> extends Support implements App
{
    private T data;

    public void setData( T data )
    {
        this.data = data;
    }

    public T getData()
    {
        return data;
    }
}
