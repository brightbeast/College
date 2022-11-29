class Item{
    int item;
    Item(){
        this.item=1;
    }
    public synchronized void produce() throws InterruptedException{
        if(item==1)
            this.wait();
        else{
            item=1;
            System.out.println("Producer:"+item);
            notifyAll();
        }
    }

    public synchronized void consume() throws InterruptedException{
        if(item==0){
            this.wait();
            System.out.println("Consumer is waiting");
        }
        else{
            item=0;
            System.out.println("Consumer:"+item);
            notifyAll();
        }
    }
}
public class ProducerConsumer1 {
    public static void main(String args[]){
        Item i=new Item();
        Producer p=new Producer(i);
        Consumer c=new Consumer(i);

        p.start();
        c.start();
    }
}

class Consumer extends Thread{
    Item i;
    Consumer(Item i){
        this.i=i;
    }
    public void run(){
        while(true){
            System.out.println("Consumer is running");
            try{
                i.consume();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }
}

class Producer extends Thread{
    Item i;
    Producer(Item i){
        this.i=i;
    }
    public void run(){
        while(true){
            System.out.println("Producer is running");
            try{
                i.produce();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }
}