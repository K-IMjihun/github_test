import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 1;
        String collection = sc.next();
        sc.nextLine();        //next의 개행문자 읽기
        String recipeName = sc.nextLine();

        //List 사용 시
        if(collection.equals("List")){
            List<String> lists = new ArrayList<>();
            while(true){
                String recipe = sc.nextLine();
                if(recipe.equals("끝")){
                    break;
                }
                else{
                    lists.add(recipe);
                }
            }
            System.out.println("[ " + collection + " 으로 저장된 " + recipeName + " ]");
            for(String list : lists){
                System.out.println(number + ". " + list);
                number++;
            }
        }
        //Set 사용 시
        else if(collection.equals("Set")){
            Set<String> sets = new HashSet<>();
            while(true){
                String recipe = sc.nextLine();
                if(recipe.equals("끝")){
                    break;
                }
                else{
                    sets.add(recipe);
                }
            }
            System.out.println("[ " + collection + " 으로 저장된 " + recipeName + " ]");
            for(String set : sets){
                System.out.println(number + ". " + set);
                number++;
            }
        }
    }
}