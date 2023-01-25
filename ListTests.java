import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class TrueChecker implements StringChecker{
    public boolean checkString(String s){
        return true;
    }
}

//Arrays.asList()
public class ListTests{
    @Test
    public void testFilter(){
        String[] arr = {"hi", "hello"};
        List<String> test = new ArrayList(Arrays.asList(arr));
        assertArrayEquals(arr, ListExamples.filter(test, new TrueChecker()).toArray());
    }

    @Test
    public void testMerge(){
        String[] arr1 = {"a", "c"};
        String[] arr2 = {"b", "d", "e"};
        List<String> list1 = new ArrayList(Arrays.asList(arr1));
        List<String> list2 = new ArrayList(Arrays.asList(arr2));
        assertArrayEquals(new String[]{"a","b","c","d","e"}, ListExamples.merge(list1,list2).toArray());
    }
}
