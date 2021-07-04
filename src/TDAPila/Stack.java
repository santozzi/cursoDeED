package TDAPila;
/**
 * 
 * @author Sergio Antozzi
 *
 * @param <E>
 */
public interface Stack<E> {
   /**
    * Agrega un nuevo elemento a la pila
    * @param element
    */
   public void push(E element);
   /**
    * Devuelve el tamaño de la pila
    * @return
    */
   public int size();
   /**
    * Deveuelve verdadero si la pila esta vacia
    * @return
    */
   public boolean isEmpty();
   /**
    * Devuelve el último elemento ingresa en la pila,
    * lanza una excepción si la misma esta vacia
    * @return
    * @throws EmptyStackException
    */
   public E top() throws EmptyStackException;
   /* Devuelve el último elemento ingresa en la pila y lo elimina,
    * lanza una excepción si la misma esta vacia
    * @return
    * @throws EmptyStackException
    */
   public E pop() throws EmptyStackException;
   
}
