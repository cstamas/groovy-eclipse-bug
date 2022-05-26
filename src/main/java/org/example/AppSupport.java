package org.example;

public abstract class AppSupport<DataT> extends Support implements App
{
    private DataT data;

    public void setData( DataT data )
    {
        this.data = data;
    }

    public DataT getData()
    {
        return data;
    }
}
