import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {

        this.noteMap = new HashMap<String, Integer>();
        this.magazineMap = new HashMap<String, Integer>();
        
        Integer occurences;
        
        for(String s : magazine.split("[^a-zA-Z]+")) {
            occurences = magazineMap.get(s);
            
            if(occurences == null) {
                magazineMap.put(s, 1);
            }
            
            else { magazineMap.put(s, occurences + 1); }
        }
        
        for(String s : note.split("[^a-zA-Z]+")) {
            occurences = noteMap.get(s);
            
            if(occurences == null) {
                noteMap.put(s, 1);
            }
            
            else {noteMap.put(s, occurences + 1); }
        }
           
    }
    
    public boolean solve() {
        boolean canReplicate = true;
        for(String s : noteMap.keySet()) {
            if(!magazineMap.containsKey(s) || (magazineMap.get(s) < noteMap.get(s))) {
                return canReplicate = false;
            }
        }
        
        return canReplicate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
