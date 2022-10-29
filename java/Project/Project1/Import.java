package Project1;
public class Import{
    public static void main(String args[]){

    }

    public double importing(String mt, double val){
        double ans=-1;
        switch(mt){
            case "Indian Rupees":
            ans=val;
            break;

            case "US Dollar":
            ans=val*82.54;
            break;

            case "Euro":
            ans=val*81.37;
            break;

            case "British Pound":
            ans=val*93.25;
            break;

            case "Australian Dollar":
            ans=val*52.40;
            break;

            case "Dinar":
            ans=val*266;
            break;

            default:
            System.out.println("Enter appropriate value");
        }
        return ans;
    }
}