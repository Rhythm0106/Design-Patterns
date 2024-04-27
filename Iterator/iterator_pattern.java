interface Iterator {
    public boolean hasNext();
    public Object next();
 }

interface Container {
    public Iterator getIterator();
 }

class NameRepository implements Container {
    public String Shopnames[] = {"Lenovo" , "DELL" ,"HP" , "ASUS"};
 
    @Override
    public Iterator getIterator() {
       return new NameIterator();
    }
 
    private class NameIterator implements Iterator {
 
       int index;
 
       @Override
       public boolean hasNext() {
       
          if(index < Shopnames.length){
             return true;
          }
          return false;
       }
 
       @Override
       public Object next() {
       
          if(this.hasNext()){
             return Shopnames[index++];
          }
          return null;
       }		
    }
 }

 public class iterator_pattern {
	
    public static void main(String[] args) {
       NameRepository namesRepository = new NameRepository();
 
       for(Iterator iterator = namesRepository.getIterator(); iterator.hasNext();){
          String name = (String)iterator.next();
          System.out.println("ShopName : " + name);
       } 	
    }
 }