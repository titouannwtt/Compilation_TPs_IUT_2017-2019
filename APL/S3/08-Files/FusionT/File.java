public class File<E> implements AbstractQueue<E> {
    private int head = 0;
    private int queue;
    private int size;
    private boolean empty = true;
    private List<E> file;

    // si head=queue et empty = false alors la file est pleine
    // alors que si head=queue et empty = true alors la file est vide
    public File(int size) {
        this.size = size;
        this.file = new LinkedList<E>();
    }

    @Override
    public boolean add(E e) {
        file.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {

    }

    @Override
    public void clear() {
        while (!empty) {
            remove();
        }
    }

    @Override
    public E element() {

    }

    @Override
    public E remove() {
        E res = file.remove();
        if (head == queue) {
            this.empty = true;
        }
        return res;
    }

    @Override
    public boolean isEmpty() {
        return this.empty;
    }

}