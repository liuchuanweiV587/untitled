import java.util.ArrayList;
import java.util.List;

/**
 * @author chuanwei.liu
 * @date 2023/4/28 10:16
 */
public class YH {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

            int ceng = 0;
            int numRow = numRows;
            for (int i = 1; numRows>0; i++) {
                //判断几层
                numRows=numRows-i;
                ceng++;
            }
            //对层遍历
        for (int i = 0; i < ceng; i++) {
            List<Integer> cenglist = new ArrayList<>();
          //  cenglist.add(1);
            for (int j = 0; j <= i; j++) {
                if (numRow ==0){
                    break;
                }
                if (j==0 || j== i){
                 cenglist.add(1);
                    numRow--;
                }else{
                    cenglist.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                    numRow--;
                }
            }

            list.add(cenglist);
        }

        return list;
    }
}
