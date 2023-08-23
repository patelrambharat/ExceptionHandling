public class Main {
    public static void main(String[] args) {

//        ``1. compile time exception --> checked Exception
//                exp => SQL Exception
        //2. Runtime Exception --> unchecked Exception
//        a--> ArithmeticException
//                b--> ArrayIndexOutOfBoundsException
//                        c--> NullPointerException
//                                d--> NoSuchElementException

        //Types of Programming Statements in java
        //1. Normal Statements
        //2. Critical Statements
        //1. --> Normal Statements --> int a = 5;

        //2--> might or might not fail --> int c = a/b;

//        try {
//            Critical Statements can throw exception
//        }
//        int a = 5;
//        System.out.println(a);   //print 5
//        System.out.println("A");   //print a
//        int arr[] = {1, 2, 3, 4};
//
//        //why do we need to handle exception
////        int b = 5/0;    //arithmetic exception and code break after this
//        try{
////            int b = 5/0;     //critical change
////            System.out.println("C");
//            System.out.print(arr[2]+" "); //there is no exception so nothing to catch
//            System.out.println("C");
//            System.out.print(arr[5]+" ");  //there is arrayIndexoutOfBoundsException
//        }
//        catch (ArithmeticException e){
//            System.out.println("Idiot! you don't know maths...." + e.getLocalizedMessage());   //it will print --> idiot! you
//
//        }
//        catch (Exception e){
//            System.out.println("Idiot! you don't know the indexing..." +e.getMessage());
//        }
//        //Note --> once the exception is handled we no need to handle anything else
//        //Note 2--> I can never catch a parent exception before the child exception
//        //exp --> catch(Exception e) catch(ArithmeticException e)
//        System.out.println("B");   //print b


        //smalll but the super important thing
        //finally --> no matter even if the word stops finally will definately be eveluate
        //let's say you are using ATM --> functionality --> gave card and enter pin
        //finally me jo bhi code likhoge wo jarur run krega no matter whether your code is worked or not
        //finally needs to have atleast one try
//        int a = 5;
//        System.out.println("a");
//        try{
//            int c = 6/0;
//            System.out.println("B");
//            System.out.println("E");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Arithmetic Exception");
//        }
//        finally {
//
//            System.out.println("C");  //no matter what's happen but finally will run
//        }
//        System.out.println("D");
//        int age = 17;
//        try {
//            if (age < 18) {
////                throw new RuntimeException("You are under age!!!");
//                throw new underAgeException("You are under age!!!");
//            }
//
//        }
        int age = 12;
        try {
            if (checkAge(17)) {
                System.out.println("Congrats! you have passed!!!");
            }

        } catch (Exception e) {
            System.out.println("Handled in parent");
        }
    }
    //it is mandatory to throws with compile time exception but optional with runtime

        public static  boolean checkAge(int age) throws ArithmeticException , UnderAgeException{
            if(age < 18){
                throw new UnderAgeException("You are under age !!!");
            }
            else{
                return true;
            }
        }
    }


