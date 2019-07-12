package Collections.ListInterface.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {


    public void main(String[] args) {


        List<Author> author = new ArrayList<>();
        author.add(new Author("John", "grism", 32));
        author.add(new Author("Ban", "Loko", 24));
        author.add(new Author("Jiya", "ism", 30));

        Collections.sort(author);
        System.out.println("==== Sort by First Name =====");
        for (Author au : author) {
            System.out.println(au);
        }


        // sort by age ...
        Collections.sort(author, new AuthorageComparator());
        System.out.println("====SORT BY Author AGE");
        for (Author au : author) {
            System.out.println(au);
        }

        // sort by Last name .....
        Collections.sort(author, new AuthorLastNameComprator());
        System.out.println("===Sort by Author LastName===");
        for (Author au : author) {
            System.out.println(au);
        }

        class AuthorageComparator implements Comparator<Author> {
            @Override
            public int compare(Author o1, Author o2) {
                if (o1.authorage == o2.authorage) {

                    return 0;

                } else if (o1.authorage > o2.authorage) {

                    return 1;
                } else {
                    return -1;
                }

            }
        }

        class AuthorLastNameComprator implements Comparator<Author> {

            @Override
            public int compare(Author o1, Author o2) {
                return 0;
            }
        }


    }
}


