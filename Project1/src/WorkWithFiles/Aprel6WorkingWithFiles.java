package WorkWithFiles;

import java.io.*;
    import java.util.ArrayList;
    import java.util.HashMap;


    public class Aprel6WorkingWithFiles {
    public static void main(String[] args) throws IOException {



//        try {
//            FileWriter fw = new FileWriter("NewFile1.txt", true);
//            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
//            String w = sc.nextLine();
//            fw.write(w + "\n");
//            bw.write(w + "\n");
//            bw.close();
//            fw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader("NewFile.txt"));
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Error: " + e);
//        }
//        File file = new File("NewFile.txt");
//        BufferedReader br = new BufferedReader(new FileReader("NewFile.txt"));
//        ArrayList<String> mas = new ArrayList<>();
//
//        long lastmodified = file.lastModified();
//        Date date = new Date(lastmodified);
//        System.out.println(date);
//        System.out.println(file.length()+" MB");
//        System.out.println(file.length()/1024 + " KB");
//        System.out.println(file.length()/(1024*1024));
//        int i=0;
//        while(br.ready()){
//            mas.add(br.readLine());
//            System.out.println(mas.get(i));
//            i++;
//        }

//        BufferedReader br = new BufferedReader(new FileReader("NewFile.txt"));
//        String line;
//        String longest="";
//        while((line=br.readLine())!=null){
//            String[]s = line.split(" ");
//            for (int i = 0; i < s.length; i++) {
//                if(s[i].length()>longest.length()){
//                    longest=s[i];
//                }
//            }
//        }
//        System.out.println(longest);

//        File file = new File("Sentences.txt");
//        if (!file.exists())
//            file.createNewFile();
//
//        FileWriter fw = new FileWriter(file, true);
//        String s = sc.nextLine();
//        while(!s.equals("")){
//            fw.write(s+"\n");
//            s = sc.nextLine();
//        }
//        fw.close();
//        String word1 = sc.nextLine();
//        String word2 = sc.nextLine();
//
//        FileWriter fw = new FileWriter("File2.txt");
//        BufferedReader br = new BufferedReader(new FileReader("NewFile.txt"));
//        String line;
//        while((line=br.readLine())!=null){
//            String[] s = line.split(" ");
//            for (int i = 0; i < s.length; i++) {
//                if(s[i].toLowerCase().equals(word1.toLowerCase())){
//                    s[i]=word2;
//                }
//                fw.write(s[i]+" ");
//            }
//            fw.write("\n");
//        }
//        fw.close();

//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        BufferedReader br = new BufferedReader(new FileReader("NewFile.txt"));
//        String line;
//        while((line=br.readLine())!=null){
//            String[] s = line.split(",");
//                if(hashMap.containsKey(Integer.parseInt(s[0]))){
//                    hashMap.put(Integer.parseInt(s[0]), hashMap.get(Integer.parseInt(s[0]))+1);
//                }else{
//                    hashMap.put(Integer.parseInt(s[0]), 1);
//                }
//
//        }
//        System.out.println(hashMap);

//        BufferedReader br = new BufferedReader(new FileReader("NewFile.txt"));
//        String line;
//        int strCount=0;
//        int i=0;
//        while((line=br.readLine())!=null){
//            int symbolCount=0;
//            String[] s = line.split(" ");
//            System.out.println("Word count in string " + i + "=" + s.length);
//            for (int j = 0; j < s.length; j++) {
//                for (int k = 0; k < s[j].length(); k++) {
//                    symbolCount++;
//                }
//            }
//            System.out.println("Symbol count in string " + i + "=" + symbolCount);
//            strCount++;
//            i++;
//        }
//        System.out.println("Str count "+strCount);

//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("diyor");
//        list1.add("emir");
//        list1.add("djurat");
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(17);
//        list2.add(18);
//        list2.add(19);
//        HashMap<String, Integer> map1 = new HashMap<>();
//
//        int min = 1000;
//        int max = 0;
//
//        if(list1.size()==list2.size()){
//            String nameMin = "";
//            String nameMax = "";
//            for (int i = 0; i < list1.size(); i++) {
//                if(list2.get(i)<min){
//                    nameMin = list1.get(i);
//                    min = list2.get(i);
//                }else if(list2.get(i)>max){
//                    max = list2.get(i);
//                    nameMax = list1.get(i);
//                }
//
//
//                map1.put(list1.get(i), list2.get(i));
//            }
//            System.out.println(nameMin);
//            System.out.println(nameMax);
//            System.out.println(map1);
//        }









    }
}

