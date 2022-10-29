package Project1;
public class Export{
    public static void main(String args[]){
        
    }
    public double exporting(String me, String mt, double val){
        double ans=-1;
        if(mt.equals(me))
        ans=val;
        else{
            switch(me){
            case "Indian Rupees":
            ans=val;
            break;

            case "US Dollar":
            ans=val/82.54;
            break;

            case "Euro":
            ans=val/81.37;
            break;

            default:
            System.out.println("Enter appropriate value");
            break;
            }
        }
        // System.out.println(ans);
        return ans;
    }
}