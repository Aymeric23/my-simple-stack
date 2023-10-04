package fr.but3.athe;

import java.util.EmptyStackException;

/**
 * Classe d'une simple stack.
 */
public interface SimpleStack {
    /**
     * Tests if this stack is empty.
     * @return true if this stack is empty
     */
    boolean isEmpty();
    /**
     * @return the number of items in this stack.
     */
    int getSize();
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     * @param item item to push in stack
     */
    void push(Item item);
    /**
     * Looks at the object at the top of this stack without removing
     * it from the stack.
     * @throws EmptyStackException if this stack is empty.
     * @return item removing
     */
    Item peek() throws EmptyStackException;
    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     * @return item at the top of this stack
     */
    Item pop() throws EmptyStackException;
}
