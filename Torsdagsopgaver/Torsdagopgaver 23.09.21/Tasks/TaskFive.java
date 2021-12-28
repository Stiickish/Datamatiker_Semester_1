//5.a Create a new class Datamatik or reuse the one you created earlier. Add an array of Students with 10 elements in it. This should be a class variable (static). From the main method, add 10 student instances to the array. Each student must have a unique reference.
//5.b Create a function in Datamatik that takes in the array from 5.a as a parameter as well as an integer. The function should return the field "name" (the name of the student) and print it (the integer should be used as the index nuber of the student to be printed). Call this method with different parameters (only the integer - not the array) from the main() of Datamatik.
//5.c Create a similar function to that of 5.b, but instead of receiving the array and an integer, it receives the array and a string. Loop through all elements in the array until you find the element with the name received as a parameter. Then return the index of that student. Call this method with different names from the main method of Datamatik
public class TaskFive{

public static void main(String[] args){

static Student[] students = new Student();
new Student("Mads", 26, false, 'b' ),
new Student("Muneeb", 26, false, 'b'),
new Student("Alex", 28, false, 'b'),
new Student("Josephine", 21, true, 'b'),
new student("Kasper", 22, false, 'b'),
new Student("Bo", 23, false, 'b'),
new Student("Ib", 24, false, 'b'),
new Student("Brian", 27, 'b'),
new Student("Mathilde", 29, true, 'b'),
new Student("Lisa", 32, true, 'b')
};
public static String findName(Student[]stuName, int stuNum){
return stuName[stuNum].name

}

}
