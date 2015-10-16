package com.company;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 * Access Code 2.1
 * Ray Acevedo
 * ListSet.java
 */
public class ListSet<E> extends ArrayList<E> implements Set<E>
{
    ListSet<String> set = new ListSet<String>();

    @Override
    public boolean add(E e)
    {
        //       if (!set.contains(e)){
        //           set.add(e);
        if(!this.contains(e)){
            this.add(e);
            return true;
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection c)
    {
        return super.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c)
    {
        return super.removeAll(c);
    }
}
