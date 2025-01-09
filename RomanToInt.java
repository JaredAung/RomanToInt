import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int total = 0;

        for(int i =s.length()-1; i >= 0;i--){
            char x = s.charAt(i);
            if(i != 0){
                char next = s.charAt(i-1);
                if (map.get(next) < map.get(x)){
                    total = total +map.get(x) - map.get(next);
                    i--;
                    continue;
                }
            }

            total += map.get(x);

        }


        return total;
    }

    public static void main(String[] args) {
        RomanToInt roman = new RomanToInt();
        int x = roman.romanToInt("VII");
        System.out.println(x);

    }
}
