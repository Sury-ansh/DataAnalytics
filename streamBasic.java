// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;
class Main {
    static class Customer{
        int customerID;
        List<Integer> transaction;
        Customer(int id,List<Integer> array){
            this.customerID=id;
            this.transaction=array;
        }
        @Override
        public String toString(){
            return "{"+customerID+": ["+transaction+"] }";
        }
    }
    static class CustomerSumm{
        int cid;
        int sum;
        CustomerSumm(int cid, int sum){
            this.cid=cid;
            this.sum=sum;
        }
        @Override
        public String toString(){
            return "{"+cid+" :"+" ("+sum+")}";
        }
    }
    public static void main(String[] args) {
        
        List<Customer> cList= new ArrayList<>();
        cList.add(new Customer(1,new ArrayList<>(Arrays.asList(5000,124323,543,76,887,443))));
        cList.add(new Customer(3,new ArrayList<>(Arrays.asList(6545,32423,1111,44343,65657))));
        System.out.println(cList);
        List<CustomerSumm> newClist=
        cList.stream().map(singleVariable->{
            int sum=singleVariable.transaction.stream().mapToInt(Integer::intValue).sum();
            return new CustomerSumm(singleVariable.customerID,sum);
        }).collect(Collectors.toList());
        System.out.println(newClist);
    }
}