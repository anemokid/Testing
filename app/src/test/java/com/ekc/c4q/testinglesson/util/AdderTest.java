package com.ekc.c4q.testinglesson.util;

import org.assertj.core.api.Java6Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by c4q on 1/30/18.
 */
public class AdderTest {

    // declare repeated "Given" conditions in @Before
    private Adder adder;

    @Before
    public void setUp(){
        adder = new Adder();

    }

    /**
     * - a good test should read like a sentence
     * - when & should
     */
    @Test
    public void add_whenOneInputIsZero_shouldReturnOtherNumber(){

        // Given :
        // Adder adder = new Adder();
        // this line was gotten rid of during the instantiation of the setUp method
        // under the Adder class


        // When:
        int result = adder.add(0,7);

        // Then:
        Java6Assertions.assertThat(result).isEqualTo(7);


    }

    /**
     * method 2:
     * - when & should :
     */
    @Test
    public void add_whenSecondInputIsZero_shouldReturnFirstNumber(){

        //Given:
        Adder adder = new Adder();

        // When:
        int result = adder.add(7,0);

        // Then:
        Java6Assertions.assertThat(result).isEqualTo(7);

    }

    /**
     * method 3:
     * - when & should:
     */
    @Test
    public void add_whenInputsAreNegative_shouldReturnNegativeNumber() {

        // given :
        Adder adder = new Adder();

        // when:
        int result = adder.add(-1, -4);

        // then:
        Java6Assertions.assertThat(result).isEqualTo(-5);

    }


    /**
     * method 4:
     * - when & should:
     */
    @Test
    public void add_whenInputsArePositive_shouldReturnPositiveNumber(){

        // given:
        Adder adder = new Adder();

        // when:
        int result = adder.add(3,3);

        // then:
        Java6Assertions.assertThat(result).isEqualTo(6);
    }

}