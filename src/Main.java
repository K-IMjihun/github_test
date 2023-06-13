public class Main {
    public static void main(String[] args) {
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
    }
}