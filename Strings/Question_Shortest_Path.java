public class Question_Shortest_Path {
    public static float getShortestPath(String str){
        int x =0, y=0;
        for(int i =0; i<str.length(); i++){
            char dir = str.charAt(i);
            if(dir =='S'){
                y --;
            }else if(dir == 'N'){
                y++;
            }else if(dir == 'W'){
                x--;
            }else{
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str = "NS";
        System.out.println(getShortestPath(str));
    }
}
