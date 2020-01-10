package com.example

import spock.lang.Specification
import spock.lang.Unroll


class CalculatorSpec extends Specification {
    @Unroll
    def "returns #c to add #a with #b"() {
        setup:
        def cut = new Calculator()

        expect:
        cut.add(a,b) == c

        where:
        c  | a  | b
        3  | 1  | 2
        0  | 1  | -1
    }

    @Unroll
    def "returns #c to subtract #b from #a"() {
        setup:
        def cut = new Calculator()

        expect:
        cut.subtract(a,b) == c

        where:
        c  | a  | b
        2  | 3  | 1
        0  | 1  | 1
        2  | 1  | -1
    }
}
