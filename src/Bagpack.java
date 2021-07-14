public class Bagpack {

    Things[] baggage;
    int capacity;

    public Bagpack(Things[] baggage, int capacity) {
        this.baggage = baggage;
        this.capacity = capacity;
    }


    public Bagpack(Things[] baggage) {
        this.baggage = baggage;
    }

    int result(int i, int weight){
        if(i<0){
            return 0;
        }
        if(baggage[i].weight > weight){
            return result(i-1, weight);
        }else{
            return Math.max(result(i-1, weight), result(i-1, weight - baggage[i].weight) + baggage[i].price);
        }
    }
    
}
