package TDAPila;

public class ArrayStack<E> implements Stack<E> {
    protected int size;
    protected E[] pila;
    
    @SuppressWarnings("unchecked")
	public ArrayStack() {
    	size = 0;
    	pila = (E[]) new Object[10]; 
    }
    

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public E top() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException("La pila esta vacia: top()");
		}
		return pila[size-1];
	}

	@Override
	public E pop() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException("La pila esta vacia: pop()");
		}
		E element = pila[size-1];
		pila[size-1] = null;
		size--;
		return element;
		
	}

	@Override
	public void push(E element) {
		if(size==pila.length) {
			resize();
		}
		pila[size]=element;
		size++;
		
	}


	private void resize() {
	   @SuppressWarnings("unchecked")
	E[]  nuevaPila = (E[]) new Object[pila.length*2];
	for(int i=0;i <pila.length;i++) {
		nuevaPila[i] = pila[i];
	}   
	pila= nuevaPila;
		
	}

}
