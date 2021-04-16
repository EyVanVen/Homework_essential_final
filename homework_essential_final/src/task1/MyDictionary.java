package task1;

import java.util.List;

public class MyDictionary implements IDictionary{

    private int couplesMade;

    @Override
    public void coupleMaker(Object key, Object value, List list) {
        try{
        if (list.size() == 0){

            for(int i = 0; i < (int)key; i++){
                list.add(0);
            }

        } else if ((int)key > list.size()){

            for(int i = list.size(); i < (int)key; i++){
                list.add(i,0);
            }

        }




            couplesMade++;
        list.add((int) key, value);

        } catch (Exception e){
            System.out.println("Error: key is nat a number");
        }
    }

    @Override
    public Object getIndex(Object key, List list) {
        return list.get((int)key);
    }

    @Override
    public int getCoupleNum(List list) {
        return couplesMade;
    }
}
