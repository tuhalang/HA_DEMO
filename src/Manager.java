import com.viettel.haframework.fw.ZkProcess;
import com.viettel.mmserver.agent.MmJMXServerSec;

public class Manager extends ZkProcess {

    private static Manager manager;
    private static Process process;

    public static void startManager(){
        process = new Process("process");
        manager = new Manager();
        manager.start();
    }

    public static void stopManager(){
        try {
            manager.stop();
        }catch (Exception e){
            e.printStackTrace();
        }
        MmJMXServerSec.getInstance().stop();
        process.stop();
    }

    @Override
    protected void doStart() {
        process.start();
    }

    @Override
    protected void doStop() {
        process.stop();
    }

    public static void main(String[] args) {
        Manager.startManager();
    }
}
