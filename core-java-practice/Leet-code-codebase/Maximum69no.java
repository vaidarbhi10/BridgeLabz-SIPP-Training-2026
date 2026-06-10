package Leet-code-codebase;

public class Maximum69no {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        char[] arr = str.toCharArray();
        for(int i =0; i<arr.length;i++){
            if(arr[i]== '6'){
                arr[i]='9';
                break;
            }

        }
        String new_r = new String(arr);
        int new_num = Integer.parseInt(new_r);
        return new_num;
    }
}
    
