import java.io.*;
import java.util.*;

class practical_25
{
    public static void main(String[] args) throws Exception
    {
        File f=new File("Demo.txt");
        BufferedReader br=new BufferedReader(new FileReader(f));
        StringBuffer buffer=new StringBuffer();
        String str;
        while((str=br.readLine())!=null){
        buffer.append(str);
        buffer.append(" ");
        }
        ArrayList list=new ArrayList();
        StringTokenizer st = new StringTokenizer(buffer.toString().toLowerCase());
                while(st.hasMoreTokens()) {
                        String s = st.nextToken();
                        list.add(s);
                }
        HashSet set = new HashSet(list);
        List arrayList = new ArrayList(set);
        Collections.sort(arrayList);
        for (Object ob : arrayList)
        System.out.println(ob.toString());
    }
}