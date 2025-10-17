package com.xinyang.leetcode;

public class test622 {
}


class MyCircularQueue {
    int front;
    int rear;
    int size;
    int []arr;
    public MyCircularQueue(int k) {
        arr=new int[k];
        front=0;
        rear=-1;
        size=0;//已经存的数据量
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        rear=(rear+1)%arr.length;
        arr[rear]=value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        arr[front]=0;
        front=(front+1)%arr.length;
        size--;
        return true;
    }

    public int Front() {
        if(isEmpty())return -1;
        return arr[front];
    }

    public int Rear() {
        if(isEmpty())return -1;
        return arr[rear];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size==arr.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */