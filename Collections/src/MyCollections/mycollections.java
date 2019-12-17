package MyCollections;
//sited works: docs.oracle.com
import java.util.*;

public class mycollections {
    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("========Vector========" +"\n");
        //Vector is synchronized, meaning only one thread at a time can access the code.
        //Vector is also a growable array of objects.
        Vector vradio = new Vector();
        System.out.println("Radio capacity is " + vradio.capacity() +"\n");
        vradio.addElement("SD4");
        vradio.addElement("SD9");
        vradio.addElement("MDS9710");
        vradio.addElement("MDS9810");
        System.out.println("Radio size is " + vradio.size() +"\n");
        System.out.println(vradio +"\n");
        vradio.addElement("Freewave");
        vradio.addElement("Xetawave");
        vradio.addElement("unReach");
        vradio.addElement("SkyEdge");
        vradio.addElement("TruPoint");
        vradio.addElement("Eclipse");
        vradio.addElement("Constellation");
        System.out.println("Now add 7 more to the size." +"\n");
        System.out.println(vradio +"\n");
        System.out.println("Radio size is now " + vradio.size() +"\n");
        System.out.println("And Radio capacity is now " + vradio.capacity() +"\n");
        System.out.println("Now replace SkyEdge with BGAN, and Constellation with IRU600."+"\n");
        vradio.set(7, "BGAN");
        vradio.set(10, "IRU600");
        System.out.println(vradio + "\n");
        System.out.println("Now sort the vector: " + "\n");
        Collections.sort(vradio);
        System.out.println(vradio + "\n");
        System.out.println("Finally, we'll search for the index of 'unReach'." +"\n");
        int locateIndex = vradio.indexOf("unReach");
        System.out.println("Searching......"+"\n");
        System.out.println("unReach's index is: " + locateIndex +"\n");
        ///////////////////////////////////////////////////////////////
        System.out.println("======================");
        System.out.println("======LinkedList======" +"\n");
        //elements are linked to their index.  Note: Index starts with 0, ie. [0][1][2].
        //in the example above the number "2" is the third element, but index assignment of 2.
        LinkedList<String> llradio = new LinkedList<String>();
        llradio.add("SD4");
        llradio.add("SD9");
        llradio.add("MDS9710");
        llradio.add("MDS9810");
        System.out.println("Start Linked List: " +"\n");
        System.out.println(llradio +"\n");
        llradio.add(2,"MDS4710");
        System.out.println("New addition, 'MDS4710' as the 3rd element"+"\n");
        System.out.println(llradio +"\n");
        LinkedList<String> sllradio = new LinkedList<String>();
        sllradio.add("Freewave");
        sllradio.add("Xetawave");
        sllradio.add("unReach");
        sllradio.add("SkyEdge");
        System.out.println("2nd Linked List:"+"\n");
        System.out.println(sllradio +"\n");
        System.out.println("Combine Linked Lists one and two:" +"\n");
        llradio.addAll(sllradio);
        System.out.println(llradio +"\n");
        ///////////////////////////////////////////////////////////////
        System.out.println("=====================");
        System.out.println("======ArrayList======" +"\n");
        ArrayList<String> alradio = new ArrayList<String>();
        alradio.add("SD4");
        alradio.add("SD9");
        alradio.add("MDS9710");
        alradio.add("MDS9810");
        // Iterator to traverse or scan the list
        // List in a forward direction
        System.out.println("Radios in forward direction: " +"\n");
        ListIterator i = alradio.listIterator();
        while (i.hasNext())
            System.out.println(i.next());
        System.out.println();
        // List in a reverse direction
        System.out.println("Radios in reverse direction: " +"\n");
        while (i.hasPrevious())
            System.out.println(i.previous());
        System.out.println();
        System.out.println("* Remove SD4 and SD9." +"\n");
        System.out.println("* Add Freewave and Xetawave." +"\n");
        alradio.remove("SD9");
        alradio.remove("SD4");
        alradio.add("Freewave");
        alradio.add("Xetawave");
        // Print changed list
        ListIterator ci = alradio.listIterator();
        System.out.println("Radio list with changes: " +"\n");
        while (ci.hasNext())
            System.out.println(ci.next());
        ///////////////////////////////////////////////////////////////
        System.out.println("\n"+"=====================");
        System.out.println("=======TreeSet=======" +"\n");
        // Sorting initial elements and inputted elements
        // Does not allow duplicate entries
        TreeSet<String> tsradio = new TreeSet<String>();
        tsradio.add("SD9");
        tsradio.add("SD4");
        tsradio.add("BGAN");
        tsradio.add("Freewave");
        System.out.println(tsradio +"\n");
        System.out.println("TreeSet size is: " + tsradio.size() +"\n");
        System.out.println("Add 'Freewave' and 'Redline'." +"\n");
        tsradio.add("Freewave");
        tsradio.add("Redline");
        System.out.println("Duplicate value was ignored and additions are sorted." +"\n");
        System.out.println("TreeSet size is now: " + tsradio.size() +"\n");
        System.out.println(tsradio +"\n");
        ///////////////////////////////////////////////////////////////
        System.out.println("\n"+"=====================");
        System.out.println("=======HashSet=======" +"\n");
        // Sorting elements
        // Creates a table set and assigns a hash code to each element
        // duplicate elements are assigned the same hash code and counted
        // as one element.
        HashSet<String> hsradio = new HashSet<String>();
        hsradio.add("Xetawave");
        hsradio.add("Xetawave");
        hsradio.add("BGAN");
        hsradio.add("BGAN");
        hsradio.add("BGAN");
        hsradio.add("Freewave");
        hsradio.add("Xetawave");
        hsradio.add("Xetawave");
        System.out.println(hsradio +"\n");
        System.out.println("HashSet size is: " + hsradio.size() +"\n");
        System.out.println("Remove 'Xetawave' from HashSet." +"\n");
        hsradio.remove("Xetawave");
        System.out.println(hsradio +"\n");
        System.out.println("HashSet size is now: " + hsradio.size() +"\n");
        // copy the HashSet codes of the elements into an Array
        Object[] toarray_hsradio = hsradio.toArray();
        System.out.println("The array is:" +"\n");
        for (int hs = 0; hs < toarray_hsradio.length; hs++)
            System.out.println(toarray_hsradio[hs]);
        ///////////////////////////////////////////////////////////////
        System.out.println("\n"+"=====================");
        System.out.println("=========Map=========" +"\n");
        Map<String,Integer> map_radio = new HashMap<String, Integer>();
        map_radio.put("SD9",123);
        map_radio.put("SD4",456);
        map_radio.put("Freewave",789);
        map_radio.put("Freewave",147);
        map_radio.put("Xetawave",258);
        System.out.println(map_radio +"\n");
        // The key of the map ignores duplicates and
        // stops at the final duplicate entry
        System.out.println("Get the integer mapped to 'Freewave':" +"\n");
        System.out.println(map_radio.get("Freewave") +"\n");
        Set<Map.Entry<String,Integer>> mas_radios = map_radio.entrySet();
        for (Map.Entry<String,Integer> out:mas_radios ) {
            System.out.println(out.getKey() + ":" + out.getValue());
        }
        ///////////////////////////////////////////////////////////////
        System.out.println("\n"+"=====================");
        System.out.println("========Queue========" +"\n");
        //This queue is a typical first-in-last-out order method.
        //Queues are designed for holding elements prior to processing.
        Queue<String> queue_radio = new LinkedList<>();
        queue_radio.add("SD9");
        queue_radio.add("SD4");
        queue_radio.add("Freewave");
        queue_radio.add("Xetawave");
        System.out.println(queue_radio +"\n");

        queue_radio.add("Cambium");
        System.out.println("The 'add' places the new radio at the end of the queue.\n");
        System.out.println(queue_radio +"\n");
        queue_radio.remove();
        System.out.println("The 'remove' deletes the first in the queue.\n");
        System.out.println(queue_radio +"\n");
        System.out.println(queue_radio.size() +"\n");
        System.out.println("The 'size' shows the number of elements in the queue.\n");
        System.out.println(queue_radio +"\n");
        System.out.println(queue_radio.peek() +"\n");
        System.out.println("The 'peek' shows the first element in the queue.\n");
        ///////////////////////////////////////////////////////////////
        System.out.println("\n"+"=====================");

    }
}