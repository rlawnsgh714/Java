public class MyList extends ArrayList<String>{
    @Override
    public boolean add(String e){
        return true;
    }

    public static void main(String[] args){
        List<String> list = new MyList();

        list.add("red");
        list.add("pink");
        list.add("blue");
        list.add("black");
        list.add("yellow");

        for(String color : list){
            System.out.println(color);
        }
    }
}