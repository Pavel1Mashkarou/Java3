import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Work1 {

    static ArrayList<Integer> fillArray(){
        ArrayList<Integer> list = new ArrayList<>();
        int sizeArray = new Random().nextInt(10,21);
        for (int i=0;i<sizeArray;i++){
            int num = new Random().nextInt(1,100);
            list.add(num);
        }
        return list;
    }

    static void printArray(ArrayList<Integer> list){
        StringBuilder builder =new StringBuilder();
        Iterator<Integer> iterator = list.iterator();
        builder.append('[');
        while(iterator.hasNext()){
            builder.append(iterator.next());
            if (iterator.hasNext()) builder.append(',');
        }
        builder.append(']');
        System.out.println(builder);
    }

    static void removeEvenElements(ArrayList<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next()%2==0){
                iterator.remove();
            }
        }
    }

    static Integer getMinElement(ArrayList<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        Integer minElement = iterator.next();
        while (iterator.hasNext()){
            Integer temp = iterator.next();
            if (minElement>temp){
                minElement = temp;
            }
        }
        return minElement;
    }

    static Integer getMaxElement(ArrayList<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        Integer maxElement = iterator.next();
        while (iterator.hasNext()){
            Integer temp = iterator.next();
            if (maxElement<temp){
                maxElement = temp;
            }
        }
        return maxElement;
    }

    static Float getAverage(ArrayList<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        Integer sum =0;
        while (iterator.hasNext()){
            sum = Integer.sum(sum, iterator.next());
        }
        Float average = (float)sum/(float)list.size();
        return average;
    }


    public static void main(String[] args) {
        //Пусть дан произвольный список целых чисел.
        ArrayList<Integer> list = fillArray();
        printArray(list);
        //1) Нужно удалить из него чётные числа
        removeEvenElements(list);
        printArray(list);
        //2) Найти минимальное значение
        System.out.println("Минимальное значение: "+ getMinElement(list));
        //3) Найти максимальное значение
        System.out.println("Минимальное значение: "+ getMaxElement(list));
        //4) Найти среднее значение
        System.out.println("Среднее значение: "+ getAverage(list));
    }

}
