package task1;

import java.util.List;

public interface IDictionary <TKey, TValue>{
    public void coupleMaker(TKey key, TValue value, List <Object> list);
    public Object getIndex(TKey key, List <Object> list);
    public int getCoupleNum(List <Object> list);
}
