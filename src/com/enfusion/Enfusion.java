package com.enfusion;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/**
 * Sample Input :
 * 
 * new Person ("Jim", "111"), 
 * new Person ("Bob", "222"), 
 * new Person ("Dan", "333"), 
 * new Person ("Jim", "222"), 
 * new Person ("Jim", "333"), 
 * new Person ("Dan", "111"), 
 * new Person ("Jim", "222"), 
 * new Person ("Jim", "111"), 
 * new Person ("Bob", "111"), 
 * new Person ("Jim", "111"), 
 * new Person ("Dan", "444"),
 * new Person ("Dan", "555"),
 * 
 * Output : 
 * 
 * Bob=2
 * Jim=3
 * Dan=4
 * 
 * @author Tejas
 *
 */
class Result {

    /*
     * Complete the 'printUniqueNumbersPerName' function below.
     *
     * The function accepts List<Person> people as parameter.
     */
  
    public static void printUniqueNumbersPerName(List<Person> people) {
    	
    	HashSet<Person> uniqueSet = new HashSet<>();
    	// Extract unique person object put into hashset
		for (Person p : people) {
			if (!uniqueSet.contains(p)) {
				uniqueSet.add(p);
			} 
		}
	
		System.err.println(uniqueSet);
		// Extract unique person.name  put into map with number of repetition
		 Iterator<Person> itr  =  uniqueSet.iterator();
		 String name;
		 HashMap<String,Integer> uniqueMap = new HashMap<>();
		 
		 while (itr.hasNext()){
			 int cnt = 1;
			 name = itr.next().name;
			 if (uniqueMap.containsKey(name)){
				 cnt = uniqueMap.get(name);
				 cnt++;
				 uniqueMap.put(name, cnt);
			 }
			 else{
				 uniqueMap.put(name, cnt);
			 }
			
		 }
		 
		 //sort hashMap base on value using steam
		 
		 uniqueMap.entrySet() // get entry set
		   		  .stream() // create steam
		   		  .sorted(Map.Entry.comparingByValue()) // sort collection by value
		   		  .forEach(System.out::println); // print it 
    }

}

class Person {
	
    public String name;
    public String phone; 
    
    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + "]";
	}
  
    
}

public class Enfusion {
    public static void main(String[] args) throws IOException {
         List<Person> people = Arrays.asList(new Person ("Jim", "111"), 
                                             new Person ("Bob", "222"), 
                                             new Person ("Dan", "333"), 
                                             new Person ("Jim", "222"), 
                                             new Person ("Jim", "333"), 
                                             new Person ("Dan", "111"), 
                                             new Person ("Jim", "222"), 
                                             new Person ("Jim", "111"), 
                                             new Person ("Bob", "111"), 
                                             new Person ("Jim", "111"), 
                                             new Person ("Dan", "444"),
                                             new Person ("Dan", "555"));
        
        
        Result.printUniqueNumbersPerName(people);
    }
}
