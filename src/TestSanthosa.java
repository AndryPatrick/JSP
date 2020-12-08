

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestSanthosa {

    public List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {
        
        		
		List<Integer> duplecatedIntegers = new ArrayList<>();
		
		Map<Integer, Integer> digitAndCount = new HashMap<>();
		for (Integer number : integers) 
		 { 
			Integer count = digitAndCount.get(number); 
			if (count == null) { 
				digitAndCount.put(number, 1); 
			} else { 
				digitAndCount.put(number, ++count); 
			} 
		} 
		
		Set<Entry<Integer, Integer>> entrySet = digitAndCount.entrySet(); 
		for (Entry<Integer, Integer> entry : entrySet) { 
			if (entry.getKey()!=null && entry.getValue() == numberOfDuplicates) { 
				duplecatedIntegers.add(entry.getKey()); 
			} 
		 } 

		return  duplecatedIntegers; 
	}
}
