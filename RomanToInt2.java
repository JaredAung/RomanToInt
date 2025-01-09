import java.util.HashMap;
import java.util.Map;

public class RomanToInt2 {
    public int romantoInt2(String s){
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int total = 0;
        int prev = 0;//XIV
        for(int i = s.length()-1; i >= 0; i--){
            char current = s.charAt(i);
            if(map.get(current) < prev){
                total -= map.get(current);
            }
            else{
                total += map.get(current);
            }
            prev = map.get(current);
        }
        return total;
    }

    public static void main(String[] args) {
        RomanToInt2 roman = new RomanToInt2();
        int x = roman.romantoInt2("LVIII");
        System.out.println(x);
    }
}
