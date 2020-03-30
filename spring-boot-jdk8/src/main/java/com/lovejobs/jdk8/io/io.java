package com.lovejobs.jdk8.io;

import java.io.*;

public class io {

    private static String sourceUrl= "/Users/fengxin/study_code/spring-boot-personal/spring-boot-jdk8/src/main/java/com/lovejobs/jdk8/io/fengxin.text";
    private static String targetUrl= "/Users/fengxin/study_code/spring-boot-personal/spring-boot-jdk8/src/main/java/com/lovejobs/jdk8/io/fengxin1.text";

    private static String excleSourceUrl= "/Users/fengxin/study_code/spring-boot-personal/spring-boot-jdk8/src/main/java/com/lovejobs/jdk8/io/fengxin.xlsx";
    private static String excleStargetUrl= "/Users/fengxin/study_code/spring-boot-personal/spring-boot-jdk8/src/main/java/com/lovejobs/jdk8/io/fengxin1.xlsx";


    private static void testIo() throws Exception {
        InputStream inputStreamReader = new BufferedInputStream(new FileInputStream(excleSourceUrl));
        OutputStream outputStream =  new BufferedOutputStream(new FileOutputStream(excleStargetUrl));
        byte[] buf = new byte[1024];
        int len = 0;
        while((len=inputStreamReader.read(buf)) != -1) { //读取长度不为-1，继续读取
            outputStream.write(buf); //读取内容之后马上写入目标数据源
        }
        outputStream.flush();
        inputStreamReader.close();
        outputStream.close();

    }

    private static void testIo2() throws Exception {
        FileReader fileReader = new FileReader(new File(sourceUrl));
        FileWriter fileWriter = new FileWriter(new File(targetUrl));
        char[] buf = new char[1024];
        while(fileReader.read(buf)!= -1) { //读取长度不为-1，继续读取
            fileWriter.write(buf); //读取内容之后马上写入目标数据源
        }
        fileWriter.flush();
        fileWriter.close();
        fileReader.close();
    }

    private static void testIo4() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(excleSourceUrl));
        BufferedWriter bufferedWriter =  new BufferedWriter(new FileWriter(excleStargetUrl));
        String s = null;
        while (!(s = bufferedReader.readLine()).equals("")){
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();

    }

    public static String copyFile() throws IOException, ClassNotFoundException {
        File srcFile = new File(sourceUrl);//源文件数据源
        File desFile = new File(targetUrl);//写入到目标数据源
        //数据源不存在
        if(!srcFile.exists()) {
            throw new ClassNotFoundException("源文件或者拷贝目标文件地址不存在！");
        }
        //非文件类型
        if(!srcFile.isFile()) {
            return "源文件或者目标文件不是文件类型!";
        }
        InputStream is = null;
        OutputStream os = null;
        byte[] buf = new byte[1024];//缓存区
        int len = 0;//读取长度
        try {
            is = new BufferedInputStream(new FileInputStream(srcFile));//读取数据源
            os = new BufferedOutputStream(new FileOutputStream(desFile));//写入到数据源
            while((len = is.read(buf)) != -1) { //读取长度不为-1，继续读取
                os.write(buf); //读取内容之后马上写入目标数据源
            }
            os.flush();//输出
            return "文件拷贝成功！查看拷贝文件路径：" + desFile.getPath();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(is != null)
                is.close();
            if(os != null)
                os.close();
        }
        return "文件拷贝失败";
    }

    public static void main(String[] args) throws Exception {
        testIo();
    }
}
