package other.sources

/**
  * Created by rajanishivarajmaski1 on 3/20/17.
  * Learning Scala Chapter 6
  */
class CommonCollections {

  //list type
  def ListTypes(): Unit = {
    // an immutable singly linked list.

    //List[Int] = List(32, 95, 24, 21, 17)
    val numbers = List(32,34,51,21)
    //List[String] = List(red, green, blue)
    val colors = List("red", "green", "blue")

    println(s"I have ${colors.size} colors : $colors" )

    //Use the Lisp-style head() and tail() methods to access the first and remaining ele‐ ments of a list, respectively.
    //To access a single element directly, invoke the list as a func‐ tion and pass it the zero-based index of that element
  val first = numbers.head
    val last = numbers.tail

    var sum = 0;
    for (i <- numbers){
      sum += i
    }
    for (c <- colors){
      println(c)
    }

    //Scala’s collections use higher-order functions extensively to iterate,
    // map (convert a list item-by-item to a different list), reduce (fold a list into a single element),
    // and perform a wide range of other useful operations.
    //Here’s an example of the foreach(), map(), and reduce() higher-order functions avail‐ able in List and other collections.
    // Respectively, these functions iterate over the list, convert the list, and reduce the list down to a single item.
//foreach() takes a function (a procedure, to be accurate) and invokes it with every item in the list.
    colors.foreach(c => print(c))
    //map() takes a function that converts a single list element to another value and/or type.
    val sizes = colors.map(c => c.size)
    println(    sizes.mkString(" "))

  //reduce() takes a function that combines two list elements into a single element.
    val total = sizes.reduce((a:Int, b:Int)=> a+b)
    }


  //set A Set is an immutable and unordered collection of unique elements, but works similarly to List
  // unique: scala.collection.immutable.Set[Int] = Set(10, 20, 30)
  val unique = Set(10, 20, 30, 20, 20, 10)

//A Map is an immutable key-value store, also known as a hashmap, dictionary, or asso‐ ciative array in other languages. Values stored in a Map with a given unique key may be
val colorMap = Map("red" -> "r", "green" -> "g", "blue" -> "b")

  for(map <- colorMap){print(map)}

  //we can store any type in collections, instead of just numbers and strings.
  //we can create collection of collections.  //List[List[Int]]
  val oddEvenLists = List(List(2,4,6,8), List(1,3,5))

  //we can create tuples  List[(Char, Int])
  val tuplesList = List(('A', 65), ('B', 66), ('C'), 67)

//Creating a new, empty list will actually return Nil instead of a fresh instance. Because Nil is immutable, there is essentially no difference between it and a fresh, empty list instance.
  // Likewise, creating a new list that has a single entry just creates a single list element that points to Nil as its tail.
  val l: List[Int] = List()

  //cons :: operator There is an alternate way to construct lists that takes advantage of this relationship with Nil.
  // As another nod to Lisp, Scala supports use of the cons (short for construct) operator to build lists
  //Using Nil as a foundation and the right-associative cons operator :: for binding elements, you can build a list without using the traditional List(...) format.

  //Right-Associative Notation
  //All of the operators we have used so far in space-delimited operator notation have been left-associative in that they are invoked on the entity to their immediate left (e.g., 10 / 2).
    //In right-associative no‐ tation, triggered when operators end with a colon (:), operators are invoked on the entity to their immediate right.

  val numbers = 1 :: 2 :: 3 :: Nil

  //List Arithmetic
  // By “arithmetic,” a term I use loosely, I mean operations that add, remove, split, combine, and otherwise modify the organization of lists
  // without changing the list elements (i.e., their contents) themselves.
  // And of course by “modify” I mean “return a new list with the requested changes” because List is an immutable collection.
//flatten List(List(1, 2), List(3, 4)).flatten
  val flatList = oddEvenLists.flatten
//Combines two lists into a list of tuples of elements
  //at each index.
  val zipList = List(1,2,3) zip List("Red", "Blue", "Green")


  //high order functions used.
  val f = List(23,4,18,5) filter (_ > 18)
  //this is f : List[Int] = List(23,21)
  val p = List(1,2,3,4,5) partition (_ <3)
  // p : List(List[Int], List[Int]) = (List(1,2), List(3.4))

  val s = List("apple", "ball") sortBy (_.size)
  //s : List[String]  = List(ball, apple)
  //The sortBy method takes a function that returns a value for use in ordering the elements of the list, while the filter and partition methods each take a predicate function.
  // A predicate function takes an input value and returns either true or false. In the case of the partition function, the predicate uses placeholder syntax (see “Placeholder Syntax” on page 72) to return true if the input value is less than three and false otherwise.

  //An important point to make about these arithmetic methods is that ::, drop, and take act on the front of the list and thus do not have performance penalties. Recall that List is a linked list, so adding items to or removing items from its front does not require a full traversal.


  //Map lists
  //Map methods are those that take a function and apply it to every member of a list, collecting the results into a new list
  //mapping each item from one list to another list, so that the other list has the same size as the first but with different data or element types.

  //reduce list
  //shrink down all that work to a single value, an action known as reducing a list
  // They also support generic higher-order operations known as folds that you can use to create any other type of list reduction algorithm.

  val max : Int = f.max
  val forAllTest  = f.forall(_ <10)
}




/*
* Notes:
* A collections framework provides data structures for collecting one or more values of a given type such as arrays, lists, maps, sets, and trees.
* Scala has a high-performance, object-oriented, and type-parameterized collections framework just as Java does.
* However, Scala’s collections also have higher-order operations like map, filter, and reduce that make it possible to manage and manipulate data with short and expressive expressions.
* It also has separate mutable versus immutable collection type hierarchies, which make switching between immutable data (for stability) and mutable data (when necessary) convenient.
*The root of all iterable collections, Iterable, provides a common set of methods for (you guessed it) iterating through and manipulating collection data
*
*
* */