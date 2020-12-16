public class ArrayProcessor <T>  {

    public T [] array;

    public ArrayProcessor(Integer[] arr) {
        array= (T[]) arr;
    }


    public void process(ElementProcessor elementProcessor){

        for (T t : array) {
            elementProcessor.run(t);

        }

    }




}
