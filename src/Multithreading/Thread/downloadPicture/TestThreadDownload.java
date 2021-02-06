package Multithreading.Thread.downloadPicture;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThreadDownload extends Thread{

    private String url;
    private String name;
    public TestThreadDownload(String url, String name){
        this.url = url;
        this.name = name;
    }
    @Override
    public void run() {
        WebDownloader wd = new WebDownloader();
        try {
            wd.downloader(url, name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("下载文件名为: " + name);
    }

    public static void main(String[] args){
        TestThreadDownload t1 = new TestThreadDownload("https://img-blog.csdn.net/20170803112501394?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHlubl9LdW4=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast","1.jpg");
        TestThreadDownload t2 = new TestThreadDownload("https://tse3-mm.cn.bing.net/th/id/OIP.Ogv6qqXdo6wwSLqcFDzRJwHaE7?w=265&h=180&c=7&o=5&dpr=1.25&pid=1.7","2.jpg");
        TestThreadDownload t3 = new TestThreadDownload("https://th.bing.com/th/id/R051691e67d50c89cff071a9a3b71213a?rik=9HGl9CSKUqEF%2bA&riu=http%3a%2f%2fn.sinaimg.cn%2ftransform%2f20151025%2f8A6G-fxizwsi5589061.jpg&ehk=WdEWkQI5xYXrH8PMzM8gNwURNgQA4zpkujNPd9zq4mw%3d&risl=&pid=ImgRaw","3.jpg");
        t1.start();
        t2.start();
        t3.start();
    }
}


class WebDownloader{

    // 构造方法
    public void downloader(String url, String name) throws IOException {
        try {
            //
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader出现问题");
        }
    }
}
