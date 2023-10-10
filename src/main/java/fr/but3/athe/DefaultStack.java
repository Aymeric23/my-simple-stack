package fr.but3.athe;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Classe par défaut d'une stack.
 */
public final class DefaultStack implements SimpleStack {
    /**
     * Liste d'item.
     */
    private List<Item> stack = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(final Item item) {
        stack.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get( stack.size() - 1 );
    }

    @Override
    public Item pop() throws EmptyStackException {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove( stack.size() - 1 );
    }
}
