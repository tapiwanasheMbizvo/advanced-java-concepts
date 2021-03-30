package streams;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 11:15
 * @Year 2021
 */
public class OCPStreams {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Jacob", Gender.MALE),
                new Person("Chemist", Gender.MALE),
                new Person("Solo", Gender.MALE),
                new Person("Coco", Gender.FEMALE),
                new Person("Cyie", Gender.FEMALE),
                new Person("Gil", Gender.FEMALE),
                new Person("JC", Gender.MALE),
                new Person("SHINGIRAINASHEJESU", Gender.MALE)
        );

        //


       /* people.stream().forEach(person -> System.out.println(person.toString()));
        Function<Person, Gender> personGenderFunction = person -> person.gender;
        Set<Gender> genderSet = people.stream()
                .map(personGenderFunction)
                .collect(Collectors.toSet());

        System.out.println(genderSet);*/


        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> person.gender.equals(Gender.FEMALE));
        boolean containsAnyFemales = people.stream()
                .anyMatch(person -> person.gender.equals(Gender.FEMALE));

        List<String> listOfNames = people.stream()
                .map(person -> person.name)
                .collect(Collectors.toList());

        List<Person>  listOfMales = people.stream()
                .filter(person -> person.gender.equals(Gender.MALE))
                .collect(Collectors.toList());

        List<String> namesOfMales = people.stream()
                .filter(person -> person.gender.equals(Gender.MALE))
                .map(person -> person.name)
                .collect(Collectors.toList());

        long numberOfFemales = people.stream().
                filter(person -> person.gender.equals(Gender.FEMALE))
                .count();
        long numberOfMales = people.stream().
                filter(person -> !person.gender.equals(Gender.FEMALE))
                .count();
        List<Person> listOfNamesLessThan12Chars = people.stream()
                .dropWhile(person -> person.name.length() < 12)
                .collect(Collectors.toList());

        IntStream intStream = people.stream()
                .mapToInt(person -> person.name.length());

        int sumOfPeopleNames = people.stream()
                .mapToInt(person -> person.name.length())
                .sum();


        System.out.println("Does it contain only females: "+containsOnlyFemales);
        System.out.println("Does it contain any females: "+containsAnyFemales);
        System.out.println("List of names in the List : "+listOfNames);
        System.out.println("List of males in the List : "+listOfMales);
        System.out.println("List of male names in the List : "+namesOfMales);
        System.out.println("Number of females in the list : "+numberOfFemales);
        System.out.println("Number of males in the list : "+numberOfMales);
        System.out.println("List of people with longer than 12 char : "+listOfNamesLessThan12Chars);
        //System.out.println("IntStream : "+intStream.forEach(););
        intStream.forEach(System.out::println);
        System.out.println("Sum of People name length : "+sumOfPeopleNames);


    }

    enum  Gender{

        FEMALE, MALE
    }

    static class   Person{

        private final  String name;
        private final Gender gender;

         Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
}
