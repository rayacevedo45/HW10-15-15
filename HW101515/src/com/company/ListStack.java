package com.company;
import java.util.ArrayList;

/**
 * Access Code 2.1
 * Ray Acevedo
 * ListStack.java
 */
public class ListStack extends ArrayList
{
    ArrayList arrayList = new ArrayList();

    public Object top()
    {
        return this.get(this.size() - 1);
    }

    public void push(Object object)
    {
        this.add(object);
    }

    public ArrayList pop()
    {
        if(! this.isEmpty())
        {
            return (ArrayList) this.remove(this.size() - 1);
        }
        throw new StackOverflowError(  );
    }
}
