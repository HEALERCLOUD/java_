package Classes;
import java.util.HashMap;
import java.util.Iterator;
public class  PersoncCollection {
    private static final HashMap<String, Person> persons = new HashMap<>();
    public static void addPerson(String id,Person person){
        persons.put(id,person);
    }
    public static void removePerson(String id){
        persons.remove(id);
    }
    public static void getPerson(String id){
        persons.get(id);
    }


    public class PersonCollectionIterator implements Iterator<Person>{
        private Iterator<Person> iterator = persons.values().iterator();
        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public Person next() {
            return iterator.next();
        }
    }
    public PersonCollectionIterator iterator() {
        return new PersonCollectionIterator();
    }
}
