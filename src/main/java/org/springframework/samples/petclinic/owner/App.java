package org.springframework.samples.petclinic.owner;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.BaseStream;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
		BigInteger a = BigInteger.valueOf(1);
        List.of(1, 2, 3)
                .stream()
                .map(BigInteger::valueOf)
                .forEach(System.out::println);

        Optional.of(1)
                .map(Math::incrementExact)
                .ifPresent(System.out::println);
    }
}

