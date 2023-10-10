package fr.but3.athe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultStackTest {
    SimpleStack stack;

    @BeforeEach
    void beforeEach() {
        // Given new default empty stack
        stack = new DefaultStack();
    }

    @Test
    void isEmptyTest() {
        // expected stack is empty
        assertTrue(stack.isEmpty());
        // and the size of the stack is 0
        assertEquals(0, stack.getSize());
    }

    @Test
    void getSizeTest() {
        // When checking stack size
        int stackSize = stack.getSize();
        // Then assert if size is null
        assertEquals(0, stackSize);
    }

    @Test
    void pushItemTest() {
        // and an item
        DefaultItem item = new DefaultItem();
        // when we push the item
        stack.push(item);
        // then the stack is no more empty
        assertFalse(stack.isEmpty());
        // and the size of the stack is 1
        assertEquals(1, stack.getSize());
    }

    @Test
    void peekItemTest() {

    }

    @Test
    void popItemTest() {

    }
}