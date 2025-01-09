import java.lang.management.ManagementFactory;

public class Main {

    public static String[] getData(){
        String[] data = new String[3];

            data[0] = "CPULOAD: " + ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getCpuLoad();
            data[1] = "PROCESSCPULOAD: " + ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getProcessCpuLoad();
            data[2] = "LOADAVERAGE: " + ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getSystemLoadAverage();

        return data;
        }

        public static void main(String[] args) {
            for (int i = 0; i < getData().length; i++){
                System.out.println(getData()[i]);
            }
    }
}

