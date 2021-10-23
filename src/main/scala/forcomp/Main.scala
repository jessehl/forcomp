package forcomp


object Main extends App {
    // println(Anagrams.dictionaryByOccurrences.getOrElse(List(('a', 1), ('b', 2), ('y', 1)), "foo"))

    val input = List(('a', 5), ('b', 4), ('c',30), ('f',40))

    println(Anagrams.subtract(input, List(('a',1))))
    
}
