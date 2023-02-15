import java.util.*;
import java.io.*;
class Data {
    String lang, ip, ts;
    void setData(String lang, String ip, String ts) {
        this.lang = lang;
        this.ip = ip;
        this.ts = ts;
    }
}
public class test6b {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileReader fr = new FileReader("logfile.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        List<Data> al = new ArrayList<Data>();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\s+");
            Data d = new Data();
            d.setData(arr[0], arr[1], arr[2]);
            al.add(d);
        }
        for (int i = 0; i < al.size(); i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if ((al.get(i).ip).equals(al.get(j).ip)) al.remove(j);
                else if (Math.abs(Long.parseLong(al.get(i).ts) - Long.parseLong(al.get(j).ts)) > 20000) al.remove(j);
            }
        }
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        for (int i = 0; i < al.size(); i++) {
            String lang = al.get(i).lang;
            if (map.containsKey(lang)) map.put(lang, map.get(lang) + 1);
            else map.put(lang, 1);
        }
        for (String key : map.keySet()) System.out.println(key + " " + map.get(key));
        sc.close();
        br.close();
    }
}