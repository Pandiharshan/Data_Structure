import java.util.*;

class ItemNode{
    double val;
    double wt;
    public ItemNode(double val,double wt){
        this.val=val;
        this.wt=wt;
    }
}

class Solution 
{
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) 
    {
        int n=val.length;
        ItemNode[] arr=new ItemNode[n];
        for(int i=0;i<val.length;i++){
            arr[i]=new ItemNode(val[i],wt[i]);
        }
        Arrays.sort(arr,(a,b)->Double.compare((b.val/b.wt),(a.val/a.wt)));
        int i=0;
        double cost=0;
        while(capacity >0 && i<n){
            if(arr[i].wt <= capacity){
                capacity-=arr[i].wt;
                cost+=arr[i].val;
            }
            else{
                cost+=capacity*(arr[i].val/arr[i].wt);
                capacity=0;
            }
            i++;
        }
        return cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] val = new int[n];
        int[] wt = new int[n];

        for(int i=0;i<n;i++){
            val[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            wt[i] = sc.nextInt();
        }

        int capacity = sc.nextInt();

        Solution obj = new Solution();
        double ans = obj.fractionalKnapsack(val, wt, capacity);
        System.out.println(ans);

        sc.close();
    }
}
