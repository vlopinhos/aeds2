import java.util.Scanner;

class Cell {

    public Cell next;
    public Count element;

    public Cell(Count element) {

        this.element = element;
        this.next = null;
    }

    public Cell() { this(null); }
}

class Stack {

    private Cell[] array;
    private Cell top;

    public Stack() { top = null; }

    public void insert(Count element) {

        Cell tmp = new Cell(element);

        tmp.next = top;
        top = tmp;
        tmp = null;
    }

    public int size() {

        int count = 0;
		for(Cell i = top; i != null; i = i.next) count++;
		return count;
	}

    public void print() {

        for(Cell i = top; i != null; i = i.next) System.out.println(i.element.c + " " + i.element.count);
	}

    private void swap(Cell i, Cell j) {

        Count temp = i.element;
        i.element = j.element;
        j.element = temp;
    }

    public void sort() { 
        
        array = new Cell[size()];

        int j = 0;

        for(Cell i = top; i != null; i = i.next, j++) array[j] = i;
    
        quicksort(0, size() - 1); 
    }
  
    private void quicksort(int esq, int dir) 
    {
        int i = esq, j = dir;

        Count pivo = array[(dir+esq)/2].element;
        
        while (i <= j) {

            while(array[i].element.count < pivo.count) i++;
            while(array[j].element.count > pivo.count) j--;

            if(i <= j) swap(array[i++], array[j--]);
        }
        
        if(esq < j) quicksort(esq, j);
        if(i < dir) quicksort(i, dir);
    }
}

class Count {

    public int c, count;

    public Count(int c, int count) {

        this.c = c;
        this.count = count;
    }
}

class Main {

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
    
        while(scnr.hasNext()) {

            String line = scnr.nextLine();
            int[] count = new int[300];
            
            for(int i = 0; i < line.length(); i++) count[(int)line.charAt(i) - 32]++;

            Stack pilha = new Stack();

            for(int i = 0; i < count.length; i++) {

                if(count[i] > 0) {

                    Count letra = new Count(i + 32, count[i]);

                    pilha.insert(letra);
                }
            }

            pilha.sort();
            pilha.print();

            if(scnr.hasNext()) System.out.println(" ");
        }

        scnr.close();
    }
}