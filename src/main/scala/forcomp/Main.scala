package forcomp


object Main extends App {
    println(Anagrams.dictionaryByOccurrences.getOrElse(List(('a', 1), ('b', 2), ('y', 1)), "foo"))
}
