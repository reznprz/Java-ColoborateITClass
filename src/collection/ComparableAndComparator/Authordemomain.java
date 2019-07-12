package collection.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Authordemomain {

    public static void main(String[] args) {

        List<Author> authorList = new ArrayList<>();
        authorList.add(new Author("John", "Grishm",32));
        authorList.add(new Author("Mike", "Smith",32));
        authorList.add(new Author("Ban", "Fraklin",32));

        System.out.println(authorList);
        Collections.sort(authorList);
        System.out.println("after sorting " + "\n");
        System.out.println(authorList);


        System.out.println("sort by firstname");
        for(Author au : authorList){
            System.out.println(au);
        }

        //sort by age
        Collections.sort(authorList, new AuthorAgeComarator()); //passing the Authoragecomarator class in the parameter
        System.out.println("sort by age" + "\n");

        for(Author au : authorList){
            System.out.println(au);
        }

        //sort by lastname
        Collections.sort(authorList, new Authorlnamecomarator());
        System.out.println("sort by lastname " + "\n");

        for(Author au : authorList){
            System.out.println(au);
        }

    }
}
class AuthorAgeComarator implements Comparator<Author> {

    @Override
    public int compare(Author o1, Author a) {
        if(o1.autorage == a.autorage){
            return 0;
        }
        else if(o1.autorage > a.autorage){
            return 1;
        }
        else {
            return  -1;
        }


    }
}

class Authorlnamecomarator implements Comparator<Author>{

    @Override
    public int compare(Author o1, Author o2) {
        return o1.lastname.compareTo(o2.lastname);

    }
}