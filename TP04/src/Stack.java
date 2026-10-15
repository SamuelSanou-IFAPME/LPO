import java.util.Arrays;

public class Stack {

   private int[] tab;
   private int top = -1;
    public Stack(int taille){
        this.tab= new int[taille];
    }
    public boolean isFull(){

        return top == tab.length-1;


    }
    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Pile pleine");
            return;
        }
        top++;
        tab[top] = x;

        System.out.println("Push "+x);
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Pile vide");
            return;
        }
        int popped = tab[top];
        tab[top] = 0;
        top--;
        System.out.println("Pop " + popped);

    }
    public void display(){
        System.out.print("etat de la pile : [");
        for (int i = 0; i <= top; i++) {
            System.out.print(tab[i]);
            if (i < top) {
                System.out.print(", ");
            }
        }
        System.out.println("]");


    }
}
