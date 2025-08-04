public class CeilTheFloor {
    
    public static void main(String[] args) {
        
        int arr[] = {5, 6, 8, 9, 6, 5, 5, 6};
        int x =7;

        int res[] = new int[2];
        int floor = Integer.MIN_VALUE, ceil = Integer.MAX_VALUE;

        for(int i=0;i<arr.length ;i++){
            if(arr[i]>=x){
                ceil = Math.min(arr[i],ceil);
            }
            if(arr[i]<=x){
                floor = Math.max(arr[i], floor);
            }
        }

        res[0] = (floor == Integer.MIN_VALUE) ? -1 : floor;
        res[1] = (floor == Integer.MAX_VALUE) ? -1 : ceil;

        for(int i=0;i<2;i++){
            System.out.print(res[i]+" ");
        }
    
    }
}
