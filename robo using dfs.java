/*Chitti(ROBO) is busy in turning the people into chittis(ROBOS) by surrounding them.
In a room there are n*n boxes occupied by ROBOS and people.
   1.A person will be turned into ROBO if he is surrounded by all ROBOs. 
   2.A person will not be turned into ROBO if he is on the edge of the room
     and all the connected people to him (directly or indirectly) are also not to be turned.
 Return the n*n boxes after conversion.
 
Input Format
-------------
Line-1:integer n represent the n*n boxes of the room..
Next n lines:Each line of string consists of combination of 'X'(represents ROBO) and 'O'(represents a person)
   
Output Format:
--------------
Print n*n space seperated values after conversion.
  
   
Sample Input-1:
---------------
4
XXXX
XOOX
XXOX
OXXX
   
Sample Output-1:
----------------
X X X X 
X X X X 
X X X X 
O X X X 
   
Explanation:
------------
The people at second row and third row are converted to ROBOs as they are surrounded by ROBOs.
But the person at fourth row is safe as he is on edge.
  
   
Sample Input-2:
---------------
5
XOOOX
XXXXX
XOXXX
XXXOX
OXXXX
  
Sample Output-2:
----------------
X O O O X 
X X X X X 
X X X X X 
X X X X X 
O X X X X 
*/
import java.util.*;
class Test{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            
                arr[i]=sc.nextLine();
            
        }
        char res[][]=new char[n][n];
        //res=helper(arr);
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                if(arr[i].charAt(j)=='O'){
                    arr[i]=arr[i].substring(0,j)+'X'+arr[i].substring(j+1,n);
                    helper(arr,i,j);
                }
            }
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i].charAt(j));
            }
            System.out.println();
        }
    }
    public static void helper(String[] arr,int r,int c){
        if(r>=1 && c>=1 && r<arr.length-2 && c<arr.length-2 && arr[r].charAt(c)!='O'){
            //arr[r].charAt(c)='X';
            //t++;
            return ;
        }
        helper(arr,r+1,c);
        helper(arr,r-1,c);
        helper(arr,r,c+1);
        helper(arr,r,c-1);
        //System.out.println(t);
    }
}