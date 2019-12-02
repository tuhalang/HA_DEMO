import com.viettel.mmserver.base.ProcessThreadMX;

public class Process extends ProcessThreadMX {

    public Process(String threadName) {
        super(threadName);
    }

    @Override
    protected void process() {
        Long i=0l;
        while (true){
            System.out.println(i);
            i++;
        }
    }
}
