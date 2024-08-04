public class OppsInJava {
    public static void main(String[] args) {
        MarutiSuzuki car1=new MarutiSuzuki();//i have created one instance of a class 
        car1.average("one hundered kilometer");
        System.out.println(car1.average);


    }
}

class MarutiSuzuki {
    String average;//this are the properties
    int weight;
    
    void average(String avg){
        average=avg;
    }


    
}
