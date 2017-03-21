package examples.six

import javaslang.Tuple
import javaslang.Tuple2
import li.chee.reactive.plumber.Plumbing

abstract class Tools extends Plumbing {

    static input = just("you", "world")

    static FIRST = 0
    static SECOND = 1

    static select(int pos) {
        return { Tuple tuple -> (Iterable)tuple.toSeq().get(pos)}
    }

    static process = {
        String s -> new Tuple2(Arrays.asList("hello "+s), Arrays.asList(1))
    }
}

