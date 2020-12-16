public class PrintIntElementProcessor implements ElementProcessor<Integer> {



    @Override
    public <T> void run(T object) {

        System.out.println(object);
    }




}

