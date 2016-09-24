package com.edu.queues;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class PriorityQueueTest {

    @Test
    public void checkQueueTypes() throws Exception {
        Queue<String> queue1 = new ArrayBlockingQueue<>(2);
        Queue<String> queue2 = new ConcurrentLinkedQueue<>();
        Queue<String> queue3 = new LinkedBlockingQueue<>();
        Queue<String> queue4 = new PriorityBlockingQueue<>();
        Queue<String> queue5 = new PriorityQueue<>();
        Queue<String> queue6 = new SynchronousQueue<>();
        Queue<String> queue7 = new ArrayDeque<>();
        Queue<String> queue8 = new LinkedList<>();
    }

    @Test
    public void verify() throws Exception {
        Queue<Customer> priorityQueue = new PriorityQueue<>(idComparator);

        String stringA = "AA";
        System.out.println(stringA.hashCode());

        final Customer c1 = new Customer(1, "NameA");
        System.out.println(c1.getName().hashCode());
        final Customer c2 = new Customer(2, "NameB");
        System.out.println(c2.getName().hashCode());

        final Customer c3 = new Customer(3, "NameC");
        final Customer c4 = new Customer(4, "NameD");
        final Customer c5 = new Customer(5, "NameE");

        priorityQueue.add(c5);
        priorityQueue.add(c3);
        priorityQueue.add(c2);
        priorityQueue.add(c1);
        priorityQueue.add(c4);

        System.out.println(priorityQueue.peek().getId());
        priorityQueue.poll();
        System.out.println(priorityQueue.peek().getId());
    }

    public static Comparator<Customer> idComparator = (o1, o2) -> o2.getId() - o1.getId();

    public static Comparator<Customer> idComparator1 = new Comparator<Customer>() {
        @Override
        public int compare(final Customer o1, final Customer o2) {
            return o2.getId() - o1.getId();
        }
    };

    private class Customer {
        private int id;
        private String name;

        private Customer(final int id, final String name) {
            this.id = id;
            this.name = name;
        }

        private int getId() {
            return id;
        }

        private String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Customer customer = (Customer) o;

            return id == customer.id && (name != null ? name.equals(customer.name) : customer.name == null);
        }

        @Override
        public int hashCode() {
            int result = id;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }

}
