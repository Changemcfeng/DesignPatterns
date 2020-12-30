package com.example.reidsspringboot.gof23.iterator;
/**
 * The triangle is the most balanced
 */


public class NameResposity  implements Container {
    private String[] names={"mcfeng","longmao","baiguo","xipu"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    private class NameIterator implements Iterator{
        int index=0;
        @Override
        public boolean hasNext() {
            return index<names.length;
        }

        @Override
        public String  next() {
           if (this.hasNext()){
               return names[index++];
           }
           return null;
        }
    }
}